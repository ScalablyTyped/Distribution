package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAlt
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: Anon_AccesstokenAccountIdAltBearertoken): Request[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: Anon_AccesstokenAccountIdAlt): Request[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: Anon_AccesstokenAccountIdAltBearertoken): Request[ClientUser]
}

object UsersResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAccountIdAltBearertoken => Request[ClientUser],
    list: Anon_AccesstokenAccountIdAlt => Request[ListClientUsersResponse],
    update: Anon_AccesstokenAccountIdAltBearertoken => Request[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

