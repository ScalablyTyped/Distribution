package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsCollection extends js.Object {
  // Creates a new label.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
  // Gets the specified label.
  def get(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
  // Lists all labels in the user's mailbox.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListLabelsResponse
  // Updates the specified label. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    userId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
  // Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
  def remove(userId: java.lang.String, id: java.lang.String): scala.Unit
  // Updates the specified label.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    userId: java.lang.String,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
}

object LabelsCollection {
  @scala.inline
  def apply(
    create: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListLabelsResponse,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label,
    remove: (java.lang.String, java.lang.String) => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Label
  ): LabelsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[LabelsCollection]
  }
}

