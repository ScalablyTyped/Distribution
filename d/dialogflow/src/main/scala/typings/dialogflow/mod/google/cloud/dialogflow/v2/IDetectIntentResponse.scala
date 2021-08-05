package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.rpc.IStatus
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DetectIntentResponse. */
trait IDetectIntentResponse extends StObject {
  
  /** DetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** DetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  
  /** DetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  
  /** DetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /** DetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}
object IDetectIntentResponse {
  
  inline def apply(): IDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetectIntentResponse]
  }
  
  extension [Self <: IDetectIntentResponse](x: Self) {
    
    inline def setOutputAudio(value: Uint8Array | String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioNull: Self = StObject.set(x, "outputAudio", null)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: IQueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultNull: Self = StObject.set(x, "queryResult", null)
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setWebhookStatus(value: IStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    inline def setWebhookStatusNull: Self = StObject.set(x, "webhookStatus", null)
    
    inline def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
