package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAlt
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: AnonAccesstokenAccountIdAltBearertoken): Request_[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: AnonAccesstokenAccountIdAlt): Request_[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: AnonAccesstokenAccountIdAltBearertoken): Request_[ClientUser]
}

object UsersResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAccountIdAltBearertoken => Request_[ClientUser],
    list: AnonAccesstokenAccountIdAlt => Request_[ListClientUsersResponse],
    update: AnonAccesstokenAccountIdAltBearertoken => Request_[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

