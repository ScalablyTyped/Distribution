package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAppengine.Anon_Accesstoken
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFields
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngressRulesResource extends js.Object {
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
    * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: Anon_Accesstoken): Request[BatchUpdateIngressRulesResponse]
  /** Creates a firewall rule for the application. */
  def create(request: Anon_Accesstoken): Request[FirewallRule]
  /** Deletes the specified firewall rule. */
  def delete(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFields): Request[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFields): Request[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKey): Request[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(request: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId): Request[FirewallRule]
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: Anon_Accesstoken => Request[BatchUpdateIngressRulesResponse],
    create: Anon_Accesstoken => Request[FirewallRule],
    delete: Anon_AccesstokenAltAppsIdBearertokenCallbackFields => Request[js.Object],
    get: Anon_AccesstokenAltAppsIdBearertokenCallbackFields => Request[FirewallRule],
    list: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKey => Request[ListIngressRulesResponse],
    patch: Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId => Request[FirewallRule]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[IngressRulesResource]
  }
}

