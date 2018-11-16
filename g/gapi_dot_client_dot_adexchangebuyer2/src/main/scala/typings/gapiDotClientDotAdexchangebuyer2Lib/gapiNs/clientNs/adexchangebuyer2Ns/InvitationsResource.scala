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
  def create(request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPrettyPrintBearertokenAccountIdCallbackQuotaUserKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[ClientUserInvitation]
  /**
               * Lists all the client users invitations for a client
               * with a given account ID.
               */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrintBearertokenPageTokenAccountId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListClientUserInvitationsResponse]
}

