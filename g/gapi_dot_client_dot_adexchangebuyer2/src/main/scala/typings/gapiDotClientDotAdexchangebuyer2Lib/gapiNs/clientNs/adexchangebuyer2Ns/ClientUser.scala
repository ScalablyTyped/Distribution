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

