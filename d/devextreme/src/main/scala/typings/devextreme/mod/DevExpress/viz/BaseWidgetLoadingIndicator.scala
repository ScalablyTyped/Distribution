package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.loadingIndicator */
@js.native
trait BaseWidgetLoadingIndicator extends js.Object {
  /** @name BaseWidget.Options.loadingIndicator.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name BaseWidget.Options.loadingIndicator.enabled */
  var enabled: js.UndefOr[Boolean] = js.native
  /** @name BaseWidget.Options.loadingIndicator.font */
  var font: js.UndefOr[Font] = js.native
  /** @name BaseWidget.Options.loadingIndicator.show */
  var show: js.UndefOr[Boolean] = js.native
  /** @name BaseWidget.Options.loadingIndicator.text */
  var text: js.UndefOr[String] = js.native
}

object BaseWidgetLoadingIndicator {
  @scala.inline
  def apply(): BaseWidgetLoadingIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetLoadingIndicator]
  }
  @scala.inline
  implicit class BaseWidgetLoadingIndicatorOps[Self <: BaseWidgetLoadingIndicator] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

