package typings
package gapiDotClientDotTaskqueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeasedLastHour extends js.Object {
  /** Number of tasks leased in the last hour. */
  var leasedLastHour: js.UndefOr[java.lang.String] = js.undefined
  /** Number of tasks leased in the last minute. */
  var leasedLastMinute: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp (in seconds since the epoch) of the oldest unfinished task. */
  var oldestTask: js.UndefOr[java.lang.String] = js.undefined
  /** Number of tasks in the queue. */
  var totalTasks: js.UndefOr[scala.Double] = js.undefined
}

