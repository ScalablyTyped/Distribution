package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DateTimePicker
trait DateTimePickerSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var datepicker: js.UndefOr[DatePickerSettings] = js.undefined
  var footer: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DateTimePickerSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => _ = null,
    datepicker: DatePickerSettings = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    locale: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    uiLibrary: String = null,
    value: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): DateTimePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (datepicker != null) __obj.updateDynamic("datepicker")(datepicker.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerSettings]
  }
}

