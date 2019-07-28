package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLicenseUsersListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicenseUsersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.undefined
}

object GroupLicenseUsersListResponse {
  @scala.inline
  def apply(kind: String = null, user: js.Array[User] = null): GroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[GroupLicenseUsersListResponse]
  }
}

