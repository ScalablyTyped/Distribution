package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBorders extends js.Object {
  
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
  implicit class PartialBordersOps[Self <: PartialBorders] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: PartialBorder): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setDiagonal(value: PartialBorderDiagonal): Self = this.set("diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagonal: Self = this.set("diagonal", js.undefined)
    
    @scala.inline
    def setLeft(value: PartialBorder): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: PartialBorder): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: PartialBorder): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
