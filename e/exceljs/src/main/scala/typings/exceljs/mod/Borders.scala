package typings.exceljs.mod

import typings.exceljs.anon.PartialBorder
import typings.exceljs.anon.PartialBorderDiagonal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borders extends js.Object {
  
  var bottom: PartialBorder = js.native
  
  var diagonal: PartialBorderDiagonal = js.native
  
  var left: PartialBorder = js.native
  
  var right: PartialBorder = js.native
  
  var top: PartialBorder = js.native
}
object Borders {
  
  @scala.inline
  def apply(
    bottom: PartialBorder,
    diagonal: PartialBorderDiagonal,
    left: PartialBorder,
    right: PartialBorder,
    top: PartialBorder
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  @scala.inline
  implicit class BordersOps[Self <: Borders] (val x: Self) extends AnyVal {
    
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
    def setDiagonal(value: PartialBorderDiagonal): Self = this.set("diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: PartialBorder): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: PartialBorder): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PartialBorder): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
