package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditId
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: Anon_AltEditIdFieldsKey): Request[Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: Anon_AltEditId): Request[Unit]
  /** Fetches information about a localized store listing. */
  def get(request: Anon_AltEditIdFieldsKey): Request[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: Anon_AltEditId): Request[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: Anon_AltEditIdFieldsKey): Request[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: Anon_AltEditIdFieldsKey): Request[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: Anon_AltEditIdFieldsKey => Request[Unit],
    deleteall: Anon_AltEditId => Request[Unit],
    get: Anon_AltEditIdFieldsKey => Request[Listing],
    list: Anon_AltEditId => Request[ListingsListResponse],
    patch: Anon_AltEditIdFieldsKey => Request[Listing],
    update: Anon_AltEditIdFieldsKey => Request[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ListingsResource]
  }
}

