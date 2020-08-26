package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageAndQuotaResponse extends js.Object {
  /**
    * Storage quota (bytes).
    */
  var quota: Double = js.native
  /**
    * Storage usage (bytes).
    */
  var usage: Double = js.native
  /**
    * Storage usage per type (bytes).
    */
  var usageBreakdown: js.Array[UsageForType] = js.native
}

object GetUsageAndQuotaResponse {
  @scala.inline
  def apply(quota: Double, usage: Double, usageBreakdown: js.Array[UsageForType]): GetUsageAndQuotaResponse = {
    val __obj = js.Dynamic.literal(quota = quota.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usageBreakdown = usageBreakdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageAndQuotaResponse]
  }
  @scala.inline
  implicit class GetUsageAndQuotaResponseOps[Self <: GetUsageAndQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuota(value: Double): Self = this.set("quota", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageBreakdownVarargs(value: UsageForType*): Self = this.set("usageBreakdown", js.Array(value :_*))
    @scala.inline
    def setUsageBreakdown(value: js.Array[UsageForType]): Self = this.set("usageBreakdown", value.asInstanceOf[js.Any])
  }
  
}

