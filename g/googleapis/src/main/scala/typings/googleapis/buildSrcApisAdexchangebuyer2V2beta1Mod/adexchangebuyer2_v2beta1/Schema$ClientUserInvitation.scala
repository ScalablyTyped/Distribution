package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation for a new client user to get access to the Authorized Buyers
  * UI. All fields are required unless otherwise specified.
  */
@js.native
trait Schema$ClientUserInvitation extends js.Object {
  /**
    * Numerical account ID of the client buyer that the invited user is
    * associated with. The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * The email address to which the invitation is sent. Email addresses should
    * be unique among all client users under each sponsor buyer.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the invitation that is sent to the user. The
    * value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String] = js.native
}

object Schema$ClientUserInvitation {
  @scala.inline
  def apply(clientAccountId: String = null, email: String = null, invitationId: String = null): Schema$ClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitationId != null) __obj.updateDynamic("invitationId")(invitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClientUserInvitation]
  }
}

