package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * An object, where `{ x: 0, y: 0 }` is the upper left corner of the screen and `{ x: 1, y: 1 }` is the lower right corner.
	 */
trait PositionObject
  extends StObject
     with Position {
  
  /**
  		 * X-anchor position of the object.
  		 */
  var originX: js.UndefOr[OriginX] = js.undefined
  
  /**
  		 * Y-anchor position of the object.
  		 */
  var originY: js.UndefOr[OriginY] = js.undefined
  
  /**
  		 * X-position relative to video width.
  		 */
  var x: Double
  
  /**
  		 * Y-position relative to video height.
  		 */
  var y: Double
}
object PositionObject {
  
  inline def apply(x: Double, y: Double): PositionObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionObject]
  }
  
  extension [Self <: PositionObject](x: Self) {
    
    inline def setOriginX(value: OriginX): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: OriginY): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
