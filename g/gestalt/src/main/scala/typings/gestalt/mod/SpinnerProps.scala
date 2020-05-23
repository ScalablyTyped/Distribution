package typings.gestalt.mod

import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var accessibilityLabel: String
  var delay: js.UndefOr[Boolean] = js.undefined
  var show: Boolean
  var size: js.UndefOr[sm | md] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    show: Boolean,
    delay: js.UndefOr[Boolean] = js.undefined,
    size: sm | md = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

