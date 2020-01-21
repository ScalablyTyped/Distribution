package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPoliciesWafConfig extends js.Object {
  var wafRules: js.UndefOr[SchemaPreconfiguredWafSet] = js.native
}

object SchemaSecurityPoliciesWafConfig {
  @scala.inline
  def apply(wafRules: SchemaPreconfiguredWafSet = null): SchemaSecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    if (wafRules != null) __obj.updateDynamic("wafRules")(wafRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPoliciesWafConfig]
  }
}

