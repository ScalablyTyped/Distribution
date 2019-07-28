package typings.gapiDotClientDotTaskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeasedLastHour extends js.Object {
  /** Number of tasks leased in the last hour. */
  var leasedLastHour: js.UndefOr[String] = js.undefined
  /** Number of tasks leased in the last minute. */
  var leasedLastMinute: js.UndefOr[String] = js.undefined
  /** The timestamp (in seconds since the epoch) of the oldest unfinished task. */
  var oldestTask: js.UndefOr[String] = js.undefined
  /** Number of tasks in the queue. */
  var totalTasks: js.UndefOr[Double] = js.undefined
}

object Anon_LeasedLastHour {
  @scala.inline
  def apply(
    leasedLastHour: String = null,
    leasedLastMinute: String = null,
    oldestTask: String = null,
    totalTasks: Int | Double = null
  ): Anon_LeasedLastHour = {
    val __obj = js.Dynamic.literal()
    if (leasedLastHour != null) __obj.updateDynamic("leasedLastHour")(leasedLastHour)
    if (leasedLastMinute != null) __obj.updateDynamic("leasedLastMinute")(leasedLastMinute)
    if (oldestTask != null) __obj.updateDynamic("oldestTask")(oldestTask)
    if (totalTasks != null) __obj.updateDynamic("totalTasks")(totalTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LeasedLastHour]
  }
}

