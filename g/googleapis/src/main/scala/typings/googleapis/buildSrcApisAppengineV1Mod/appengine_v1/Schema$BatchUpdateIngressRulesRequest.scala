package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
@js.native
trait Schema$BatchUpdateIngressRulesRequest extends js.Object {
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[Schema$FirewallRule]] = js.native
}

object Schema$BatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(ingressRules: js.Array[Schema$FirewallRule] = null): Schema$BatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdateIngressRulesRequest]
  }
}

