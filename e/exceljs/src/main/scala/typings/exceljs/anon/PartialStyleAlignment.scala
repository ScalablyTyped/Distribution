package typings.exceljs.anon

import typings.exceljs.mod.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Style> */
@js.native
trait PartialStyleAlignment extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.native
  var border: js.UndefOr[PartialBordersDiagonal] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var font: js.UndefOr[PartialFontBold] = js.native
  var numFmt: js.UndefOr[String] = js.native
  var protection: js.UndefOr[PartialProtection] = js.native
}

object PartialStyleAlignment {
  @scala.inline
  def apply(): PartialStyleAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleAlignment]
  }
  @scala.inline
  implicit class PartialStyleAlignmentOps[Self <: PartialStyleAlignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: PartialAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBorder(value: PartialBordersDiagonal): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: PartialFontBold): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setNumFmt(value: String): Self = this.set("numFmt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFmt: Self = this.set("numFmt", js.undefined)
    @scala.inline
    def setProtection(value: PartialProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
  }
  
}

