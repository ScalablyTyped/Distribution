package typings.favicoJs.favicojs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FavicoJsOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var bgColor: js.UndefOr[String] = js.native
  var dataUrl: js.UndefOr[js.Function1[/* url */ String, _]] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var elementId: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object FavicoJsOptions {
  @scala.inline
  def apply(): FavicoJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavicoJsOptions]
  }
  @scala.inline
  implicit class FavicoJsOptionsOps[Self <: FavicoJsOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setDataUrl(value: /* url */ String => _): Self = this.set("dataUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementId: Self = this.set("elementId", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

