package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
  // Inserts a new contact.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
  // Retrieves a list of contacts for the authenticated user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.ContactsListResponse
  // Updates a contact in place. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
  // Deletes a contact.
  def remove(id: java.lang.String): scala.Unit
  // Updates a contact in place.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    id: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
}

object ContactsCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    insert: googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.ContactsListResponse,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact,
    remove: java.lang.String => scala.Unit,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
  ): ContactsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[ContactsCollection]
  }
}

