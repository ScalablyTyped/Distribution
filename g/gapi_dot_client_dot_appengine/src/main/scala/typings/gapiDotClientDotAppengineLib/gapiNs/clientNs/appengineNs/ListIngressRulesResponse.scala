package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListIngressRulesResponse extends js.Object {
  /** The ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

