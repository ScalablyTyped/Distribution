package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingDetectIntentRequest. */
trait IStreamingDetectIntentRequest extends StObject {
  
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** StreamingDetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  
  /** StreamingDetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.undefined
  
  /** StreamingDetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.undefined
  
  /** StreamingDetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** StreamingDetectIntentRequest singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
}
object IStreamingDetectIntentRequest {
  
  inline def apply(): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
  
  extension [Self <: IStreamingDetectIntentRequest](x: Self) {
    
    inline def setInputAudio(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "inputAudio", value.asInstanceOf[js.Any])
    
    inline def setInputAudioNull: Self = StObject.set(x, "inputAudio", null)
    
    inline def setInputAudioUndefined: Self = StObject.set(x, "inputAudio", js.undefined)
    
    inline def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setQueryInput(value: IQueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputNull: Self = StObject.set(x, "queryInput", null)
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: IQueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    inline def setSingleUtteranceNull: Self = StObject.set(x, "singleUtterance", null)
    
    inline def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
  }
}
