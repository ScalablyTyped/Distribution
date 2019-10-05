package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIngressRulesResponse extends js.Object {
  /** The ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[FirewallRule] = null, nextPageToken: String = null): ListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListIngressRulesResponse]
  }
}

