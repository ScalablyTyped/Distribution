package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonEditId
import typings.gapiClientAndroidpublisher.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: AnonKey): Request_[Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: AnonEditId): Request_[Unit]
  /** Fetches information about a localized store listing. */
  def get(request: AnonKey): Request_[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: AnonEditId): Request_[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: AnonKey): Request_[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: AnonKey => Request_[Unit],
    deleteall: AnonEditId => Request_[Unit],
    get: AnonKey => Request_[Listing],
    list: AnonEditId => Request_[ListingsListResponse],
    patch: AnonKey => Request_[Listing],
    update: AnonKey => Request_[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ListingsResource]
  }
}

