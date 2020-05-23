package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.BundleId
import typings.firebaseAuthTypes.anon.InstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeSettings extends js.Object {
  var android: js.UndefOr[InstallApp] = js.undefined
  var dynamicLinkDomain: js.UndefOr[String] = js.undefined
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  var iOS: js.UndefOr[BundleId] = js.undefined
  var url: String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    url: String,
    android: InstallApp = null,
    dynamicLinkDomain: String = null,
    handleCodeInApp: js.UndefOr[Boolean] = js.undefined,
    iOS: BundleId = null
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (dynamicLinkDomain != null) __obj.updateDynamic("dynamicLinkDomain")(dynamicLinkDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp.get.asInstanceOf[js.Any])
    if (iOS != null) __obj.updateDynamic("iOS")(iOS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

