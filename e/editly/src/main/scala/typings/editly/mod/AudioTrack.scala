package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see [Arbitrary audio tracks]{@link https://github.com/mifi/editly#arbitrary-audio-tracks}
	 */
trait AudioTrack extends StObject {
  
  /**
  		 * Time value to cut source file from (in seconds).
  		 *
  		 * @default 0
  		 */
  var cutFrom: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Time value to cut source file to (in seconds).
  		 */
  var cutTo: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Relative volume for this track.
  		 *
  		 * @default 1
  		 */
  var mixVolume: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * File path for this track.
  		 */
  var path: String
  
  /**
  		 * How many seconds into video to start this audio track.
  		 *
  		 * @default 0
  		 */
  var start: js.UndefOr[Double] = js.undefined
}
object AudioTrack {
  
  inline def apply(path: String): AudioTrack = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioTrack] (val x: Self) extends AnyVal {
    
    inline def setCutFrom(value: Double): Self = StObject.set(x, "cutFrom", value.asInstanceOf[js.Any])
    
    inline def setCutFromUndefined: Self = StObject.set(x, "cutFrom", js.undefined)
    
    inline def setCutTo(value: Double): Self = StObject.set(x, "cutTo", value.asInstanceOf[js.Any])
    
    inline def setCutToUndefined: Self = StObject.set(x, "cutTo", js.undefined)
    
    inline def setMixVolume(value: Double | String): Self = StObject.set(x, "mixVolume", value.asInstanceOf[js.Any])
    
    inline def setMixVolumeUndefined: Self = StObject.set(x, "mixVolume", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
