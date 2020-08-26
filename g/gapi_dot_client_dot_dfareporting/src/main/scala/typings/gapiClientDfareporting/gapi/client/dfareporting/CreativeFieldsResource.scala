package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one creative field by ID. */
  def get(request: Fields): Request[CreativeField] = js.native
  /** Inserts a new creative field. */
  def insert(request: Key): Request[CreativeField] = js.native
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: SearchString): Request[CreativeFieldsListResponse] = js.native
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeField] = js.native
  /** Updates an existing creative field. */
  def update(request: Key): Request[CreativeField] = js.native
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[CreativeField],
    insert: Key => Request[CreativeField],
    list: SearchString => Request[CreativeFieldsListResponse],
    patch: Fields => Request[CreativeField],
    update: Key => Request[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldsResource]
  }
  @scala.inline
  implicit class CreativeFieldsResourceOps[Self <: CreativeFieldsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[CreativeField]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[CreativeField]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: SearchString => Request[CreativeFieldsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[CreativeField]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[CreativeField]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

