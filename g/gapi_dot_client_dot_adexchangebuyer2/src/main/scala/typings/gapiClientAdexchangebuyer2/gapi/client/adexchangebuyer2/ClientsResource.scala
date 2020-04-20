package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstoken
import typings.gapiClientAdexchangebuyer2.AnonCallback
import typings.gapiClientAdexchangebuyer2.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsResource extends js.Object {
  var invitations: InvitationsResource
  var users: UsersResource
  /** Creates a new client buyer. */
  def create(request: AnonCallback): Request_[Client]
  /** Gets a client buyer with a given client account ID. */
  def get(request: AnonAccesstoken): Request_[Client]
  /** Lists all the clients for the current sponsor buyer. */
  def list(request: AnonFields): Request_[ListClientsResponse]
  /** Updates an existing client buyer. */
  def update(request: AnonAccesstoken): Request_[Client]
}

object ClientsResource {
  @scala.inline
  def apply(
    create: AnonCallback => Request_[Client],
    get: AnonAccesstoken => Request_[Client],
    invitations: InvitationsResource,
    list: AnonFields => Request_[ListClientsResponse],
    update: AnonAccesstoken => Request_[Client],
    users: UsersResource
  ): ClientsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), invitations = invitations.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsResource]
  }
}

