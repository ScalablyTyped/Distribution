package typings.expo.anon

import typings.expo.expoStrings.day
import typings.expo.expoStrings.hour
import typings.expo.expoStrings.minute
import typings.expo.expoStrings.month
import typings.expo.expoStrings.week
import typings.expo.expoStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalMs extends js.Object {
  var intervalMs: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.undefined
  var time: js.UndefOr[Double | Date] = js.undefined
}

object IntervalMs {
  @scala.inline
  def apply(
    intervalMs: js.UndefOr[Double] = js.undefined,
    repeat: minute | hour | day | week | month | year = null,
    time: Double | Date = null
  ): IntervalMs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intervalMs)) __obj.updateDynamic("intervalMs")(intervalMs.get.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalMs]
  }
}

