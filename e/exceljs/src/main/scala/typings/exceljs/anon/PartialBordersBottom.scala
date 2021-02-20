package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBordersBottom extends StObject {
  
  var bottom: js.UndefOr[PartialBorderColor] = js.native
  
  var diagonal: js.UndefOr[PartialBorderDiagonalColor] = js.native
  
  var left: js.UndefOr[PartialBorderColor] = js.native
  
  var right: js.UndefOr[PartialBorderColor] = js.native
  
  var top: js.UndefOr[PartialBorderColor] = js.native
}
object PartialBordersBottom {
  
  @scala.inline
  def apply(): PartialBordersBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBordersBottom]
  }
  
  @scala.inline
  implicit class PartialBordersBottomMutableBuilder[Self <: PartialBordersBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: PartialBorderColor): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setDiagonal(value: PartialBorderDiagonalColor): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    
    @scala.inline
    def setLeft(value: PartialBorderColor): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: PartialBorderColor): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: PartialBorderColor): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
