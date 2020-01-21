package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsIds
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one advertiser group by ID. */
  def get(request: AnonAltFields): Request_[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: AnonAltFieldsKey): Request_[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIds): Request_[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: AnonAltFieldsKey): Request_[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[AdvertiserGroup],
    insert: AnonAltFieldsKey => Request_[AdvertiserGroup],
    list: AnonAltFieldsIds => Request_[AdvertiserGroupsListResponse],
    patch: AnonAltFields => Request_[AdvertiserGroup],
    update: AnonAltFieldsKey => Request_[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

