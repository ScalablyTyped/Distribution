package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
@js.native
trait PartialBorderDiagonalColor extends StObject {
  
  var color: js.UndefOr[Partial[Color]] = js.native
  
  var down: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[BorderStyle] = js.native
  
  var up: js.UndefOr[Boolean] = js.native
}
object PartialBorderDiagonalColor {
  
  @scala.inline
  def apply(): PartialBorderDiagonalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderDiagonalColor]
  }
  
  @scala.inline
  implicit class PartialBorderDiagonalColorMutableBuilder[Self <: PartialBorderDiagonalColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Partial[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
