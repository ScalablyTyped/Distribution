package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Accesstoken
import typings.gapiClientAdexchangebuyer2.anon.AccountId
import typings.gapiClientAdexchangebuyer2.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: Accesstoken): Request[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: AccountId): Request[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: Alt): Request[ListClientUserInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[ClientUserInvitation],
    get: AccountId => Request[ClientUserInvitation],
    list: Alt => Request[ListClientUserInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InvitationsResource]
  }
}

