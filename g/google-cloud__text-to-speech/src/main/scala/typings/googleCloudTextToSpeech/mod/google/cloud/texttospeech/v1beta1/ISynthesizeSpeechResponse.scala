package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechResponse. */
@js.native
trait ISynthesizeSpeechResponse extends StObject {
  
  /** SynthesizeSpeechResponse audioConfig */
  var audioConfig: js.UndefOr[IAudioConfig | Null] = js.native
  
  /** SynthesizeSpeechResponse audioContent */
  var audioContent: js.UndefOr[Uint8Array | String | Null] = js.native
  
  /** SynthesizeSpeechResponse timepoints */
  var timepoints: js.UndefOr[js.Array[ITimepoint] | Null] = js.native
}
object ISynthesizeSpeechResponse {
  
  @scala.inline
  def apply(): ISynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechResponse]
  }
  
  @scala.inline
  implicit class ISynthesizeSpeechResponseMutableBuilder[Self <: ISynthesizeSpeechResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioConfig(value: IAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfigNull: Self = StObject.set(x, "audioConfig", null)
    
    @scala.inline
    def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    @scala.inline
    def setAudioContent(value: Uint8Array | String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContentNull: Self = StObject.set(x, "audioContent", null)
    
    @scala.inline
    def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
    
    @scala.inline
    def setTimepoints(value: js.Array[ITimepoint]): Self = StObject.set(x, "timepoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimepointsNull: Self = StObject.set(x, "timepoints", null)
    
    @scala.inline
    def setTimepointsUndefined: Self = StObject.set(x, "timepoints", js.undefined)
    
    @scala.inline
    def setTimepointsVarargs(value: ITimepoint*): Self = StObject.set(x, "timepoints", js.Array(value :_*))
  }
}
