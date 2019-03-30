package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftsCollection extends js.Object {
  // Creates a new draft with the DRAFT label.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
  // Creates a new draft with the DRAFT label.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
  // Gets the specified draft.
  def get(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
  // Gets the specified draft.
  def get(userId: java.lang.String, id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
  // Lists the drafts in the user's mailbox.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListDraftsResponse = js.native
  // Lists the drafts in the user's mailbox.
  def list(userId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.ListDraftsResponse = js.native
  // Immediately and permanently deletes the specified draft. Does not simply trash it.
  def remove(userId: java.lang.String, id: java.lang.String): scala.Unit = js.native
  // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
  def send(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers.
  def send(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Message = js.native
  // Replaces a draft's content.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
  // Replaces a draft's content.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft,
    userId: java.lang.String,
    id: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs.Draft = js.native
}

