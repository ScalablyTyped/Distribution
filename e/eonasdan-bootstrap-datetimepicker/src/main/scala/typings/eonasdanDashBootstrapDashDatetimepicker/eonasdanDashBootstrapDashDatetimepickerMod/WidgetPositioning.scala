package typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerMod

import typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerStrings.auto
import typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerStrings.bottom
import typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerStrings.left
import typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerStrings.right
import typings.eonasdanDashBootstrapDashDatetimepicker.eonasdanDashBootstrapDashDatetimepickerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetPositioning extends js.Object {
  var horizontal: js.UndefOr[auto | left | right] = js.undefined
  var vertical: js.UndefOr[auto | top | bottom] = js.undefined
}

object WidgetPositioning {
  @scala.inline
  def apply(horizontal: auto | left | right = null, vertical: auto | top | bottom = null): WidgetPositioning = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetPositioning]
  }
}

