package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quotas entry.
  */
@js.native
trait SchemaQuota extends js.Object {
  /**
    * [Output Only] Quota limit for this metric.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Name of the quota metric.
    */
  var metric: js.UndefOr[String] = js.native
  /**
    * [Output Only] Owning resource. This is the resource on which this quota
    * is applied.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * [Output Only] Current usage of this metric.
    */
  var usage: js.UndefOr[Double] = js.native
}

object SchemaQuota {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    metric: String = null,
    owner: String = null,
    usage: js.UndefOr[Double] = js.undefined
  ): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(usage)) __obj.updateDynamic("usage")(usage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuota]
  }
}

