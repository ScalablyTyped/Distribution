package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountId): gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListClientUserInvitationsResponse]
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
    ],
    get: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListClientUserInvitationsResponse]
    ]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = create, get = get, list = list)
  
    __obj.asInstanceOf[InvitationsResource]
  }
}

