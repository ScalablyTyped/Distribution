package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorCustomizeText extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var customizeText: js.UndefOr[js.Function1[/* info */ Point, String]] = js.native
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object BackgroundColorCustomizeText {
  @scala.inline
  def apply(): BackgroundColorCustomizeText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorCustomizeText]
  }
  @scala.inline
  implicit class BackgroundColorCustomizeTextOps[Self <: BackgroundColorCustomizeText] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* info */ Point => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

