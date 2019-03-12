package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Retrieves an existing client user. */
  def get(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ClientUser]
  /**
    * Lists all the known client users for a specified
    * sponsor buyer account ID.
    */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListClientUsersResponse]
  /**
    * Updates an existing client user.
    * Only the user status can be changed on update.
    */
  def update(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ClientUser]
}

object UsersResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ClientUser],
    list: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListClientUsersResponse],
    update: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ClientUser]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[UsersResource]
  }
}

