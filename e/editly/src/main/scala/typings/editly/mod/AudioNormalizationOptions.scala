package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * You can enable audio normalization of the final output audio.
	 * This is useful if you want to achieve Audio Ducking (e.g. automatically lower volume of all other tracks when voice-over speaks).
	 *
	 * @see [Dynaudnorm]{@link https://ffmpeg.org/ffmpeg-filters.html#dynaudnorm}
	 * @see [Example of audio ducking]{@link https://github.com/mifi/editly/blob/master/examples/audio2.json5}
	 */
trait AudioNormalizationOptions extends StObject {
  
  /**
  		 * Enable audio normalization?
  		 *
  		 * @default false
  		 * @see [Audio normalization]{@link https://github.com/mifi/editly#audio-normalization}
  		 */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Audio normalization gauss size.
  		 *
  		 * @default 5
  		 * @see [Audio normalization]{@link https://github.com/mifi/editly#audio-normalization}
  		 */
  var gaussSize: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Audio normalization max gain.
  		 *
  		 * @default 30
  		 * @see [Audio normalization]{@link https://github.com/mifi/editly#audio-normalization}
  		 */
  var maxGain: js.UndefOr[Double] = js.undefined
}
object AudioNormalizationOptions {
  
  inline def apply(): AudioNormalizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNormalizationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioNormalizationOptions] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setGaussSize(value: Double): Self = StObject.set(x, "gaussSize", value.asInstanceOf[js.Any])
    
    inline def setGaussSizeUndefined: Self = StObject.set(x, "gaussSize", js.undefined)
    
    inline def setMaxGain(value: Double): Self = StObject.set(x, "maxGain", value.asInstanceOf[js.Any])
    
    inline def setMaxGainUndefined: Self = StObject.set(x, "maxGain", js.undefined)
  }
}
