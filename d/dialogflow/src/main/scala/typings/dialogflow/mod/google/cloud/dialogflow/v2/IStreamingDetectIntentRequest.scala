package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StreamingDetectIntentRequest. */
trait IStreamingDetectIntentRequest extends StObject {
  
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
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
  
  @scala.inline
  def apply(): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
  
  @scala.inline
  implicit class IStreamingDetectIntentRequestMutableBuilder[Self <: IStreamingDetectIntentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputAudio(value: Uint8Array | String): Self = StObject.set(x, "inputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAudioNull: Self = StObject.set(x, "inputAudio", null)
    
    @scala.inline
    def setInputAudioUndefined: Self = StObject.set(x, "inputAudio", js.undefined)
    
    @scala.inline
    def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    @scala.inline
    def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    @scala.inline
    def setQueryInput(value: IQueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInputNull: Self = StObject.set(x, "queryInput", null)
    
    @scala.inline
    def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    @scala.inline
    def setQueryParams(value: IQueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionNull: Self = StObject.set(x, "session", null)
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUtteranceNull: Self = StObject.set(x, "singleUtterance", null)
    
    @scala.inline
    def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
  }
}
