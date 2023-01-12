package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechRequest. */
trait ISynthesizeSpeechRequest extends StObject {
  
  /** SynthesizeSpeechRequest audioConfig */
  var audioConfig: js.UndefOr[IAudioConfig | Null] = js.undefined
  
  /** SynthesizeSpeechRequest input */
  var input: js.UndefOr[ISynthesisInput | Null] = js.undefined
  
  /** SynthesizeSpeechRequest voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.undefined
}
object ISynthesizeSpeechRequest {
  
  inline def apply(): ISynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISynthesizeSpeechRequest] (val x: Self) extends AnyVal {
    
    inline def setAudioConfig(value: IAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setInput(value: ISynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setVoice(value: IVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceNull: Self = StObject.set(x, "voice", null)
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
