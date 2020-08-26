package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/clearing.html#optional-javascript-configuration
@js.native
trait ClearingOptions extends js.Object {
  var close_selectors: js.UndefOr[String] = js.native
  var init: js.UndefOr[Boolean] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var open_selectors: js.UndefOr[String] = js.native
  var skip_selector: js.UndefOr[String] = js.native
  var templates: js.UndefOr[js.Object] = js.native
  var touch_label: js.UndefOr[String] = js.native
}

object ClearingOptions {
  @scala.inline
  def apply(): ClearingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearingOptions]
  }
  @scala.inline
  implicit class ClearingOptionsOps[Self <: ClearingOptions] (val x: Self) extends AnyVal {
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
    def setClose_selectors(value: String): Self = this.set("close_selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose_selectors: Self = this.set("close_selectors", js.undefined)
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setOpen_selectors(value: String): Self = this.set("open_selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_selectors: Self = this.set("open_selectors", js.undefined)
    @scala.inline
    def setSkip_selector(value: String): Self = this.set("skip_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_selector: Self = this.set("skip_selector", js.undefined)
    @scala.inline
    def setTemplates(value: js.Object): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setTouch_label(value: String): Self = this.set("touch_label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch_label: Self = this.set("touch_label", js.undefined)
  }
  
}

