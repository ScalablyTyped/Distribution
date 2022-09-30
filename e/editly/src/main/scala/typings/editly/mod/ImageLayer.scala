package typings.editly.mod

import typings.editly.editlyStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Full screen image.
	 */
trait ImageLayer
  extends StObject
     with BaseLayer
     with KenBurns
     with Layer {
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Path to image file.
  		 */
  var path: String
  
  /**
  		 * How to fit image to screen.
  		 */
  var resizeMode: js.UndefOr[ResizeMode] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_ImageLayer: image
}
object ImageLayer {
  
  inline def apply(path: String): ImageLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageLayer]
  }
  
  extension [Self <: ImageLayer](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
