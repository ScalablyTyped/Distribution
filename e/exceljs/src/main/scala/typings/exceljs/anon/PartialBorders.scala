package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBorders extends StObject {
  
  var bottom: js.UndefOr[PartialBorder] = js.native
  
  var diagonal: js.UndefOr[PartialBorderDiagonal] = js.native
  
  var left: js.UndefOr[PartialBorder] = js.native
  
  var right: js.UndefOr[PartialBorder] = js.native
  
  var top: js.UndefOr[PartialBorder] = js.native
}
object PartialBorders {
  
  @scala.inline
  def apply(): PartialBorders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorders]
  }
  
  @scala.inline
  implicit class PartialBordersMutableBuilder[Self <: PartialBorders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: PartialBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setDiagonal(value: PartialBorderDiagonal): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    
    @scala.inline
    def setLeft(value: PartialBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: PartialBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: PartialBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
