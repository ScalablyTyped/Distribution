package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserGroupIds
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: AnonAltFields): Request_[Advertiser]
  /** Inserts a new advertiser. */
  def insert(request: AnonAltFieldsKey): Request_[Advertiser]
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserGroupIds): Request_[AdvertisersListResponse]
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Advertiser]
  /** Updates an existing advertiser. */
  def update(request: AnonAltFieldsKey): Request_[Advertiser]
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[Advertiser],
    insert: AnonAltFieldsKey => Request_[Advertiser],
    list: AnonAdvertiserGroupIds => Request_[AdvertisersListResponse],
    patch: AnonAltFields => Request_[Advertiser],
    update: AnonAltFieldsKey => Request_[Advertiser]
  ): AdvertisersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdvertisersResource]
  }
}

