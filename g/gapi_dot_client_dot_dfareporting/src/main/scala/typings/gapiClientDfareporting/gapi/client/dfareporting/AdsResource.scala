package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserId
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: Fields): Request[Ad]
  /** Inserts a new ad. */
  def insert(request: Key): Request[Ad]
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AdvertiserId): Request[AdsListResponse]
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: Fields): Request[Ad]
  /** Updates an existing ad. */
  def update(request: Key): Request[Ad]
}

object AdsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Ad],
    insert: Key => Request[Ad],
    list: AdvertiserId => Request[AdsListResponse],
    patch: Fields => Request[Ad],
    update: Key => Request[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdsResource]
  }
}

