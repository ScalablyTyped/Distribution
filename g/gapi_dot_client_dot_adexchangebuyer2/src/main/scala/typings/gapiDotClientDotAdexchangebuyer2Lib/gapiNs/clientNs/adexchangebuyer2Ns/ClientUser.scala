package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientUser extends js.Object {
  /**
    * Numerical account ID of the client buyer
    * with which the user is associated; the
    * buyer must be a client of the current sponsor buyer.
    * The value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User's email address. The value of this field
    * is ignored in an update operation.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the client user. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique numerical ID of the client user
    * that has accepted an invitation.
    * The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object ClientUser {
  @scala.inline
  def apply(
    clientAccountId: java.lang.String = null,
    email: java.lang.String = null,
    status: java.lang.String = null,
    userId: java.lang.String = null
  ): ClientUser = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId)
    if (email != null) __obj.updateDynamic("email")(email)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[ClientUser]
  }
}

