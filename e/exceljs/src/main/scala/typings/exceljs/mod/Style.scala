package typings.exceljs.mod

import typings.exceljs.anon.PartialAlignment
import typings.exceljs.anon.PartialBorders
import typings.exceljs.anon.PartialFont
import typings.exceljs.anon.PartialProtection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var alignment: PartialAlignment
  
  var border: PartialBorders
  
  var fill: Fill
  
  var font: PartialFont
  
  var numFmt: String
  
  var protection: PartialProtection
}
object Style {
  
  inline def apply(
    alignment: PartialAlignment,
    border: PartialBorders,
    fill: Fill,
    font: PartialFont,
    numFmt: String,
    protection: PartialProtection
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: PartialAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: PartialBorders): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setNumFmt(value: String): Self = StObject.set(x, "numFmt", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: PartialProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
  }
}
