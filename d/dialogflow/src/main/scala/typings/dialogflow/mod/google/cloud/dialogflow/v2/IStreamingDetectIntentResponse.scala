package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.rpc.IStatus
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingDetectIntentResponse. */
trait IStreamingDetectIntentResponse extends StObject {
  
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
  
  @scala.inline
  def apply(): IStreamingDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentResponse]
  }
  
  @scala.inline
  implicit class IStreamingDetectIntentResponseMutableBuilder[Self <: IStreamingDetectIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputAudio(value: Uint8Array | String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    @scala.inline
    def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    @scala.inline
    def setOutputAudioNull: Self = StObject.set(x, "outputAudio", null)
    
    @scala.inline
    def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    @scala.inline
    def setQueryResult(value: IQueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultNull: Self = StObject.set(x, "queryResult", null)
    
    @scala.inline
    def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    @scala.inline
    def setRecognitionResult(value: IStreamingRecognitionResult): Self = StObject.set(x, "recognitionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognitionResultNull: Self = StObject.set(x, "recognitionResult", null)
    
    @scala.inline
    def setRecognitionResultUndefined: Self = StObject.set(x, "recognitionResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    @scala.inline
    def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    @scala.inline
    def setWebhookStatus(value: IStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStatusNull: Self = StObject.set(x, "webhookStatus", null)
    
    @scala.inline
    def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
