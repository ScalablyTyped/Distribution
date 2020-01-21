package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelayInMinutes extends js.Object {
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[Double] = js.undefined
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[Double] = js.undefined
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[Double] = js.undefined
}

object AnonDelayInMinutes {
  @scala.inline
  def apply(
    delayInMinutes: Int | Double = null,
    periodInMinutes: Int | Double = null,
    when: Int | Double = null
  ): AnonDelayInMinutes = {
    val __obj = js.Dynamic.literal()
    if (delayInMinutes != null) __obj.updateDynamic("delayInMinutes")(delayInMinutes.asInstanceOf[js.Any])
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelayInMinutes]
  }
}

