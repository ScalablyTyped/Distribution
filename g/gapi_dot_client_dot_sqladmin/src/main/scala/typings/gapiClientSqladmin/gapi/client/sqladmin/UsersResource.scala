package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: Host): Request[Operation] = js.native
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: Fields): Request[Operation] = js.native
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: Fields): Request[UsersListResponse] = js.native
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: Host): Request[Operation] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    delete: Host => Request[Operation],
    insert: Fields => Request[Operation],
    list: Fields => Request[UsersListResponse],
    update: Host => Request[Operation]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Host => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[UsersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Host => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

