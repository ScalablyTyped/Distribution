package typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AudioConfig. */
trait IAudioConfig extends StObject {
  
  /** AudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.AudioEncoding * / any */ String) | Null
  ] = js.undefined
  
  /** AudioConfig effectsProfileId */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** AudioConfig pitch */
  var pitch: js.UndefOr[Double | Null] = js.undefined
  
  /** AudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /** AudioConfig speakingRate */
  var speakingRate: js.UndefOr[Double | Null] = js.undefined
  
  /** AudioConfig volumeGainDb */
  var volumeGainDb: js.UndefOr[Double | Null] = js.undefined
}
object IAudioConfig {
  
  inline def apply(): IAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAudioConfig]
  }
  
  extension [Self <: IAudioConfig](x: Self) {
    
    inline def setAudioEncoding(
      value: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.texttospeech.v1.AudioEncoding * / any */ String)
    ): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    inline def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    inline def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
    
    inline def setEffectsProfileIdNull: Self = StObject.set(x, "effectsProfileId", null)
    
    inline def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
    
    inline def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value :_*))
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchNull: Self = StObject.set(x, "pitch", null)
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
    
    inline def setSpeakingRateNull: Self = StObject.set(x, "speakingRate", null)
    
    inline def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
    
    inline def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
    
    inline def setVolumeGainDbNull: Self = StObject.set(x, "volumeGainDb", null)
    
    inline def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
  }
}
