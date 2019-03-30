package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact
  // Inserts a new contact.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact
  // Retrieves a list of contacts for the authenticated user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.ContactsListResponse
  // Updates a contact in place. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact
  // Deletes a contact.
  def remove(id: java.lang.String): scala.Unit
  // Updates a contact in place.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact
}

object ContactsCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact,
    insert: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact,
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.ContactsListResponse,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact,
    remove: java.lang.String => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs.Contact
  ): ContactsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[ContactsCollection]
  }
}

