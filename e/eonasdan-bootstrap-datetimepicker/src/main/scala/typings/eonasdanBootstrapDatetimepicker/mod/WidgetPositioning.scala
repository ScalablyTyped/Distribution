package typings.eonasdanBootstrapDatetimepicker.mod

import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.auto
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.bottom
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.left
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.right
import typings.eonasdanBootstrapDatetimepicker.eonasdanBootstrapDatetimepickerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPositioning extends js.Object {
  var horizontal: js.UndefOr[auto | left | right] = js.native
  var vertical: js.UndefOr[auto | top | bottom] = js.native
}

object WidgetPositioning {
  @scala.inline
  def apply(): WidgetPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetPositioning]
  }
  @scala.inline
  implicit class WidgetPositioningOps[Self <: WidgetPositioning] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: auto | left | right): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setVertical(value: auto | top | bottom): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

