package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserGroupIds
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: Anon_AltFields): Request[Advertiser]
  /** Inserts a new advertiser. */
  def insert(request: Anon_AltFieldsKey): Request[Advertiser]
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserGroupIds): Request[AdvertisersListResponse]
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Advertiser]
  /** Updates an existing advertiser. */
  def update(request: Anon_AltFieldsKey): Request[Advertiser]
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[Advertiser],
    insert: Anon_AltFieldsKey => Request[Advertiser],
    list: Anon_AdvertiserGroupIds => Request[AdvertisersListResponse],
    patch: Anon_AltFields => Request[Advertiser],
    update: Anon_AltFieldsKey => Request[Advertiser]
  ): AdvertisersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdvertisersResource]
  }
}

