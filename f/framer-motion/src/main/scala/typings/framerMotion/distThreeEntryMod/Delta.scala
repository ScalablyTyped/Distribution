package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var x: AxisDelta
  
  var y: AxisDelta
}
object Delta {
  
  inline def apply(x: AxisDelta, y: AxisDelta): Delta = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    inline def setX(value: AxisDelta): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: AxisDelta): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
