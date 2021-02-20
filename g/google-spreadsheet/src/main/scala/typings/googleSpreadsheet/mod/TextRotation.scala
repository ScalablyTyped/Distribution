package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRotation extends StObject {
  
  var angle: Double = js.native
  
  var vertical: Boolean = js.native
}
object TextRotation {
  
  @scala.inline
  def apply(angle: Double, vertical: Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRotation]
  }
  
  @scala.inline
  implicit class TextRotationMutableBuilder[Self <: TextRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
