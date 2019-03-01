package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  /** [Output Only] Quota limit for this metric. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Name of the quota metric. */
  var metric: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Current usage of this metric. */
  var usage: js.UndefOr[scala.Double] = js.undefined
}

object Quota {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    metric: java.lang.String = null,
    usage: scala.Int | scala.Double = null
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

