package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.GroupNumber
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeGroupsResource extends js.Object {
  /** Gets one creative group by ID. */
  def get(request: Fields): Request[CreativeGroup] = js.native
  /** Inserts a new creative group. */
  def insert(request: Key): Request[CreativeGroup] = js.native
  /** Retrieves a list of creative groups, possibly filtered. This method supports paging. */
  def list(request: GroupNumber): Request[CreativeGroupsListResponse] = js.native
  /** Updates an existing creative group. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeGroup] = js.native
  /** Updates an existing creative group. */
  def update(request: Key): Request[CreativeGroup] = js.native
}

object CreativeGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[CreativeGroup],
    insert: Key => Request[CreativeGroup],
    list: GroupNumber => Request[CreativeGroupsListResponse],
    patch: Fields => Request[CreativeGroup],
    update: Key => Request[CreativeGroup]
  ): CreativeGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeGroupsResource]
  }
  @scala.inline
  implicit class CreativeGroupsResourceOps[Self <: CreativeGroupsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[CreativeGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[CreativeGroup]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: GroupNumber => Request[CreativeGroupsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[CreativeGroup]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[CreativeGroup]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

