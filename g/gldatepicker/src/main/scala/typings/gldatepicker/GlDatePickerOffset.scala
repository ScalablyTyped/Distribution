package typings.gldatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlDatePickerOffset extends StObject {
  
  var x: Double
  
  var y: Double
}
object GlDatePickerOffset {
  
  inline def apply(x: Double, y: Double): GlDatePickerOffset = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlDatePickerOffset] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
