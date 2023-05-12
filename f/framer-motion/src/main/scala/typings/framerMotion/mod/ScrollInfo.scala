package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollInfo extends StObject {
  
  var time: Double
  
  var x: AxisScrollInfo
  
  var y: AxisScrollInfo
}
object ScrollInfo {
  
  inline def apply(time: Double, x: AxisScrollInfo, y: AxisScrollInfo): ScrollInfo = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollInfo] (val x: Self) extends AnyVal {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setX(value: AxisScrollInfo): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: AxisScrollInfo): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
