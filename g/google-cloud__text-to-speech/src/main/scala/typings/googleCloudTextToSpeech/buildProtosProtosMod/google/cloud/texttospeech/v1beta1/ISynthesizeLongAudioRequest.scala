package typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeLongAudioRequest. */
trait ISynthesizeLongAudioRequest extends StObject {
  
  /** SynthesizeLongAudioRequest audioConfig */
  var audioConfig: js.UndefOr[IAudioConfig | Null] = js.undefined
  
  /** SynthesizeLongAudioRequest input */
  var input: js.UndefOr[ISynthesisInput | Null] = js.undefined
  
  /** SynthesizeLongAudioRequest outputGcsUri */
  var outputGcsUri: js.UndefOr[String | Null] = js.undefined
  
  /** SynthesizeLongAudioRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** SynthesizeLongAudioRequest voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.undefined
}
object ISynthesizeLongAudioRequest {
  
  inline def apply(): ISynthesizeLongAudioRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeLongAudioRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISynthesizeLongAudioRequest] (val x: Self) extends AnyVal {
    
    inline def setAudioConfig(value: IAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setInput(value: ISynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutputGcsUri(value: String): Self = StObject.set(x, "outputGcsUri", value.asInstanceOf[js.Any])
    
    inline def setOutputGcsUriNull: Self = StObject.set(x, "outputGcsUri", null)
    
    inline def setOutputGcsUriUndefined: Self = StObject.set(x, "outputGcsUri", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setVoice(value: IVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceNull: Self = StObject.set(x, "voice", null)
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
