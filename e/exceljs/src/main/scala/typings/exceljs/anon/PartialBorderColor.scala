package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Border> */
trait PartialBorderColor extends StObject {
  
  var color: js.UndefOr[Partial[Color]] = js.undefined
  
  var style: js.UndefOr[BorderStyle] = js.undefined
}
object PartialBorderColor {
  
  inline def apply(): PartialBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBorderColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Partial[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
