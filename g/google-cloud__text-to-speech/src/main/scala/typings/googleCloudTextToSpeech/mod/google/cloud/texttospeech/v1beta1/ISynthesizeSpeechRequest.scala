package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.TimepointType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechRequest. */
@js.native
trait ISynthesizeSpeechRequest extends StObject {
  
  /** SynthesizeSpeechRequest audioConfig */
  var audioConfig: js.UndefOr[IAudioConfig | Null] = js.native
  
  /** SynthesizeSpeechRequest enableTimePointing */
  var enableTimePointing: js.UndefOr[js.Array[TimepointType] | Null] = js.native
  
  /** SynthesizeSpeechRequest input */
  var input: js.UndefOr[ISynthesisInput | Null] = js.native
  
  /** SynthesizeSpeechRequest voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.native
}
object ISynthesizeSpeechRequest {
  
  @scala.inline
  def apply(): ISynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechRequest]
  }
  
  @scala.inline
  implicit class ISynthesizeSpeechRequestMutableBuilder[Self <: ISynthesizeSpeechRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioConfig(value: IAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    @scala.inline
    def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    @scala.inline
    def setEnableTimePointing(value: js.Array[TimepointType]): Self = StObject.set(x, "enableTimePointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTimePointingNull: Self = StObject.set(x, "enableTimePointing", null)
    
    @scala.inline
    def setEnableTimePointingUndefined: Self = StObject.set(x, "enableTimePointing", js.undefined)
    
    @scala.inline
    def setEnableTimePointingVarargs(value: TimepointType*): Self = StObject.set(x, "enableTimePointing", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: ISynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNull: Self = StObject.set(x, "input", null)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setVoice(value: IVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceNull: Self = StObject.set(x, "voice", null)
    
    @scala.inline
    def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
