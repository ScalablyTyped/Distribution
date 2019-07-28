package typings.firefoxDashWebextDashBrowser.browserNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* alarms types */
trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: String
  /** When present, signals that the alarm triggers periodically after so many minutes. */
  var periodInMinutes: js.UndefOr[Double] = js.undefined
  /** Time when the alarm is scheduled to fire, in milliseconds past the epoch. */
  var scheduledTime: Double
}

object Alarm {
  @scala.inline
  def apply(name: String, scheduledTime: Double, periodInMinutes: Int | Double = null): Alarm = {
    val __obj = js.Dynamic.literal(name = name, scheduledTime = scheduledTime)
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

