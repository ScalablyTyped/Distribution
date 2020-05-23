package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserGroupIds
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: Fields): Request[Advertiser]
  /** Inserts a new advertiser. */
  def insert(request: Key): Request[Advertiser]
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: AdvertiserGroupIds): Request[AdvertisersListResponse]
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: Fields): Request[Advertiser]
  /** Updates an existing advertiser. */
  def update(request: Key): Request[Advertiser]
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: Fields => Request[Advertiser],
    insert: Key => Request[Advertiser],
    list: AdvertiserGroupIds => Request[AdvertisersListResponse],
    patch: Fields => Request[Advertiser],
    update: Key => Request[Advertiser]
  ): AdvertisersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdvertisersResource]
  }
}

