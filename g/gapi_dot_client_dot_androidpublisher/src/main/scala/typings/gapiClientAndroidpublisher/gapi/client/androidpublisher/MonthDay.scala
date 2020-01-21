package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthDay extends js.Object {
  /** Day of a month, value in [1, 31] range. Valid range depends on the specified month. */
  var day: js.UndefOr[Double] = js.undefined
  /** Month of a year. e.g. 1 = JAN, 2 = FEB etc. */
  var month: js.UndefOr[Double] = js.undefined
}

object MonthDay {
  @scala.inline
  def apply(day: Int | Double = null, month: Int | Double = null): MonthDay = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthDay]
  }
}

