package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAlt
import typings.gapiClientAdexchangebuyer2.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: AnonBearertoken): Request_[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: AnonBearertoken): Request_[ClientUser]
}

object UsersResource {
  @scala.inline
  def apply(
    get: AnonBearertoken => Request_[ClientUser],
    list: AnonAlt => Request_[ListClientUsersResponse],
    update: AnonBearertoken => Request_[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UsersResource]
  }
}

