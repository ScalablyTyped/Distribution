package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Alt
import typings.gapiClientAdexchangebuyer2.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: Bearertoken): Request[ClientUser] = js.native
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: Alt): Request[ListClientUsersResponse] = js.native
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: Bearertoken): Request[ClientUser] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    get: Bearertoken => Request[ClientUser],
    list: Alt => Request[ListClientUsersResponse],
    update: Bearertoken => Request[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
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
    def setGet(value: Bearertoken => Request[ClientUser]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListClientUsersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Bearertoken => Request[ClientUser]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

