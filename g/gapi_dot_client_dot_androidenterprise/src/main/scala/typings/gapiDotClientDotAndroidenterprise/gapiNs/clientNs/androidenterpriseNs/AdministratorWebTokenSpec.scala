package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministratorWebTokenSpec extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebTokenSpec". */
  var kind: js.UndefOr[String] = js.undefined
  /** The URI of the parent frame hosting the iframe. To prevent XSS, the iframe may not be hosted at other URIs. This URI must be https. */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * The list of permissions the admin is granted within the iframe. The admin will only be allowed to view an iframe if they have all of the permissions
    * associated with it. The only valid value is "approveApps" that will allow the admin to access the iframe in "approve" mode.
    */
  var permission: js.UndefOr[js.Array[String]] = js.undefined
}

object AdministratorWebTokenSpec {
  @scala.inline
  def apply(kind: String = null, parent: String = null, permission: js.Array[String] = null): AdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[AdministratorWebTokenSpec]
  }
}

