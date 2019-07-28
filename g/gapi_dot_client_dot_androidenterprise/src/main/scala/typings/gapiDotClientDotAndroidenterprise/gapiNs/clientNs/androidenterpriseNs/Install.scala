package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Install extends js.Object {
  /**
    * Install state. The state "installPending" means that an install request has recently been made and download to the device is in progress. The state
    * "installed" means that the app has been installed. This field is read-only.
    */
  var installState: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#install". */
  var kind: js.UndefOr[String] = js.undefined
  /** The ID of the product that the install is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
  /** The version of the installed product. Guaranteed to be set only if the install state is "installed". */
  var versionCode: js.UndefOr[Double] = js.undefined
}

object Install {
  @scala.inline
  def apply(
    installState: String = null,
    kind: String = null,
    productId: String = null,
    versionCode: Int | Double = null
  ): Install = {
    val __obj = js.Dynamic.literal()
    if (installState != null) __obj.updateDynamic("installState")(installState)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Install]
  }
}

