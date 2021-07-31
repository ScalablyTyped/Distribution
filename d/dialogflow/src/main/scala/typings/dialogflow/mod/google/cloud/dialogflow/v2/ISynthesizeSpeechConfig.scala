package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SynthesizeSpeechConfig. */
trait ISynthesizeSpeechConfig extends StObject {
  
  /** SynthesizeSpeechConfig effectsProfileId */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** SynthesizeSpeechConfig pitch */
  var pitch: js.UndefOr[Double | Null] = js.undefined
  
  /** SynthesizeSpeechConfig speakingRate */
  var speakingRate: js.UndefOr[Double | Null] = js.undefined
  
  /** SynthesizeSpeechConfig voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.undefined
  
  /** SynthesizeSpeechConfig volumeGainDb */
  var volumeGainDb: js.UndefOr[Double | Null] = js.undefined
}
object ISynthesizeSpeechConfig {
  
  @scala.inline
  def apply(): ISynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechConfig]
  }
  
  @scala.inline
  implicit class ISynthesizeSpeechConfigMutableBuilder[Self <: ISynthesizeSpeechConfig] (val x: Self) extends AnyVal {
    
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
    def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakingRateNull: Self = StObject.set(x, "speakingRate", null)
    
    @scala.inline
    def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
    
    @scala.inline
    def setVoice(value: IVoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceNull: Self = StObject.set(x, "voice", null)
    
    @scala.inline
    def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
    
    @scala.inline
    def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeGainDbNull: Self = StObject.set(x, "volumeGainDb", null)
    
    @scala.inline
    def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
  }
}
