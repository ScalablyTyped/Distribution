package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageHyperlinkValue extends js.Object {
  var hyperlink: String = js.native
  var tooltip: js.UndefOr[String] = js.native
}

object ImageHyperlinkValue {
  @scala.inline
  def apply(hyperlink: String): ImageHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageHyperlinkValue]
  }
  @scala.inline
  implicit class ImageHyperlinkValueOps[Self <: ImageHyperlinkValue] (val x: Self) extends AnyVal {
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
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

