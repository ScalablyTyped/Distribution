package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPoliciesWafConfig extends js.Object {
  var wafRules: js.UndefOr[Schema$PreconfiguredWafSet] = js.native
}

object Schema$SecurityPoliciesWafConfig {
  @scala.inline
  def apply(wafRules: Schema$PreconfiguredWafSet = null): Schema$SecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    if (wafRules != null) __obj.updateDynamic("wafRules")(wafRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPoliciesWafConfig]
  }
}

