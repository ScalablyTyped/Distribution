package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one advertiser group by ID. */
  def get(request: Fields): Request[AdvertiserGroup] = js.native
  /** Inserts a new advertiser group. */
  def insert(request: Key): Request[AdvertiserGroup] = js.native
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[AdvertiserGroupsListResponse] = js.native
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: Fields): Request[AdvertiserGroup] = js.native
  /** Updates an existing advertiser group. */
  def update(request: Key): Request[AdvertiserGroup] = js.native
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
  @scala.inline
  implicit class AdvertiserGroupsResourceOps[Self <: AdvertiserGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[AdvertiserGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[AdvertiserGroup]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Oauthtoken => Request[AdvertiserGroupsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[AdvertiserGroup]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[AdvertiserGroup]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

