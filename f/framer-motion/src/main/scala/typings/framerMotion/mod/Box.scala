package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Box extends StObject {
  
  var x: Axis
  
  var y: Axis
}
object Box {
  
  inline def apply(x: Axis, y: Axis): Box = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
    
    inline def setX(value: Axis): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Axis): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
