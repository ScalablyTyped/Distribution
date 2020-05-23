package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Accesstoken
import typings.gapiClientAdexchangebuyer2.anon.Callback
import typings.gapiClientAdexchangebuyer2.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsResource extends js.Object {
  var invitations: InvitationsResource
  var users: UsersResource
  /** Creates a new client buyer. */
  def create(request: Callback): Request[Client]
  /** Gets a client buyer with a given client account ID. */
  def get(request: Accesstoken): Request[Client]
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: Fields): Request[ListClientsResponse]
  /** Updates an existing client buyer. */
  def update(request: Accesstoken): Request[Client]
}

object ClientsResource {
  @scala.inline
  def apply(
    create: Callback => Request[Client],
    get: Accesstoken => Request[Client],
    invitations: InvitationsResource,
    list: Fields => Request[ListClientsResponse],
    update: Accesstoken => Request[Client],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), invitations = invitations.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsResource]
  }
}

