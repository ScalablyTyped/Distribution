package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Border> */
@js.native
trait PartialBorder extends StObject {
  
  var color: js.UndefOr[PartialColor] = js.native
  
  var style: js.UndefOr[BorderStyle] = js.native
}
object PartialBorder {
  
  @scala.inline
  def apply(): PartialBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorder]
  }
  
  @scala.inline
  implicit class PartialBorderMutableBuilder[Self <: PartialBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
