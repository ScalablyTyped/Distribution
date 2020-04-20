package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserId
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: AnonFields): Request_[Ad]
  /** Inserts a new ad. */
  def insert(request: AnonKey): Request_[Ad]
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserId): Request_[AdsListResponse]
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Ad]
  /** Updates an existing ad. */
  def update(request: AnonKey): Request_[Ad]
}

object AdsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Ad],
    insert: AnonKey => Request_[Ad],
    list: AnonAdvertiserId => Request_[AdsListResponse],
    patch: AnonFields => Request_[Ad],
    update: AnonKey => Request_[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdsResource]
  }
}

