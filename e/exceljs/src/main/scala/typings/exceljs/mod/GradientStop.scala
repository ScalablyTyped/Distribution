package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientStop extends StObject {
  
  var color: PartialColor
  
  var position: Double
}
object GradientStop {
  
  inline def apply(color: PartialColor, position: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  extension [Self <: GradientStop](x: Self) {
    
    inline def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
