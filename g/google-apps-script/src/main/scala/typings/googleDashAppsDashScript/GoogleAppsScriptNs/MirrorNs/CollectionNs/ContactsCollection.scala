package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.Contact
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs.ContactsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: String): Contact
  // Inserts a new contact.
  def insert(resource: Contact): Contact
  // Retrieves a list of contacts for the authenticated user.
  def list(): ContactsListResponse
  // Updates a contact in place. This method supports patch semantics.
  def patch(resource: Contact, id: String): Contact
  // Deletes a contact.
  def remove(id: String): Unit
  // Updates a contact in place.
  def update(resource: Contact, id: String): Contact
}

object ContactsCollection {
  @scala.inline
  def apply(
    get: String => Contact,
    insert: Contact => Contact,
    list: () => ContactsListResponse,
    patch: (Contact, String) => Contact,
    remove: String => Unit,
    update: (Contact, String) => Contact
  ): ContactsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[ContactsCollection]
  }
}

