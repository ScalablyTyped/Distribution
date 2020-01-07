package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.UpdateAllIngressRules.
  */
@js.native
trait Schema$BatchUpdateIngressRulesResponse extends js.Object {
  /**
    * The full list of ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[Schema$FirewallRule]] = js.native
}

object Schema$BatchUpdateIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[Schema$FirewallRule] = null): Schema$BatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdateIngressRulesResponse]
  }
}

