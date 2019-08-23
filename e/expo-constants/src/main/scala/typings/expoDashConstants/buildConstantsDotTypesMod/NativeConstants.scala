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
  var expoRuntimeVersion: String
  var expoVersion: String
  var installationId: String
  var intentUri: js.UndefOr[String] = js.undefined
  var isDetached: js.UndefOr[Boolean] = js.undefined
  var isDevice: Boolean
  var isHeadless: Boolean
  var linkingUri: String
  var manifest: AppManifest
  var name: ExponentConstants
  var nativeAppVersion: Null
  var nativeBuildVersion: Null
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
    expoRuntimeVersion: String,
    expoVersion: String,
    getWebViewUserAgentAsync: () => js.Promise[String | Null],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    manifest: AppManifest,
    name: ExponentConstants,
    nativeAppVersion: Null,
    nativeBuildVersion: Null,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String],
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    deviceName: String = null,
    deviceYearClass: Int | Double = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    platform: PlatformManifest = null,
    systemVersion: Int | Double = null
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership, debugMode = debugMode, experienceUrl = experienceUrl, expoRuntimeVersion = expoRuntimeVersion, expoVersion = expoVersion, getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId, isDevice = isDevice, isHeadless = isHeadless, linkingUri = linkingUri, manifest = manifest, name = name, nativeAppVersion = nativeAppVersion, nativeBuildVersion = nativeBuildVersion, sessionId = sessionId, statusBarHeight = statusBarHeight, systemFonts = systemFonts)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceYearClass != null) __obj.updateDynamic("deviceYearClass")(deviceYearClass.asInstanceOf[js.Any])
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri)
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (systemVersion != null) __obj.updateDynamic("systemVersion")(systemVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeConstants]
  }
}

