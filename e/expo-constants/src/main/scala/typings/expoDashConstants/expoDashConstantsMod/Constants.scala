package typings.expoDashConstants.expoDashConstantsMod

import typings.expoDashConstants.buildConstantsDotTypesMod.AppManifest
import typings.expoDashConstants.buildConstantsDotTypesMod.AppOwnership
import typings.expoDashConstants.buildConstantsDotTypesMod.NativeConstants
import typings.expoDashConstants.buildConstantsDotTypesMod.PlatformManifest
import typings.expoDashConstants.expoDashConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends NativeConstants {
  var deviceId: js.UndefOr[String] = js.undefined
  var linkingUrl: js.UndefOr[String] = js.undefined
}

object Constants {
  @scala.inline
  def apply(
    appOwnership: AppOwnership,
    debugMode: Boolean,
    experienceUrl: String,
    expoRuntimeVersion: String,
    expoVersion: String,
    getWebViewUserAgentAsync: () => js.Promise[String | Null],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    manifest: AppManifest,
    name: ExponentConstants,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String],
    deviceId: String = null,
    deviceName: String = null,
    deviceYearClass: Int | Double = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    linkingUrl: String = null,
    nativeAppVersion: String = null,
    nativeBuildVersion: String = null,
    platform: PlatformManifest = null,
    systemVersion: Int | Double = null
  ): Constants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership, debugMode = debugMode, experienceUrl = experienceUrl, expoRuntimeVersion = expoRuntimeVersion, expoVersion = expoVersion, getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId, isDevice = isDevice, isHeadless = isHeadless, linkingUri = linkingUri, manifest = manifest, name = name, sessionId = sessionId, statusBarHeight = statusBarHeight, systemFonts = systemFonts)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceYearClass != null) __obj.updateDynamic("deviceYearClass")(deviceYearClass.asInstanceOf[js.Any])
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri)
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached)
    if (linkingUrl != null) __obj.updateDynamic("linkingUrl")(linkingUrl)
    if (nativeAppVersion != null) __obj.updateDynamic("nativeAppVersion")(nativeAppVersion)
    if (nativeBuildVersion != null) __obj.updateDynamic("nativeBuildVersion")(nativeBuildVersion)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (systemVersion != null) __obj.updateDynamic("systemVersion")(systemVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
}

