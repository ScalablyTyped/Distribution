package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  /** [Output Only] Quota limit for this metric. */
  var limit: js.UndefOr[Double] = js.undefined
  /** [Output Only] Name of the quota metric. */
  var metric: js.UndefOr[String] = js.undefined
  /** [Output Only] Current usage of this metric. */
  var usage: js.UndefOr[Double] = js.undefined
}

object Quota {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    metric: String = null,
    usage: js.UndefOr[Double] = js.undefined
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

