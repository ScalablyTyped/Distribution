package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayInMinutes extends js.Object {
  /** Number of minutes from the current time after which the alarm should first fire. */
  var delayInMinutes: js.UndefOr[Double] = js.undefined
  /** Number of minutes after which the alarm should recur repeatedly. */
  var periodInMinutes: js.UndefOr[Double] = js.undefined
  /** Time when the alarm is scheduled to first fire, in milliseconds past the epoch. */
  var when: js.UndefOr[Double] = js.undefined
}

object DelayInMinutes {
  @scala.inline
  def apply(
    delayInMinutes: js.UndefOr[Double] = js.undefined,
    periodInMinutes: js.UndefOr[Double] = js.undefined,
    when: js.UndefOr[Double] = js.undefined
  ): DelayInMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayInMinutes)) __obj.updateDynamic("delayInMinutes")(delayInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodInMinutes)) __obj.updateDynamic("periodInMinutes")(periodInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayInMinutes]
  }
}

