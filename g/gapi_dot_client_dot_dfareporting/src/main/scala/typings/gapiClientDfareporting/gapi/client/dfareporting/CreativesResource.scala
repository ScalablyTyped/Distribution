package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Archived
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativesResource extends js.Object {
  /** Gets one creative by ID. */
  def get(request: Fields): Request[Creative] = js.native
  /** Inserts a new creative. */
  def insert(request: Key): Request[Creative] = js.native
  /** Retrieves a list of creatives, possibly filtered. This method supports paging. */
  def list(request: Archived): Request[CreativesListResponse] = js.native
  /** Updates an existing creative. This method supports patch semantics. */
  def patch(request: Fields): Request[Creative] = js.native
  /** Updates an existing creative. */
  def update(request: Key): Request[Creative] = js.native
}

object CreativesResource {
  @scala.inline
  def apply(
    get: Fields => Request[Creative],
    insert: Key => Request[Creative],
    list: Archived => Request[CreativesListResponse],
    patch: Fields => Request[Creative],
    update: Key => Request[Creative]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativesResource]
  }
  @scala.inline
  implicit class CreativesResourceOps[Self <: CreativesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Creative]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Creative]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Archived => Request[CreativesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Creative]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Creative]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

