package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUser extends js.Object {
  /** Whether user is an admin. */
  var admin: js.UndefOr[Boolean] = js.undefined
  /** User's email address. */
  var emailAddress: js.UndefOr[String] = js.undefined
}

object AccountUser {
  @scala.inline
  def apply(admin: js.UndefOr[Boolean] = js.undefined, emailAddress: String = null): AccountUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUser]
  }
}

