package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUserInvitation extends js.Object {
  /**
    * Numerical account ID of the client buyer
    * that the invited user is associated with.
    * The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  /**
    * The email address to which the invitation is sent. Email
    * addresses should be unique among all client users under each sponsor
    * buyer.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The unique numerical ID of the invitation that is sent to the user.
    * The value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String] = js.undefined
}

object ClientUserInvitation {
  @scala.inline
  def apply(clientAccountId: String = null, email: String = null, invitationId: String = null): ClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUserInvitation]
  }
}

