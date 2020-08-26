package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Compatibilities
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.PlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: PlacementIds): Request[PlacementsGenerateTagsResponse] = js.native
  /** Gets one placement by ID. */
  def get(request: Fields): Request[Placement] = js.native
  /** Inserts a new placement. */
  def insert(request: Key): Request[Placement] = js.native
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: Compatibilities): Request[PlacementsListResponse] = js.native
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: Fields): Request[Placement] = js.native
  /** Updates an existing placement. */
  def update(request: Key): Request[Placement] = js.native
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: PlacementIds => Request[PlacementsGenerateTagsResponse],
    get: Fields => Request[Placement],
    insert: Key => Request[Placement],
    list: Compatibilities => Request[PlacementsListResponse],
    patch: Fields => Request[Placement],
    update: Key => Request[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementsResource]
  }
  @scala.inline
  implicit class PlacementsResourceOps[Self <: PlacementsResource] (val x: Self) extends AnyVal {
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
    def setGeneratetags(value: PlacementIds => Request[PlacementsGenerateTagsResponse]): Self = this.set("generatetags", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Placement]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Placement]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Compatibilities => Request[PlacementsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Placement]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Placement]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

