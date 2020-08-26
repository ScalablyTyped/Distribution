package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: typings.gapiClientSqladmin.anon.Database): Request[Operation] = js.native
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: typings.gapiClientSqladmin.anon.Database): Request[Database] = js.native
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation] = js.native
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: Fields): Request[DatabasesListResponse] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: typings.gapiClientSqladmin.anon.Database): Request[Operation] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: typings.gapiClientSqladmin.anon.Database): Request[Operation] = js.native
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientSqladmin.anon.Database => Request[Operation],
    get: typings.gapiClientSqladmin.anon.Database => Request[Database],
    insert: Fields => Request[Operation],
    list: Fields => Request[DatabasesListResponse],
    patch: typings.gapiClientSqladmin.anon.Database => Request[Operation],
    update: typings.gapiClientSqladmin.anon.Database => Request[Operation]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatabasesResource]
  }
  @scala.inline
  implicit class DatabasesResourceOps[Self <: DatabasesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientSqladmin.anon.Database => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientSqladmin.anon.Database => Request[Database]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[DatabasesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientSqladmin.anon.Database => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientSqladmin.anon.Database => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

