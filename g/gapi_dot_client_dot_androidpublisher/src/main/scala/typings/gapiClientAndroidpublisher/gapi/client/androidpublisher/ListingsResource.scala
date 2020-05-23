package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import typings.gapiClientAndroidpublisher.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: Key): Request[Unit]
  /** Deletes all localized listings from an edit. */
  def deleteall(request: EditId): Request[Unit]
  /** Fetches information about a localized store listing. */
  def get(request: Key): Request[Listing]
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: EditId): Request[ListingsListResponse]
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: Key): Request[Listing]
  /** Creates or updates a localized store listing. */
  def update(request: Key): Request[Listing]
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: Key => Request[Unit],
    deleteall: EditId => Request[Unit],
    get: Key => Request[Listing],
    list: EditId => Request[ListingsListResponse],
    patch: Key => Request[Listing],
    update: Key => Request[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ListingsResource]
  }
}

