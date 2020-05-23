package typings.flatpickr.confirmDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var confirmIcon: js.UndefOr[String] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var showAlways: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    confirmIcon: String = null,
    confirmText: String = null,
    showAlways: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (confirmIcon != null) __obj.updateDynamic("confirmIcon")(confirmIcon.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlways)) __obj.updateDynamic("showAlways")(showAlways.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

