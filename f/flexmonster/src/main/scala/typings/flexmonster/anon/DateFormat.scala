package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormat extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var liveSearch: js.UndefOr[Boolean] = js.undefined
  var timezoneOffset: js.UndefOr[Double] = js.undefined
  var weekOffset: js.UndefOr[Double] = js.undefined
}

object DateFormat {
  @scala.inline
  def apply(
    dateFormat: String = null,
    liveSearch: js.UndefOr[Boolean] = js.undefined,
    timezoneOffset: js.UndefOr[Double] = js.undefined,
    weekOffset: js.UndefOr[Double] = js.undefined
  ): DateFormat = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(liveSearch)) __obj.updateDynamic("liveSearch")(liveSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timezoneOffset)) __obj.updateDynamic("timezoneOffset")(timezoneOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekOffset)) __obj.updateDynamic("weekOffset")(weekOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormat]
  }
}

