package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DateTimePicker
trait DateTimePickerSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var datepicker: js.UndefOr[DatePickerSettings] = js.undefined
  var footer: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DateTimePickerSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => _ = null,
    datepicker: DatePickerSettings = null,
    footer: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    locale: java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): DateTimePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (datepicker != null) __obj.updateDynamic("datepicker")(datepicker)
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (format != null) __obj.updateDynamic("format")(format)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (size != null) __obj.updateDynamic("size")(size)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerSettings]
  }
}

