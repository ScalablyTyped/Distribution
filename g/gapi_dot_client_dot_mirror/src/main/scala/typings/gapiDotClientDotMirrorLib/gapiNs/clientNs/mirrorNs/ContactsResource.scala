package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a single contact by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Contact]
  /** Inserts a new contact. */
  def insert(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Contact]
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ContactsListResponse]
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Contact]
  /** Updates a contact in place. */
  def update(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Contact]
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Contact],
    insert: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Contact],
    list: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[ContactsListResponse],
    patch: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Contact],
    update: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Contact]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactsResource]
  }
}

