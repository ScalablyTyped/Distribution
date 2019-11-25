package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relyingparty extends js.Object {
  /** whether or not to install the android app on the device where the link is opened */
  var androidInstallApp: js.UndefOr[Boolean] = js.undefined
  /** minimum version of the app. if the version on the device is lower than this version then the user is taken to the play store to upgrade the app */
  var androidMinimumVersion: js.UndefOr[String] = js.undefined
  /** android package name of the android app to handle the action code */
  var androidPackageName: js.UndefOr[String] = js.undefined
  /** whether or not the app can handle the oob code without first going to web */
  var canHandleCodeInApp: js.UndefOr[Boolean] = js.undefined
  /** The recaptcha response from the user. */
  var captchaResp: js.UndefOr[String] = js.undefined
  /** The recaptcha challenge presented to the user. */
  var challenge: js.UndefOr[String] = js.undefined
  /** The url to continue to the Gitkit app */
  var continueUrl: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** iOS app store id to download the app if it's not already installed */
  var iOSAppStoreId: js.UndefOr[String] = js.undefined
  /** the iOS bundle id of iOS app to handle the action code */
  var iOSBundleId: js.UndefOr[String] = js.undefined
  /** The user's Gitkit login token for email change. */
  var idToken: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#relyingparty". */
  var kind: js.UndefOr[String] = js.undefined
  /** The new email if the code is for email change. */
  var newEmail: js.UndefOr[String] = js.undefined
  /** The request type. */
  var requestType: js.UndefOr[String] = js.undefined
  /** The IP address of the user. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Relyingparty {
  @scala.inline
  def apply(
    androidInstallApp: js.UndefOr[Boolean] = js.undefined,
    androidMinimumVersion: String = null,
    androidPackageName: String = null,
    canHandleCodeInApp: js.UndefOr[Boolean] = js.undefined,
    captchaResp: String = null,
    challenge: String = null,
    continueUrl: String = null,
    email: String = null,
    iOSAppStoreId: String = null,
    iOSBundleId: String = null,
    idToken: String = null,
    kind: String = null,
    newEmail: String = null,
    requestType: String = null,
    userIp: String = null
  ): Relyingparty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidInstallApp)) __obj.updateDynamic("androidInstallApp")(androidInstallApp.asInstanceOf[js.Any])
    if (androidMinimumVersion != null) __obj.updateDynamic("androidMinimumVersion")(androidMinimumVersion.asInstanceOf[js.Any])
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName.asInstanceOf[js.Any])
    if (!js.isUndefined(canHandleCodeInApp)) __obj.updateDynamic("canHandleCodeInApp")(canHandleCodeInApp.asInstanceOf[js.Any])
    if (captchaResp != null) __obj.updateDynamic("captchaResp")(captchaResp.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (continueUrl != null) __obj.updateDynamic("continueUrl")(continueUrl.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (iOSAppStoreId != null) __obj.updateDynamic("iOSAppStoreId")(iOSAppStoreId.asInstanceOf[js.Any])
    if (iOSBundleId != null) __obj.updateDynamic("iOSBundleId")(iOSBundleId.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relyingparty]
  }
}

