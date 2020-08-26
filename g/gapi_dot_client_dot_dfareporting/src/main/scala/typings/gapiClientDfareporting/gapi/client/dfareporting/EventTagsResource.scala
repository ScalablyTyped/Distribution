package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdId
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one event tag by ID. */
  def get(request: Fields): Request[EventTag] = js.native
  /** Inserts a new event tag. */
  def insert(request: Key): Request[EventTag] = js.native
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: AdId): Request[EventTagsListResponse] = js.native
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: Fields): Request[EventTag] = js.native
  /** Updates an existing event tag. */
  def update(request: Key): Request[EventTag] = js.native
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[EventTag],
    insert: Key => Request[EventTag],
    list: AdId => Request[EventTagsListResponse],
    patch: Fields => Request[EventTag],
    update: Key => Request[EventTag]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventTagsResource]
  }
  @scala.inline
  implicit class EventTagsResourceOps[Self <: EventTagsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[EventTag]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[EventTag]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AdId => Request[EventTagsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[EventTag]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[EventTag]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

