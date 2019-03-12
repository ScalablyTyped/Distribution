package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Fetches information about a localized store listing. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    deleteall: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Listing],
    list: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId => gapiDotClientLib.gapiNs.clientNs.Request[ListingsListResponse],
    patch: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Listing],
    update: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ListingsResource]
  }
}

