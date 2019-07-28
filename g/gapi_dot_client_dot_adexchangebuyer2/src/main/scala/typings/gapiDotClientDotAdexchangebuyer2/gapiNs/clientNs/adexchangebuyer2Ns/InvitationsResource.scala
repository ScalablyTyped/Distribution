package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_Accesstoken
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountId
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: Anon_Accesstoken): Request[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: Anon_AccesstokenAccountId): Request[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: Anon_AccesstokenAccountIdAlt): Request[ListClientUserInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[ClientUserInvitation],
    get: Anon_AccesstokenAccountId => Request[ClientUserInvitation],
    list: Anon_AccesstokenAccountIdAlt => Request[ListClientUserInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InvitationsResource]
  }
}

