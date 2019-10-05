package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIds
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets one advertiser group by ID. */
  def get(request: Anon_AltFields): Request[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: Anon_AltFieldsKey): Request[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIds): Request[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: Anon_AltFieldsKey): Request[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[AdvertiserGroup],
    insert: Anon_AltFieldsKey => Request[AdvertiserGroup],
    list: Anon_AltFieldsIds => Request[AdvertiserGroupsListResponse],
    patch: Anon_AltFields => Request[AdvertiserGroup],
    update: Anon_AltFieldsKey => Request[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

