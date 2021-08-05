package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStop extends StObject {
  
  val color: RGBA
  
  val position: Double
}
object ColorStop {
  
  inline def apply(color: RGBA, position: Double): ColorStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStop]
  }
  
  extension [Self <: ColorStop](x: Self) {
    
    inline def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
