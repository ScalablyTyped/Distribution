package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.ListIngressRules.
  */
@js.native
trait Schema$ListIngressRulesResponse extends js.Object {
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[Schema$FirewallRule]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[Schema$FirewallRule] = null, nextPageToken: String = null): Schema$ListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListIngressRulesResponse]
  }
}

