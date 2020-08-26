package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.ContactsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: String): Contact = js.native
  // Inserts a new contact.
  def insert(resource: Contact): Contact = js.native
  // Retrieves a list of contacts for the authenticated user.
  def list(): ContactsListResponse = js.native
  // Updates a contact in place. This method supports patch semantics.
  def patch(resource: Contact, id: String): Contact = js.native
  // Deletes a contact.
  def remove(id: String): Unit = js.native
  // Updates a contact in place.
  def update(resource: Contact, id: String): Contact = js.native
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
  @scala.inline
  implicit class ContactsCollectionOps[Self <: ContactsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: String => Contact): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Contact => Contact): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => ContactsListResponse): Self = this.set("list", js.Any.fromFunction0(value))
    @scala.inline
    def setPatch(value: (Contact, String) => Contact): Self = this.set("patch", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: (Contact, String) => Contact): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

