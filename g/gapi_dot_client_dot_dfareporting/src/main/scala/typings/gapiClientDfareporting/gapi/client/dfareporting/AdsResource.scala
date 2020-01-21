package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonActiveAdvertiserId
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: AnonAltFields): Request_[Ad]
  /** Inserts a new ad. */
  def insert(request: AnonAltFieldsKey): Request_[Ad]
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserId): Request_[AdsListResponse]
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Ad]
  /** Updates an existing ad. */
  def update(request: AnonAltFieldsKey): Request_[Ad]
}

object AdsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Ad],
    insert: AnonAltFieldsKey => Request_[Ad],
    list: AnonActiveAdvertiserId => Request_[AdsListResponse],
    patch: AnonAltFields => Request_[Ad],
    update: AnonAltFieldsKey => Request_[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdsResource]
  }
}

