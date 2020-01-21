package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.ListIngressRules.
  */
@js.native
trait SchemaListIngressRulesResponse extends js.Object {
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[SchemaFirewallRule] = null, nextPageToken: String = null): SchemaListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListIngressRulesResponse]
  }
}

