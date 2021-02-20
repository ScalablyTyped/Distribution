package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DetectIntentRequest. */
@js.native
trait IDetectIntentRequest extends StObject {
  
  /** DetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | String | Null] = js.native
  
  /** DetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.native
  
  /** DetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.native
  
  /** DetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.native
  
  /** DetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.native
}
object IDetectIntentRequest {
  
  @scala.inline
  def apply(): IDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetectIntentRequest]
  }
  
  @scala.inline
  implicit class IDetectIntentRequestMutableBuilder[Self <: IDetectIntentRequest] (val x: Self) extends AnyVal {
    
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
  }
}
