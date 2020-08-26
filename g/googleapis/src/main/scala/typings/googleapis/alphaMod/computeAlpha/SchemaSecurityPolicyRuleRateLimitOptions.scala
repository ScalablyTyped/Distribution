package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyRuleRateLimitOptions extends js.Object {
  /**
    * Can only be specifed if the action for the rule is
    * &quot;rate_based_blacklist&quot; If specified, determines the time (in
    * seconds) the traffic will continue to be blocked by the rate limit after
    * the rate falls below the threshold. The default value is 0 seconds.
    */
  var blockDuration: js.UndefOr[Double] = js.native
  /**
    * Action to take when requests are under the given threshold. When requests
    * are throttled, this is also the action for all requests which are not
    * dropped. Valid options are &quot;allow&quot;, &quot;fairshare&quot;, and
    * &quot;drop_overload&quot;.
    */
  var conformAction: js.UndefOr[String] = js.native
  /**
    * Determines the key to enforce the threshold_rps limit on. If key is
    * &quot;IP&quot;, each IP has this limit enforced separately, whereas
    * &quot;ALL_IPs&quot; means a single limit is applied to all requests
    * matching this rule.
    */
  var enforceOnKey: js.UndefOr[String] = js.native
  /**
    * When a request is denied, returns the HTTP response code specified. Valid
    * options are &quot;deny()&quot; where valid values for status are 403,
    * 404, 429, and 502.
    */
  var exceedAction: js.UndefOr[String] = js.native
  /**
    * Rate in requests per second at which to begin ratelimiting.
    */
  var thresholdRps: js.UndefOr[Double] = js.native
}

object SchemaSecurityPolicyRuleRateLimitOptions {
  @scala.inline
  def apply(): SchemaSecurityPolicyRuleRateLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRateLimitOptions]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyRuleRateLimitOptionsOps[Self <: SchemaSecurityPolicyRuleRateLimitOptions] (val x: Self) extends AnyVal {
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
    def setBlockDuration(value: Double): Self = this.set("blockDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDuration: Self = this.set("blockDuration", js.undefined)
    @scala.inline
    def setConformAction(value: String): Self = this.set("conformAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformAction: Self = this.set("conformAction", js.undefined)
    @scala.inline
    def setEnforceOnKey(value: String): Self = this.set("enforceOnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceOnKey: Self = this.set("enforceOnKey", js.undefined)
    @scala.inline
    def setExceedAction(value: String): Self = this.set("exceedAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceedAction: Self = this.set("exceedAction", js.undefined)
    @scala.inline
    def setThresholdRps(value: Double): Self = this.set("thresholdRps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdRps: Self = this.set("thresholdRps", js.undefined)
  }
  
}

