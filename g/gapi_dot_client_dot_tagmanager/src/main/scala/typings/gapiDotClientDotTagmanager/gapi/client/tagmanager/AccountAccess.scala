package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAccess extends js.Object {
  /** Whether the user has no access, user access, or admin access to an account. */
  var permission: js.UndefOr[String] = js.undefined
}

object AccountAccess {
  @scala.inline
  def apply(permission: String = null): AccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[AccountAccess]
  }
}

