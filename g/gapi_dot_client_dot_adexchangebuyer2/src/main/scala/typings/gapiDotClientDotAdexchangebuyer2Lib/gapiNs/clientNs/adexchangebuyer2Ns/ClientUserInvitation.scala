package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientUserInvitation extends js.Object {
  /**
               * Numerical account ID of the client buyer
               * that the invited user is associated with.
               * The value of this field is ignored in create operations.
               */
  var clientAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The email address to which the invitation is sent. Email
               * addresses should be unique among all client users under each sponsor
               * buyer.
               */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The unique numerical ID of the invitation that is sent to the user.
               * The value of this field is ignored in create operations.
               */
  var invitationId: js.UndefOr[java.lang.String] = js.undefined
}

