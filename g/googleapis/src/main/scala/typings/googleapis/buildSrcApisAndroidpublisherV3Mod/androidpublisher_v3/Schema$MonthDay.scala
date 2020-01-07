package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MonthDay extends js.Object {
  /**
    * Day of a month, value in [1, 31] range. Valid range depends on the
    * specified month.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Month of a year. e.g. 1 = JAN, 2 = FEB etc.
    */
  var month: js.UndefOr[Double] = js.native
}

object Schema$MonthDay {
  @scala.inline
  def apply(day: Int | Double = null, month: Int | Double = null): Schema$MonthDay = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MonthDay]
  }
}

