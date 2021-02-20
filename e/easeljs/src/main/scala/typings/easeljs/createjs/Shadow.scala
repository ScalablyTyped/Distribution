package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shadow extends StObject {
  
  // properties
  var blur: Double = js.native
  
  var color: String = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
}
object Shadow {
  
  @scala.inline
  def apply(blur: Double, color: String, offsetX: Double, offsetY: Double): Shadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
  
  @scala.inline
  implicit class ShadowMutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
