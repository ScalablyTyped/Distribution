package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddressesCollection extends js.Object {
  // Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress
  // Gets the specified forwarding address.
  def get(userId: java.lang.String, forwardingEmail: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress
  // Lists the forwarding addresses for the specified account.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListForwardingAddressesResponse
  // Deletes the specified forwarding address and revokes any verification that may have been required.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: java.lang.String, forwardingEmail: java.lang.String): scala.Unit
}

object ForwardingAddressesCollection {
  @scala.inline
  def apply(
    create: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress,
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ForwardingAddress,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListForwardingAddressesResponse,
    remove: (java.lang.String, java.lang.String) => scala.Unit
  ): ForwardingAddressesCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[ForwardingAddressesCollection]
  }
}

