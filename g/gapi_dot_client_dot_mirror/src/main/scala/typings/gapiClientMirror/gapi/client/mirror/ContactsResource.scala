package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAlt
import typings.gapiClientMirror.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Gets a single contact by ID. */
  def get(request: AnonAlt): Request_[Contact]
  /** Inserts a new contact. */
  def insert(request: AnonAltFields): Request_[Contact]
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: AnonAltFields): Request_[ContactsListResponse]
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Contact]
  /** Updates a contact in place. */
  def update(request: AnonAlt): Request_[Contact]
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[Contact],
    insert: AnonAltFields => Request_[Contact],
    list: AnonAltFields => Request_[ContactsListResponse],
    patch: AnonAlt => Request_[Contact],
    update: AnonAlt => Request_[Contact]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactsResource]
  }
}

