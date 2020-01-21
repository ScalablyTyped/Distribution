package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditId
import typings.gapiClientAndroidpublisher.AnonAltEditIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: AnonAltEditIdFieldsKey): Request_[Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: AnonAltEditId): Request_[Unit]
  /** Fetches information about a localized store listing. */
  def get(request: AnonAltEditIdFieldsKey): Request_[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: AnonAltEditId): Request_[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: AnonAltEditIdFieldsKey): Request_[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: AnonAltEditIdFieldsKey): Request_[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: AnonAltEditIdFieldsKey => Request_[Unit],
    deleteall: AnonAltEditId => Request_[Unit],
    get: AnonAltEditIdFieldsKey => Request_[Listing],
    list: AnonAltEditId => Request_[ListingsListResponse],
    patch: AnonAltEditIdFieldsKey => Request_[Listing],
    update: AnonAltEditIdFieldsKey => Request_[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ListingsResource]
  }
}

