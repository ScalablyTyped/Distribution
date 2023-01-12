package typings.editly.mod

import typings.editly.editlyStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Audio layers will be mixed together.
	 * If `cutFrom`/`cutTo` is set, the resulting segment (`cutTo`-`cutFrom`) will be slowed/sped-up to fit `clip.duration`.
	 * The slow down/speed-up operation is limited to values between `0.5x` and `100x`.
	 */
trait AudioLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Time value to cut from (in seconds).
  		 *
  		 * @default 0
  		 */
  var cutFrom: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Time value to cut to (in seconds).
  		 * Defaults to `clip.duration`.
  		 */
  var cutTo: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Relative volume when mixing this audio track with others.
  		 *
  		 * @default 1
  		 */
  var mixVolume: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Path to audio file.
  		 */
  var path: String
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_AudioLayer: audio
}
object AudioLayer {
  
  inline def apply(path: String): AudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[AudioLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioLayer] (val x: Self) extends AnyVal {
    
    inline def setCutFrom(value: Double): Self = StObject.set(x, "cutFrom", value.asInstanceOf[js.Any])
    
    inline def setCutFromUndefined: Self = StObject.set(x, "cutFrom", js.undefined)
    
    inline def setCutTo(value: Double): Self = StObject.set(x, "cutTo", value.asInstanceOf[js.Any])
    
    inline def setCutToUndefined: Self = StObject.set(x, "cutTo", js.undefined)
    
    inline def setMixVolume(value: Double | String): Self = StObject.set(x, "mixVolume", value.asInstanceOf[js.Any])
    
    inline def setMixVolumeUndefined: Self = StObject.set(x, "mixVolume", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
