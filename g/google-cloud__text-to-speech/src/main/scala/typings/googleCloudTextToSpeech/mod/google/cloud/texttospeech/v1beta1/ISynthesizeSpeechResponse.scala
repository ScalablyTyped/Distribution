package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechResponse. */
trait ISynthesizeSpeechResponse extends StObject {
  
  /** SynthesizeSpeechResponse audioConfig */
  var audioConfig: js.UndefOr[IAudioConfig | Null] = js.undefined
  
  /** SynthesizeSpeechResponse audioContent */
  var audioContent: js.UndefOr[Uint8Array | String | Null] = js.undefined
  
  /** SynthesizeSpeechResponse timepoints */
  var timepoints: js.UndefOr[js.Array[ITimepoint] | Null] = js.undefined
}
object ISynthesizeSpeechResponse {
  
  inline def apply(): ISynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechResponse]
  }
  
  extension [Self <: ISynthesizeSpeechResponse](x: Self) {
    
    inline def setAudioConfig(value: IAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setAudioContent(value: Uint8Array | String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    inline def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
    
    inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
    
    inline def setTimepoints(value: js.Array[ITimepoint]): Self = StObject.set(x, "timepoints", value.asInstanceOf[js.Any])
    
    inline def setTimepointsNull: Self = StObject.set(x, "timepoints", null)
    
    inline def setTimepointsUndefined: Self = StObject.set(x, "timepoints", js.undefined)
    
    inline def setTimepointsVarargs(value: ITimepoint*): Self = StObject.set(x, "timepoints", js.Array(value :_*))
  }
}
