package typings.exceljs.anon

import typings.exceljs.mod.BorderStyle
import typings.exceljs.mod.Color
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
@js.native
trait PartialBorderDiagonalColor extends js.Object {
  
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
  implicit class PartialBorderDiagonalColorOps[Self <: PartialBorderDiagonalColor] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Partial[Color]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDown(value: Boolean): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setStyle(value: BorderStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUp(value: Boolean): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
