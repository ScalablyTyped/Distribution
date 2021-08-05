package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.rpc.IStatus
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingDetectIntentResponse. */
trait IStreamingDetectIntentResponse extends StObject {
  
  /** StreamingDetectIntentResponse alternativeQueryResults */
  var alternativeQueryResults: js.UndefOr[js.Array[IQueryResult] | Null] = js.undefined
  
  /** StreamingDetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** StreamingDetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  
  /** StreamingDetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  
  /** StreamingDetectIntentResponse recognitionResult */
  var recognitionResult: js.UndefOr[IStreamingRecognitionResult | Null] = js.undefined
  
  /** StreamingDetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /** StreamingDetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}
object IStreamingDetectIntentResponse {
  
  inline def apply(): IStreamingDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentResponse]
  }
  
  extension [Self <: IStreamingDetectIntentResponse](x: Self) {
    
    inline def setAlternativeQueryResults(value: js.Array[IQueryResult]): Self = StObject.set(x, "alternativeQueryResults", value.asInstanceOf[js.Any])
    
    inline def setAlternativeQueryResultsNull: Self = StObject.set(x, "alternativeQueryResults", null)
    
    inline def setAlternativeQueryResultsUndefined: Self = StObject.set(x, "alternativeQueryResults", js.undefined)
    
    inline def setAlternativeQueryResultsVarargs(value: IQueryResult*): Self = StObject.set(x, "alternativeQueryResults", js.Array(value :_*))
    
    inline def setOutputAudio(value: Uint8Array | String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioNull: Self = StObject.set(x, "outputAudio", null)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: IQueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultNull: Self = StObject.set(x, "queryResult", null)
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setRecognitionResult(value: IStreamingRecognitionResult): Self = StObject.set(x, "recognitionResult", value.asInstanceOf[js.Any])
    
    inline def setRecognitionResultNull: Self = StObject.set(x, "recognitionResult", null)
    
    inline def setRecognitionResultUndefined: Self = StObject.set(x, "recognitionResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setWebhookStatus(value: IStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    inline def setWebhookStatusNull: Self = StObject.set(x, "webhookStatus", null)
    
    inline def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
