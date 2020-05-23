package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Accesstoken
import typings.gapiClientAppengine.anon.IngressRulesId
import typings.gapiClientAppengine.anon.Key
import typings.gapiClientAppengine.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngressRulesResource extends js.Object {
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
    * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: Accesstoken): Request[BatchUpdateIngressRulesResponse]
  /** Creates a firewall rule for the application. */
  def create(request: Accesstoken): Request[FirewallRule]
  /** Deletes the specified firewall rule. */
  def delete(request: IngressRulesId): Request[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: IngressRulesId): Request[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: Key): Request[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(request: Oauthtoken): Request[FirewallRule]
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: Accesstoken => Request[BatchUpdateIngressRulesResponse],
    create: Accesstoken => Request[FirewallRule],
    delete: IngressRulesId => Request[js.Object],
    get: IngressRulesId => Request[FirewallRule],
    list: Key => Request[ListIngressRulesResponse],
    patch: Oauthtoken => Request[FirewallRule]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[IngressRulesResource]
  }
}

