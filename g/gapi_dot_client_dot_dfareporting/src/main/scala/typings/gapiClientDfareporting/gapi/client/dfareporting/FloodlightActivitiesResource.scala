package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.FloodlightActivityGroupIds
import typings.gapiClientDfareporting.anon.FloodlightActivityId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: FloodlightActivityId): Request[FloodlightActivitiesGenerateTagResponse] = js.native
  /** Gets one floodlight activity by ID. */
  def get(request: Fields): Request[FloodlightActivity] = js.native
  /** Inserts a new floodlight activity. */
  def insert(request: Key): Request[FloodlightActivity] = js.native
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: FloodlightActivityGroupIds): Request[FloodlightActivitiesListResponse] = js.native
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightActivity] = js.native
  /** Updates an existing floodlight activity. */
  def update(request: Key): Request[FloodlightActivity] = js.native
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    generatetag: FloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse],
    get: Fields => Request[FloodlightActivity],
    insert: Key => Request[FloodlightActivity],
    list: FloodlightActivityGroupIds => Request[FloodlightActivitiesListResponse],
    patch: Fields => Request[FloodlightActivity],
    update: Key => Request[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
  @scala.inline
  implicit class FloodlightActivitiesResourceOps[Self <: FloodlightActivitiesResource] (val x: Self) extends AnyVal {
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
    def setGeneratetag(value: FloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse]): Self = this.set("generatetag", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[FloodlightActivity]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[FloodlightActivity]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: FloodlightActivityGroupIds => Request[FloodlightActivitiesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[FloodlightActivity]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[FloodlightActivity]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

