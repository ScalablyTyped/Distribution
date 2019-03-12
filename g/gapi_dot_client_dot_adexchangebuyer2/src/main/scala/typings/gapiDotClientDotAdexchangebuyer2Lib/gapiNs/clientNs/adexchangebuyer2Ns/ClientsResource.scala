package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsResource extends js.Object {
  var invitations: InvitationsResource
  var users: UsersResource
  /** Creates a new client buyer. */
  def create(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Client]
  /** Gets a client buyer with a given client account ID. */
  def get(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Client]
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListClientsResponse]
  /** Updates an existing client buyer. */
  def update(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Client]
}

object ClientsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[Client],
    get: gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Client],
    invitations: InvitationsResource,
    list: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[ListClientsResponse],
    update: gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Client],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), invitations = invitations, list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), users = users)
  
    __obj.asInstanceOf[ClientsResource]
  }
}

