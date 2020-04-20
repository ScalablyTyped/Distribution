package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one advertiser group by ID. */
  def get(request: AnonFields): Request_[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: AnonKey): Request_[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: AnonKey): Request_[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[AdvertiserGroup],
    insert: AnonKey => Request_[AdvertiserGroup],
    list: AnonOauthtoken => Request_[AdvertiserGroupsListResponse],
    patch: AnonFields => Request_[AdvertiserGroup],
    update: AnonKey => Request_[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

