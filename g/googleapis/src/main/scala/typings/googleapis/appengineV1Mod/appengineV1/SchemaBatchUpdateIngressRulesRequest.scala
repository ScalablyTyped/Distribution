package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
@js.native
trait SchemaBatchUpdateIngressRulesRequest extends js.Object {
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
}

object SchemaBatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(ingressRules: js.Array[SchemaFirewallRule] = null): SchemaBatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesRequest]
  }
}

