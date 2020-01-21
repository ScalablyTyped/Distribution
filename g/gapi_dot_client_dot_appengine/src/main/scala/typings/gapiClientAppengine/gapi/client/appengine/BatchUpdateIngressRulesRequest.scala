package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateIngressRulesRequest extends js.Object {
  /** A list of FirewallRules to replace the existing set. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
}

object BatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(ingressRules: js.Array[FirewallRule] = null): BatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateIngressRulesRequest]
  }
}

