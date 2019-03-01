package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayInMinutes extends js.Object {
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DelayInMinutes {
  @scala.inline
  def apply(
    delayInMinutes: scala.Int | scala.Double = null,
    periodInMinutes: scala.Int | scala.Double = null,
    when: scala.Int | scala.Double = null
  ): Anon_DelayInMinutes = {
    val __obj = js.Dynamic.literal()
    if (delayInMinutes != null) __obj.updateDynamic("delayInMinutes")(delayInMinutes.asInstanceOf[js.Any])
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelayInMinutes]
  }
}

