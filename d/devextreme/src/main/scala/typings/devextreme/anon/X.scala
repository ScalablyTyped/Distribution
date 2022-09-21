package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  /**
    * Specifies a position in the horizontal direction (for left, right, or center alignment).
    */
  var x: js.UndefOr[typings.devextreme.mod.DevExpress.common.HorizontalAlignment] = js.undefined
  
  /**
    * Specifies a position in the vertical direction (for top, bottom, or center alignment).
    */
  var y: js.UndefOr[VerticalAlignment] = js.undefined
}
object X {
  
  inline def apply(): X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: typings.devextreme.mod.DevExpress.common.HorizontalAlignment): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: VerticalAlignment): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
