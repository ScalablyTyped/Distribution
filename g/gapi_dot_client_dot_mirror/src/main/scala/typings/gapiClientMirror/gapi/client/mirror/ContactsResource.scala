package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Gets a single contact by ID. */
  def get(request: Alt): Request[Contact] = js.native
  /** Inserts a new contact. */
  def insert(request: Fields): Request[Contact] = js.native
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: Fields): Request[ContactsListResponse] = js.native
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: Alt): Request[Contact] = js.native
  /** Updates a contact in place. */
  def update(request: Alt): Request[Contact] = js.native
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Contact],
    insert: Fields => Request[Contact],
    list: Fields => Request[ContactsListResponse],
    patch: Alt => Request[Contact],
    update: Alt => Request[Contact]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ContactsResource]
  }
  @scala.inline
  implicit class ContactsResourceOps[Self <: ContactsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Contact]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Contact]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[ContactsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[Contact]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[Contact]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

