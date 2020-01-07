package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPolicyRuleMatcherConfig extends js.Object {
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SecurityPolicyRuleMatcherConfig {
  @scala.inline
  def apply(srcIpRanges: js.Array[String] = null): Schema$SecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    if (srcIpRanges != null) __obj.updateDynamic("srcIpRanges")(srcIpRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyRuleMatcherConfig]
  }
}

