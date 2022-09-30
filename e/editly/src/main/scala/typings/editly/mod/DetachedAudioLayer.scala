package typings.editly.mod

import typings.editly.editlyStrings.`detached-audio`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This is a special case of `audioTracks` that makes it easier to start the audio relative to clips start times,
	 * without having to calculate global start times.
	 *
	 * This layer has the exact same properties as [`audioTracks`]{@link https://github.com/mifi/editly#arbitrary-audio-tracks},
	 * except `start` time is relative to the clip's start.
	 */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.editly.mod.AudioTrack because var conflicts: start. Inlined path, mixVolume, cutFrom, cutTo */ trait DetachedAudioLayer
  extends StObject
     with BaseLayer
     with Layer {
  
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
  		 * Layer type.
  		 */
  @JSName("type")
  var type_DetachedAudioLayer: `detached-audio`
}
object DetachedAudioLayer {
  
  inline def apply(path: String): DetachedAudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("detached-audio")
    __obj.asInstanceOf[DetachedAudioLayer]
  }
  
  extension [Self <: DetachedAudioLayer](x: Self) {
    
    inline def setCutFrom(value: Double): Self = StObject.set(x, "cutFrom", value.asInstanceOf[js.Any])
    
    inline def setCutFromUndefined: Self = StObject.set(x, "cutFrom", js.undefined)
    
    inline def setCutTo(value: Double): Self = StObject.set(x, "cutTo", value.asInstanceOf[js.Any])
    
    inline def setCutToUndefined: Self = StObject.set(x, "cutTo", js.undefined)
    
    inline def setMixVolume(value: Double | String): Self = StObject.set(x, "mixVolume", value.asInstanceOf[js.Any])
    
    inline def setMixVolumeUndefined: Self = StObject.set(x, "mixVolume", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: `detached-audio`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
