package typings.exceljs.anon

import typings.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs :string | undefined,   hyperlinks :exceljs.exceljs.ImageHyperlinkValue | undefined} & exceljs.exceljs.ImagePosition */
@js.native
trait editAsstringundefinedhypeEditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.native
  var ext: Height = js.native
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.native
  var tl: Col = js.native
}

object editAsstringundefinedhypeEditAs {
  @scala.inline
  def apply(ext: Height, tl: Col): editAsstringundefinedhypeEditAs = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringundefinedhypeEditAs]
  }
  @scala.inline
  implicit class editAsstringundefinedhypeEditAsOps[Self <: editAsstringundefinedhypeEditAs] (val x: Self) extends AnyVal {
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
    def setExt(value: Height): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setTl(value: Col): Self = this.set("tl", value.asInstanceOf[js.Any])
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

