package typings.fecha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nSettingsOptional extends js.Object {
  var DoFn: js.UndefOr[js.Function1[/* dayOfMonth */ Double, String]] = js.undefined
  var amPm: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var dayNames: js.UndefOr[Days] = js.undefined
  var dayNamesShort: js.UndefOr[Days] = js.undefined
  var monthNames: js.UndefOr[Months] = js.undefined
  var monthNamesShort: js.UndefOr[Months] = js.undefined
}

object I18nSettingsOptional {
  @scala.inline
  def apply(
    DoFn: /* dayOfMonth */ Double => String = null,
    amPm: js.Tuple2[String, String] = null,
    dayNames: Days = null,
    dayNamesShort: Days = null,
    monthNames: Months = null,
    monthNamesShort: Months = null
  ): I18nSettingsOptional = {
    val __obj = js.Dynamic.literal()
    if (DoFn != null) __obj.updateDynamic("DoFn")(js.Any.fromFunction1(DoFn))
    if (amPm != null) __obj.updateDynamic("amPm")(amPm.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nSettingsOptional]
  }
}

