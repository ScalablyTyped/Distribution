package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Alt
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Retrieves a specific column by its ID. */
  def get(request: Alt): Request[Column] = js.native
  /** Adds a new column to the table. */
  def insert(request: Fields): Request[Column] = js.native
  /** Retrieves a list of columns. */
  def list(request: Key): Request[ColumnList] = js.native
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: Alt): Request[Column] = js.native
  /** Updates the name or type of an existing column. */
  def update(request: Alt): Request[Column] = js.native
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Column],
    insert: Fields => Request[Column],
    list: Key => Request[ColumnList],
    patch: Alt => Request[Column],
    update: Alt => Request[Column]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ColumnResource]
  }
  @scala.inline
  implicit class ColumnResourceOps[Self <: ColumnResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Column]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Column]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ColumnList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[Column]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[Column]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

