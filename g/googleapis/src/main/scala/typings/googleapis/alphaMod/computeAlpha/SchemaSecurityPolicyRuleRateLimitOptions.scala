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
  def apply(
    blockDuration: js.UndefOr[Double] = js.undefined,
    conformAction: String = null,
    enforceOnKey: String = null,
    exceedAction: String = null,
    thresholdRps: js.UndefOr[Double] = js.undefined
  ): SchemaSecurityPolicyRuleRateLimitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockDuration)) __obj.updateDynamic("blockDuration")(blockDuration.get.asInstanceOf[js.Any])
    if (conformAction != null) __obj.updateDynamic("conformAction")(conformAction.asInstanceOf[js.Any])
    if (enforceOnKey != null) __obj.updateDynamic("enforceOnKey")(enforceOnKey.asInstanceOf[js.Any])
    if (exceedAction != null) __obj.updateDynamic("exceedAction")(exceedAction.asInstanceOf[js.Any])
    if (!js.isUndefined(thresholdRps)) __obj.updateDynamic("thresholdRps")(thresholdRps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPolicyRuleRateLimitOptions]
  }
}

