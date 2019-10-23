package typings.expoDashConstants.buildConstantsDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoDashConstants.expoDashConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeConstants
  extends /* key */ StringDictionary[js.Any] {
  var appOwnership: AppOwnership
  var debugMode: Boolean
  var deviceName: js.UndefOr[String] = js.undefined
  var deviceYearClass: Double | Null
  var experienceUrl: String
  var expoRuntimeVersion: String | Null
  var expoVersion: String | Null
  var installationId: String
  var intentUri: js.UndefOr[String] = js.undefined
  var isDetached: js.UndefOr[Boolean] = js.undefined
  var isDevice: Boolean
  var isHeadless: Boolean
  var linkingUri: String
  var manifest: AppManifest
  var name: ExponentConstants
  var nativeAppVersion: String | Null
  var nativeBuildVersion: String | Null
  var platform: js.UndefOr[PlatformManifest] = js.undefined
  var sessionId: String
  var statusBarHeight: Double
  var systemFonts: js.Array[String]
  var systemVersion: js.UndefOr[Double] = js.undefined
  def getWebViewUserAgentAsync(): js.Promise[String | Null]
}

object NativeConstants {
  @scala.inline
  def apply(
    appOwnership: AppOwnership,
    debugMode: Boolean,
    experienceUrl: String,
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    deviceName: String = null,
    deviceYearClass: Int | Double = null,
    expoRuntimeVersion: String = null,
    expoVersion: String = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    nativeAppVersion: String = null,
    nativeBuildVersion: String = null,
    platform: PlatformManifest = null,
    systemVersion: Int | Double = null
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership, debugMode = debugMode, experienceUrl = experienceUrl, getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId, isDevice = isDevice, isHeadless = isHeadless, linkingUri = linkingUri, manifest = manifest, name = name, sessionId = sessionId, statusBarHeight = statusBarHeight, systemFonts = systemFonts)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceYearClass != null) __obj.updateDynamic("deviceYearClass")(deviceYearClass.asInstanceOf[js.Any])
    if (expoRuntimeVersion != null) __obj.updateDynamic("expoRuntimeVersion")(expoRuntimeVersion)
    if (expoVersion != null) __obj.updateDynamic("expoVersion")(expoVersion)
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri)
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached)
    if (nativeAppVersion != null) __obj.updateDynamic("nativeAppVersion")(nativeAppVersion)
    if (nativeBuildVersion != null) __obj.updateDynamic("nativeBuildVersion")(nativeBuildVersion)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (systemVersion != null) __obj.updateDynamic("systemVersion")(systemVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeConstants]
  }
}

