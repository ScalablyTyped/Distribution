package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Color> */
trait PartialColor extends StObject {
  
  var argb: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Double] = js.undefined
}
object PartialColor {
  
  @scala.inline
  def apply(): PartialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColor]
  }
  
  @scala.inline
  implicit class PartialColorMutableBuilder[Self <: PartialColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgb(value: String): Self = StObject.set(x, "argb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgbUndefined: Self = StObject.set(x, "argb", js.undefined)
    
    @scala.inline
    def setTheme(value: Double): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
