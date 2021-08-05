package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var color: PartialColor
  
  var style: BorderStyle
}
object Border {
  
  inline def apply(color: PartialColor, style: BorderStyle): Border = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
