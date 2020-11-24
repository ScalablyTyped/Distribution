package typings.exceljs.anon

import typings.exceljs.mod.Border
import typings.exceljs.mod.BorderDiagonal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBordersDiagonal extends js.Object {
  
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
  implicit class PartialBordersDiagonalOps[Self <: PartialBordersDiagonal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBottom(value: Partial[Border]): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setDiagonal(value: Partial[BorderDiagonal]): Self = this.set("diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonal: Self = this.set("diagonal", js.undefined)
    
    @scala.inline
    def setLeft(value: Partial[Border]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Partial[Border]): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: Partial[Border]): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
