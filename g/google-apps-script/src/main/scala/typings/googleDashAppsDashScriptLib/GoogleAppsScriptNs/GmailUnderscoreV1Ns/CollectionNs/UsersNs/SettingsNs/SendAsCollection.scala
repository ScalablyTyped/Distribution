package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAsCollection extends js.Object {
  var SmimeInfo: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.SendAsNs.SmimeInfoCollection
  ] = js.undefined
  // Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs
  // Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection.
  def get(userId: java.lang.String, sendAsEmail: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs
  // Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom "from" aliases.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListSendAsResponse
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    userId: java.lang.String,
    sendAsEmail: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs
  // Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: java.lang.String, sendAsEmail: java.lang.String): scala.Unit
  // Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
  // Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    userId: java.lang.String,
    sendAsEmail: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs
  // Sends a verification email to the specified send-as alias address. The verification status must be pending.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def verify(userId: java.lang.String, sendAsEmail: java.lang.String): scala.Unit
}

object SendAsCollection {
  @scala.inline
  def apply(
    create: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListSendAsResponse,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    remove: (java.lang.String, java.lang.String) => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.SendAs,
    verify: (java.lang.String, java.lang.String) => scala.Unit,
    SmimeInfo: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs.SettingsNs.SendAsNs.SmimeInfoCollection = null
  ): SendAsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update), verify = js.Any.fromFunction2(verify))
    if (SmimeInfo != null) __obj.updateDynamic("SmimeInfo")(SmimeInfo)
    __obj.asInstanceOf[SendAsCollection]
  }
}

