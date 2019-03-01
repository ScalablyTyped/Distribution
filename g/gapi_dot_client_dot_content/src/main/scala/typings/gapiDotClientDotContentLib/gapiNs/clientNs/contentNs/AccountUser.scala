package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUser extends js.Object {
  /** Whether user is an admin. */
  var admin: js.UndefOr[scala.Boolean] = js.undefined
  /** User's email address. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
}

object AccountUser {
  @scala.inline
  def apply(admin: js.UndefOr[scala.Boolean] = js.undefined, emailAddress: java.lang.String = null): AccountUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.asInstanceOf[AccountUser]
  }
}

