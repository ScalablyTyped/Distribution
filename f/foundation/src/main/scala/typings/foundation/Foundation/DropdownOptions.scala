package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
@js.native
trait DropdownOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var align: js.UndefOr[String] = js.native
  var closed: js.UndefOr[js.Function0[_]] = js.native
  var disabled_class: js.UndefOr[String] = js.native
  var hover_timeout: js.UndefOr[Double] = js.native
  var is_hover: js.UndefOr[Boolean] = js.native
  var mega_class: js.UndefOr[String] = js.native
  var opened: js.UndefOr[js.Function0[_]] = js.native
}

object DropdownOptions {
  @scala.inline
  def apply(): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOptions]
  }
  @scala.inline
  implicit class DropdownOptionsOps[Self <: DropdownOptions] (val x: Self) extends AnyVal {
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
    def setActive_class(value: String): Self = this.set("active_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive_class: Self = this.set("active_class", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClosed(value: () => _): Self = this.set("closed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setDisabled_class(value: String): Self = this.set("disabled_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled_class: Self = this.set("disabled_class", js.undefined)
    @scala.inline
    def setHover_timeout(value: Double): Self = this.set("hover_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover_timeout: Self = this.set("hover_timeout", js.undefined)
    @scala.inline
    def setIs_hover(value: Boolean): Self = this.set("is_hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_hover: Self = this.set("is_hover", js.undefined)
    @scala.inline
    def setMega_class(value: String): Self = this.set("mega_class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMega_class: Self = this.set("mega_class", js.undefined)
    @scala.inline
    def setOpened(value: () => _): Self = this.set("opened", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
  }
  
}

