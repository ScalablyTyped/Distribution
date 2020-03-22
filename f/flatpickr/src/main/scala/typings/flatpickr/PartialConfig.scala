package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<flatpickr.flatpickr/dist/plugins/monthSelect.Config> */
trait PartialConfig extends js.Object {
  var altFormat: js.UndefOr[String] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    altFormat: String = null,
    dateFormat: String = null,
    shorthand: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

