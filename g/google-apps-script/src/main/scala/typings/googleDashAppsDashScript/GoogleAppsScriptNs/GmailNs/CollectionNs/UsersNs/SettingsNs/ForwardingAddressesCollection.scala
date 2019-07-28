package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.ForwardingAddress
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.ListForwardingAddressesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddressesCollection extends js.Object {
  // Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: ForwardingAddress, userId: String): ForwardingAddress
  // Gets the specified forwarding address.
  def get(userId: String, forwardingEmail: String): ForwardingAddress
  // Lists the forwarding addresses for the specified account.
  def list(userId: String): ListForwardingAddressesResponse
  // Deletes the specified forwarding address and revokes any verification that may have been required.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, forwardingEmail: String): Unit
}

object ForwardingAddressesCollection {
  @scala.inline
  def apply(
    create: (ForwardingAddress, String) => ForwardingAddress,
    get: (String, String) => ForwardingAddress,
    list: String => ListForwardingAddressesResponse,
    remove: (String, String) => Unit
  ): ForwardingAddressesCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[ForwardingAddressesCollection]
  }
}

