package typings.exceljs.anon

import typings.exceljs.mod.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Style> */
trait PartialStyle extends StObject {
  
  var alignment: js.UndefOr[PartialAlignment] = js.undefined
  
  var border: js.UndefOr[PartialBorders] = js.undefined
  
  var fill: js.UndefOr[Fill] = js.undefined
  
  var font: js.UndefOr[PartialFont] = js.undefined
  
  var numFmt: js.UndefOr[String] = js.undefined
  
  var protection: js.UndefOr[PartialProtection] = js.undefined
}
object PartialStyle {
  
  inline def apply(): PartialStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyle]
  }
  
  extension [Self <: PartialStyle](x: Self) {
    
    inline def setAlignment(value: PartialAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBorder(value: PartialBorders): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setNumFmt(value: String): Self = StObject.set(x, "numFmt", value.asInstanceOf[js.Any])
    
    inline def setNumFmtUndefined: Self = StObject.set(x, "numFmt", js.undefined)
    
    inline def setProtection(value: PartialProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
  }
}
