package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AudioConfig. */
@js.native
trait IAudioConfig extends StObject {
  
  /** AudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.AudioEncoding * / any */ String) | Null
  ] = js.native
  
  /** AudioConfig effectsProfileId */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** AudioConfig pitch */
  var pitch: js.UndefOr[Double | Null] = js.native
  
  /** AudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.native
  
  /** AudioConfig speakingRate */
  var speakingRate: js.UndefOr[Double | Null] = js.native
  
  /** AudioConfig volumeGainDb */
  var volumeGainDb: js.UndefOr[Double | Null] = js.native
}
object IAudioConfig {
  
  @scala.inline
  def apply(): IAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAudioConfig]
  }
  
  @scala.inline
  implicit class IAudioConfigMutableBuilder[Self <: IAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(
      value: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.AudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsProfileIdNull: Self = StObject.set(x, "effectsProfileId", null)
    
    @scala.inline
    def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
    
    @scala.inline
    def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value :_*))
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchNull: Self = StObject.set(x, "pitch", null)
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakingRateNull: Self = StObject.set(x, "speakingRate", null)
    
    @scala.inline
    def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
    
    @scala.inline
    def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeGainDbNull: Self = StObject.set(x, "volumeGainDb", null)
    
    @scala.inline
    def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
  }
}
