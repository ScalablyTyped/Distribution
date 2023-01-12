package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  /**
    * Specifies the horizontal cursor offset from the dragged row in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the vertical cursor offset from the dragged row in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object Y {
  
  inline def apply(): Y = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
