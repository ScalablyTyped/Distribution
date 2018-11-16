package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductPermissions extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productPermissions". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The permissions required by the app. */
  var permission: js.UndefOr[js.Array[ProductPermission]] = js.undefined
  /** The ID of the app that the permissions relate to, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

