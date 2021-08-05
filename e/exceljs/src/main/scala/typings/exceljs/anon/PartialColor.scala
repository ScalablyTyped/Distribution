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
  
  inline def apply(): PartialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColor]
  }
  
  extension [Self <: PartialColor](x: Self) {
    
    inline def setArgb(value: String): Self = StObject.set(x, "argb", value.asInstanceOf[js.Any])
    
    inline def setArgbUndefined: Self = StObject.set(x, "argb", js.undefined)
    
    inline def setTheme(value: Double): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
