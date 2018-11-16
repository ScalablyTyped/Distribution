package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IngressRulesResource extends js.Object {
  /**
               * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
               * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
               */
  def batchUpdate(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateIngressRulesResponse]
  /** Creates a firewall rule for the application. */
  def create(request: gapiDotClientDotAppengineLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
  /** Deletes the specified firewall rule. */
  def delete(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenPageSizeAppsIdPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
}

