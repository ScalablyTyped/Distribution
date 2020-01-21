package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstoken
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountId
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: AnonAccesstoken): Request_[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: AnonAccesstokenAccountId): Request_[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: AnonAccesstokenAccountIdAlt): Request_[ListClientUserInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[ClientUserInvitation],
    get: AnonAccesstokenAccountId => Request_[ClientUserInvitation],
    list: AnonAccesstokenAccountIdAlt => Request_[ListClientUserInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InvitationsResource]
  }
}

