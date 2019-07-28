package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_Accesstoken
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallback
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsResource extends js.Object {
  var invitations: InvitationsResource
  var users: UsersResource
  /** Creates a new client buyer. */
  def create(request: Anon_AccesstokenAccountIdAltBearertokenCallback): Request[Client]
  /** Gets a client buyer with a given client account ID. */
  def get(request: Anon_Accesstoken): Request[Client]
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFields): Request[ListClientsResponse]
  /** Updates an existing client buyer. */
  def update(request: Anon_Accesstoken): Request[Client]
}

object ClientsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAccountIdAltBearertokenCallback => Request[Client],
    get: Anon_Accesstoken => Request[Client],
    invitations: InvitationsResource,
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFields => Request[ListClientsResponse],
    update: Anon_Accesstoken => Request[Client],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), invitations = invitations, list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), users = users)
  
    __obj.asInstanceOf[ClientsResource]
  }
}

