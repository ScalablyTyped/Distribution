package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRotation extends StObject {
  
  var angle: Double
  
  var vertical: Boolean
}
object TextRotation {
  
  inline def apply(angle: Double, vertical: Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRotation] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
