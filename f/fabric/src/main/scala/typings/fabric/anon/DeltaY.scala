package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaY extends StObject {
  
  var deltaY: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var kernedWidth: js.UndefOr[Double] = js.undefined
  
  var left: Double
  
  var width: Double
}
object DeltaY {
  
  inline def apply(left: Double, width: Double): DeltaY = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeltaY] (val x: Self) extends AnyVal {
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKernedWidth(value: Double): Self = StObject.set(x, "kernedWidth", value.asInstanceOf[js.Any])
    
    inline def setKernedWidthUndefined: Self = StObject.set(x, "kernedWidth", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
