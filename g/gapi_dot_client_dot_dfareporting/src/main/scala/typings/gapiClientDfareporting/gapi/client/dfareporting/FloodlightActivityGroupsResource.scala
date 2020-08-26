package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.FloodlightConfigurationId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: Fields): Request[FloodlightActivityGroup] = js.native
  /** Inserts a new floodlight activity group. */
  def insert(request: Key): Request[FloodlightActivityGroup] = js.native
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: FloodlightConfigurationId): Request[FloodlightActivityGroupsListResponse] = js.native
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightActivityGroup] = js.native
  /** Updates an existing floodlight activity group. */
  def update(request: Key): Request[FloodlightActivityGroup] = js.native
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[FloodlightActivityGroup],
    insert: Key => Request[FloodlightActivityGroup],
    list: FloodlightConfigurationId => Request[FloodlightActivityGroupsListResponse],
    patch: Fields => Request[FloodlightActivityGroup],
    update: Key => Request[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
  @scala.inline
  implicit class FloodlightActivityGroupsResourceOps[Self <: FloodlightActivityGroupsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[FloodlightActivityGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[FloodlightActivityGroup]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: FloodlightConfigurationId => Request[FloodlightActivityGroupsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[FloodlightActivityGroup]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[FloodlightActivityGroup]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

