package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client user is created under a client buyer and has restricted access to
  * the Marketplace and certain other sections of the Authorized Buyers UI
  * based on the role granted to the associated client buyer.  The only way a
  * new client user can be created is via accepting an email invitation (see
  * the accounts.clients.invitations.create method).  All fields are required
  * unless otherwise specified.
  */
@js.native
trait Schema$ClientUser extends js.Object {
  /**
    * Numerical account ID of the client buyer with which the user is
    * associated; the buyer must be a client of the current sponsor buyer. The
    * value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * User&#39;s email address. The value of this field is ignored in an update
    * operation.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The status of the client user.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the client user that has accepted an
    * invitation. The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$ClientUser {
  @scala.inline
  def apply(clientAccountId: String = null, email: String = null, status: String = null, userId: String = null): Schema$ClientUser = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClientUser]
  }
}

