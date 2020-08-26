package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CampaignIds
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: Fields): Request[PlacementGroup] = js.native
  /** Inserts a new placement group. */
  def insert(request: Key): Request[PlacementGroup] = js.native
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: CampaignIds): Request[PlacementGroupsListResponse] = js.native
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: Fields): Request[PlacementGroup] = js.native
  /** Updates an existing placement group. */
  def update(request: Key): Request[PlacementGroup] = js.native
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[PlacementGroup],
    insert: Key => Request[PlacementGroup],
    list: CampaignIds => Request[PlacementGroupsListResponse],
    patch: Fields => Request[PlacementGroup],
    update: Key => Request[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementGroupsResource]
  }
  @scala.inline
  implicit class PlacementGroupsResourceOps[Self <: PlacementGroupsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[PlacementGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[PlacementGroup]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: CampaignIds => Request[PlacementGroupsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[PlacementGroup]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[PlacementGroup]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

