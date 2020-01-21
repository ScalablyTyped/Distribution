package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.UpdateAllIngressRules.
  */
@js.native
trait SchemaBatchUpdateIngressRulesResponse extends js.Object {
  /**
    * The full list of ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
}

object SchemaBatchUpdateIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[SchemaFirewallRule] = null): SchemaBatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesResponse]
  }
}

