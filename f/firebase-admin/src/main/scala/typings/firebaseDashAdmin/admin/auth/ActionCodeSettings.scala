package typings.firebaseDashAdmin.admin.auth

import typings.firebaseDashAdmin.Anon_BundleId
import typings.firebaseDashAdmin.Anon_InstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the interface that defines the required continue/state URL with
  * optional Android and iOS bundle identifiers.
  */
trait ActionCodeSettings extends js.Object {
  /**
    * Defines the Android package name. This will try to open the link in an
    * android app if it is installed. If `installApp` is passed, it specifies
    * whether to install the Android app if the device supports it and the app is
    * not already installed. If this field is provided without a `packageName`, an
    * error is thrown explaining that the `packageName` must be provided in
    * conjunction with this field. If `minimumVersion` is specified, and an older
    * version of the app is installed, the user is taken to the Play Store to
    * upgrade the app.
    */
  var android: js.UndefOr[Anon_InstallApp] = js.undefined
  /**
    * Defines the dynamic link domain to use for the current link if it is to be
    * opened using Firebase Dynamic Links, as multiple dynamic link domains can be
    * configured per project. This field provides the ability to explicitly choose
    * configured per project. This fields provides the ability explicitly choose
    * one. If none is provided, the oldest domain is used by default.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.undefined
  /**
    * Whether to open the link via a mobile app or a browser.
    * The default is false. When set to true, the action code link is sent
    * as a Universal Link or Android App Link and is opened by the app if
    * installed. In the false case, the code is sent to the web widget first
    * and then redirects to the app if installed.
    */
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the iOS bundle ID. This will try to open the link in an iOS app if it
    * is installed.
    */
  var iOS: js.UndefOr[Anon_BundleId] = js.undefined
  /**
    * Defines the link continue/state URL, which has different meanings in
    * different contexts:
    * <ul>
    * <li>When the link is handled in the web action widgets, this is the deep
    *     link in the `continueUrl` query parameter.</li>
    * <li>When the link is handled in the app directly, this is the `continueUrl`
    *     query parameter in the deep link of the Dynamic Link.</li>
    * </ul>
    */
  var url: String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    url: String,
    android: Anon_InstallApp = null,
    dynamicLinkDomain: String = null,
    handleCodeInApp: js.UndefOr[Boolean] = js.undefined,
    iOS: Anon_BundleId = null
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (dynamicLinkDomain != null) __obj.updateDynamic("dynamicLinkDomain")(dynamicLinkDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp.asInstanceOf[js.Any])
    if (iOS != null) __obj.updateDynamic("iOS")(iOS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

