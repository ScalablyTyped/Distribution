package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Install extends js.Object {
  /**
               * Install state. The state "installPending" means that an install request has recently been made and download to the device is in progress. The state
               * "installed" means that the app has been installed. This field is read-only.
               */
  var installState: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#install". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the product that the install is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the installed product. Guaranteed to be set only if the install state is "installed". */
  var versionCode: js.UndefOr[scala.Double] = js.undefined
}

