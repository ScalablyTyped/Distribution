package typings.expo

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

trait Anon_Day extends js.Object {
  var intervalMs: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.undefined
  var time: js.UndefOr[Double | Date] = js.undefined
}

object Anon_Day {
  @scala.inline
  def apply(
    intervalMs: Int | Double = null,
    repeat: minute | hour | day | week | month | year = null,
    time: Double | Date = null
  ): Anon_Day = {
    val __obj = js.Dynamic.literal()
    if (intervalMs != null) __obj.updateDynamic("intervalMs")(intervalMs.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Day]
  }
}

