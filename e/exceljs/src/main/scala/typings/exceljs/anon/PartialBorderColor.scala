package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Border> */
@js.native
trait PartialBorderColor extends StObject {
  
  var color: js.UndefOr[Partial[Color]] = js.native
  
  var style: js.UndefOr[BorderStyle] = js.native
}
object PartialBorderColor {
  
  @scala.inline
  def apply(): PartialBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderColor]
  }
  
  @scala.inline
  implicit class PartialBorderColorMutableBuilder[Self <: PartialBorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Partial[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
