package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TimePicker
trait TimePickerSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var footer: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var select: js.UndefOr[js.Function2[/* e */ js.Any, /* type */ String, _]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TimePickerSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => _ = null,
    close: /* e */ js.Any => _ = null,
    footer: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    header: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    open: /* e */ js.Any => _ = null,
    select: (/* e */ js.Any, /* type */ String) => _ = null,
    size: String = null,
    uiLibrary: String = null,
    value: String = null,
    width: Int | Double = null
  ): TimePickerSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (size != null) __obj.updateDynamic("size")(size)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerSettings]
  }
}

