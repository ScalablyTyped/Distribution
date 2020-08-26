package typings.exceljs.anon

import typings.exceljs.mod.Anchor
import typings.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs :string | undefined,   hyperlinks :exceljs.exceljs.ImageHyperlinkValue | undefined} & exceljs.exceljs.ImageRange */
@js.native
trait editAsstringundefinedhype extends js.Object {
  var br: Anchor = js.native
  var editAs: js.UndefOr[String] = js.native
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.native
  var tl: Anchor = js.native
}

object editAsstringundefinedhype {
  @scala.inline
  def apply(br: Anchor, tl: Anchor): editAsstringundefinedhype = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringundefinedhype]
  }
  @scala.inline
  implicit class editAsstringundefinedhypeOps[Self <: editAsstringundefinedhype] (val x: Self) extends AnyVal {
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
    def setBr(value: Anchor): Self = this.set("br", value.asInstanceOf[js.Any])
    @scala.inline
    def setTl(value: Anchor): Self = this.set("tl", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditAs(value: String): Self = this.set("editAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditAs: Self = this.set("editAs", js.undefined)
    @scala.inline
    def setHyperlinks(value: ImageHyperlinkValue): Self = this.set("hyperlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlinks: Self = this.set("hyperlinks", js.undefined)
  }
  
}

