package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
trait PartialBorderDiagonalColor extends StObject {
  
  var color: js.UndefOr[Partial[Color]] = js.undefined
  
  var down: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[BorderStyle] = js.undefined
  
  var up: js.UndefOr[Boolean] = js.undefined
}
object PartialBorderDiagonalColor {
  
  inline def apply(): PartialBorderDiagonalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderDiagonalColor]
  }
  
  extension [Self <: PartialBorderDiagonalColor](x: Self) {
    
    inline def setColor(value: Partial[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
