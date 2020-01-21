package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductPermissions extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productPermissions". */
  var kind: js.UndefOr[String] = js.undefined
  /** The permissions required by the app. */
  var permission: js.UndefOr[js.Array[ProductPermission]] = js.undefined
  /** The ID of the app that the permissions relate to, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}

object ProductPermissions {
  @scala.inline
  def apply(kind: String = null, permission: js.Array[ProductPermission] = null, productId: String = null): ProductPermissions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPermissions]
  }
}

