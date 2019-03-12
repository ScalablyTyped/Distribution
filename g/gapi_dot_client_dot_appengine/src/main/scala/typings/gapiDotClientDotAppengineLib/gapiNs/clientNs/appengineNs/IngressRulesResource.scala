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
  def delete(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId
  ): gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: gapiDotClientDotAppengineLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateIngressRulesResponse],
    create: gapiDotClientDotAppengineLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule],
    delete: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule],
    list: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListIngressRulesResponse],
    patch: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId => gapiDotClientLib.gapiNs.clientNs.Request[FirewallRule]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[IngressRulesResource]
  }
}

