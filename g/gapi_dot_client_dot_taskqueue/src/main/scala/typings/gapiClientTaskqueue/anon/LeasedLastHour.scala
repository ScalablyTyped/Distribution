package typings.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeasedLastHour extends js.Object {
  /** Number of tasks leased in the last hour. */
  var leasedLastHour: js.UndefOr[String] = js.undefined
  /** Number of tasks leased in the last minute. */
  var leasedLastMinute: js.UndefOr[String] = js.undefined
  /** The timestamp (in seconds since the epoch) of the oldest unfinished task. */
  var oldestTask: js.UndefOr[String] = js.undefined
  /** Number of tasks in the queue. */
  var totalTasks: js.UndefOr[Double] = js.undefined
}

object LeasedLastHour {
  @scala.inline
  def apply(
    leasedLastHour: String = null,
    leasedLastMinute: String = null,
    oldestTask: String = null,
    totalTasks: js.UndefOr[Double] = js.undefined
  ): LeasedLastHour = {
    val __obj = js.Dynamic.literal()
    if (leasedLastHour != null) __obj.updateDynamic("leasedLastHour")(leasedLastHour.asInstanceOf[js.Any])
    if (leasedLastMinute != null) __obj.updateDynamic("leasedLastMinute")(leasedLastMinute.asInstanceOf[js.Any])
    if (oldestTask != null) __obj.updateDynamic("oldestTask")(oldestTask.asInstanceOf[js.Any])
    if (!js.isUndefined(totalTasks)) __obj.updateDynamic("totalTasks")(totalTasks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeasedLastHour]
  }
}

