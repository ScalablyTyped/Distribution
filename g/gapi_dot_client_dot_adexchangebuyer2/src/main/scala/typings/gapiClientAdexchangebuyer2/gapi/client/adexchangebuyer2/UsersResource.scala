package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Alt
import typings.gapiClientAdexchangebuyer2.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: Bearertoken): Request[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: Alt): Request[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: Bearertoken): Request[ClientUser]
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
}

