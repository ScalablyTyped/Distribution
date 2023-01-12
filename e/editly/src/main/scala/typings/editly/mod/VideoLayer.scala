package typings.editly.mod

import typings.editly.editlyStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * For video layers, if parent `clip.duration` is specified, the video will be slowed/sped-up to match `clip.duration`.
	 * If `cutFrom`/`cutTo` is set, the resulting segment (`cutTo`-`cutFrom`) will be slowed/sped-up to fit `clip.duration`.
	 * If the layer has audio, it will be kept (and mixed with other audio layers if present).
	 */
trait VideoLayer
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
  		 * Defaults to *end of video*.
  		 */
  var cutTo: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Height relative to screen height.
  		 * Must be between 0 and 1.
  		 *
  		 * @default 1
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * X-position relative to screen width.
  		 * Must be between 0 and 1.
  		 *
  		 * @default 0
  		 */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Relative volume when mixing this video's audio track with others.
  		 *
  		 * @default 1
  		 */
  var mixVolume: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * X-anchor.
  		 *
  		 * @default 'left'
  		 */
  var originX: js.UndefOr[OriginX] = js.undefined
  
  /**
  		 * Y-anchor.
  		 *
  		 * @default 'top'
  		 */
  var originY: js.UndefOr[OriginY] = js.undefined
  
  /**
  		 * Path to video file.
  		 */
  var path: String
  
  /**
  		 * How to fit video to screen.
  		 *
  		 * @default 'contain-blur'
  		 * @see [Resize modes]{@link https://github.com/mifi/editly#resize-modes}
  		 */
  var resizeMode: js.UndefOr[ResizeMode] = js.undefined
  
  /**
  		 * Y-position relative to screen height.
  		 * Must be between 0 and 1.
  		 *
  		 * @default 0
  		 */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_VideoLayer: video
  
  /**
  		 * Width relative to screen width.
  		 * Must be between 0 and 1.
  		 *
  		 * @default 1
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object VideoLayer {
  
  inline def apply(path: String): VideoLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[VideoLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoLayer] (val x: Self) extends AnyVal {
    
    inline def setCutFrom(value: Double): Self = StObject.set(x, "cutFrom", value.asInstanceOf[js.Any])
    
    inline def setCutFromUndefined: Self = StObject.set(x, "cutFrom", js.undefined)
    
    inline def setCutTo(value: Double): Self = StObject.set(x, "cutTo", value.asInstanceOf[js.Any])
    
    inline def setCutToUndefined: Self = StObject.set(x, "cutTo", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMixVolume(value: Double | String): Self = StObject.set(x, "mixVolume", value.asInstanceOf[js.Any])
    
    inline def setMixVolumeUndefined: Self = StObject.set(x, "mixVolume", js.undefined)
    
    inline def setOriginX(value: OriginX): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: OriginY): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
