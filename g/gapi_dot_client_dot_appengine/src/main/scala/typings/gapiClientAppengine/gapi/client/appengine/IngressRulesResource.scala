package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonAccesstoken
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFields
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngressRulesResource extends js.Object {
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
    * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: AnonAccesstoken): Request_[BatchUpdateIngressRulesResponse]
  /** Creates a firewall rule for the application. */
  def create(request: AnonAccesstoken): Request_[FirewallRule]
  /** Deletes the specified firewall rule. */
  def delete(request: AnonAccesstokenAltAppsIdBearertokenCallbackFields): Request_[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: AnonAccesstokenAltAppsIdBearertokenCallbackFields): Request_[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKey): Request_[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId): Request_[FirewallRule]
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: AnonAccesstoken => Request_[BatchUpdateIngressRulesResponse],
    create: AnonAccesstoken => Request_[FirewallRule],
    delete: AnonAccesstokenAltAppsIdBearertokenCallbackFields => Request_[js.Object],
    get: AnonAccesstokenAltAppsIdBearertokenCallbackFields => Request_[FirewallRule],
    list: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKey => Request_[ListIngressRulesResponse],
    patch: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsIngressRulesId => Request_[FirewallRule]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[IngressRulesResource]
  }
}

