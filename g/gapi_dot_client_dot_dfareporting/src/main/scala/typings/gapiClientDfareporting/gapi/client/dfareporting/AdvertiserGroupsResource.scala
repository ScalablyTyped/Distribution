package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: Fields): Request[Unit]
  /** Gets one advertiser group by ID. */
  def get(request: Fields): Request[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: Key): Request[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: Fields): Request[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: Key): Request[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[AdvertiserGroup],
    insert: Key => Request[AdvertiserGroup],
    list: Oauthtoken => Request[AdvertiserGroupsListResponse],
    patch: Fields => Request[AdvertiserGroup],
    update: Key => Request[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

