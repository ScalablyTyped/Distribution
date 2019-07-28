package typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMirror.Anon_Alt
import typings.gapiDotClientDotMirror.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Gets a single contact by ID. */
  def get(request: Anon_Alt): Request[Contact]
  /** Inserts a new contact. */
  def insert(request: Anon_AltFields): Request[Contact]
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: Anon_AltFields): Request[ContactsListResponse]
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[Contact]
  /** Updates a contact in place. */
  def update(request: Anon_Alt): Request[Contact]
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[Contact],
    insert: Anon_AltFields => Request[Contact],
    list: Anon_AltFields => Request[ContactsListResponse],
    patch: Anon_Alt => Request[Contact],
    update: Anon_Alt => Request[Contact]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactsResource]
  }
}

