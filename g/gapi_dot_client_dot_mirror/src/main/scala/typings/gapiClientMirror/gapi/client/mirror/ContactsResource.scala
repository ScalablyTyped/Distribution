package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: Alt): Request[Unit]
  /** Gets a single contact by ID. */
  def get(request: Alt): Request[Contact]
  /** Inserts a new contact. */
  def insert(request: Fields): Request[Contact]
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: Fields): Request[ContactsListResponse]
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: Alt): Request[Contact]
  /** Updates a contact in place. */
  def update(request: Alt): Request[Contact]
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
}

