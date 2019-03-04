package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeSettings extends js.Object {
  var android: js.UndefOr[firebaseLib.Anon_InstallApp] = js.undefined
  var dynamicLinkDomain: js.UndefOr[java.lang.String] = js.undefined
  var handleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined
  var iOS: js.UndefOr[firebaseLib.Anon_BundleId] = js.undefined
  var url: java.lang.String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    url: java.lang.String,
    android: firebaseLib.Anon_InstallApp = null,
    dynamicLinkDomain: java.lang.String = null,
    handleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined,
    iOS: firebaseLib.Anon_BundleId = null
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url)
    if (android != null) __obj.updateDynamic("android")(android)
    if (dynamicLinkDomain != null) __obj.updateDynamic("dynamicLinkDomain")(dynamicLinkDomain)
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp)
    if (iOS != null) __obj.updateDynamic("iOS")(iOS)
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

