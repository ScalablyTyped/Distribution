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
    delete: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    deleteall: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Listing]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListingsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Listing]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Listing]
    ]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = delete, deleteall = deleteall, get = get, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ListingsResource]
  }
}

