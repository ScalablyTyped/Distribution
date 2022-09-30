package typings.editly.mod

import typings.editly.editlyStrings.`image-overlay`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Image overlay with a custom position and size on the screen.
	 */
trait ImageOverlayLayer
  extends StObject
     with BaseLayer
     with KenBurns
     with Layer {
  
  /**
  		 * Height (from 0 to 1) where 1 is screen height.
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Path to image file.
  		 */
  var path: String
  
  /**
  		 * Position.
  		 */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_ImageOverlayLayer: `image-overlay`
  
  /**
  		 * Width (from 0 to 1) where 1 is screen width.
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageOverlayLayer {
  
  inline def apply(path: String): ImageOverlayLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image-overlay")
    __obj.asInstanceOf[ImageOverlayLayer]
  }
  
  extension [Self <: ImageOverlayLayer](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: `image-overlay`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
