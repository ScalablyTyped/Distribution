package typings.exceljs.anon

import typings.exceljs.mod.Border
import typings.exceljs.mod.BorderDiagonal
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBordersDiagonal extends StObject {
  
  var bottom: js.UndefOr[Partial[Border]] = js.native
  
  var diagonal: js.UndefOr[Partial[BorderDiagonal]] = js.native
  
  var left: js.UndefOr[Partial[Border]] = js.native
  
  var right: js.UndefOr[Partial[Border]] = js.native
  
  var top: js.UndefOr[Partial[Border]] = js.native
}
object PartialBordersDiagonal {
  
  @scala.inline
  def apply(): PartialBordersDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBordersDiagonal]
  }
  
  @scala.inline
  implicit class PartialBordersDiagonalMutableBuilder[Self <: PartialBordersDiagonal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Partial[Border]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setDiagonal(value: Partial[BorderDiagonal]): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    
    @scala.inline
    def setLeft(value: Partial[Border]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Partial[Border]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Partial[Border]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
