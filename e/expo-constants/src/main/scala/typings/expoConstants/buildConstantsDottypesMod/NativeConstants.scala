package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigTypes.mod.ExpoConfig
import typings.expoConstants.expoConstantsStrings.ExponentConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeConstants
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Returns `expo`, `standalone`, or `guest`. This property only applies to the managed workflow
    * and classic builds; for apps built with EAS Build and in bare workflow, the result is
    * always `null`.
    */
  var appOwnership: AppOwnership | Null
  
  var debugMode: Boolean
  
  /**
    * A human-readable name for the device type.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The [device year class](https://github.com/facebook/device-year-class) of this device.
    * @deprecated Moved to `expo-device` as [`Device.deviceYearClass`](./device/#deviceyearclass).
    */
  var deviceYearClass: Double | Null
  
  var executionEnvironment: ExecutionEnvironment
  
  var experienceUrl: String
  
  /**
    * The standard Expo config object defined in `app.config.js` files. For both classic and new manifests.
    */
  var expoConfig: ExpoConfig | Null
  
  var expoRuntimeVersion: String | Null
  
  /**
    * The version string of the Expo Go app currently running.
    * Returns `null` in bare workflow and web.
    */
  var expoVersion: String | Null
  
  /**
    * Gets the user agent string which would be included in requests sent by a web view running on
    * this device. This is probably not the same user agent you might be providing in your JS `fetch`
    * requests.
    */
  def getWebViewUserAgentAsync(): js.Promise[String | Null]
  
  /**
    * An identifier that is unique to this particular device and whose lifetime is at least as long
    * as the installation of the app.
    * @deprecated `Constants.installationId` is deprecated in favor of generating your own ID and
    * storing it.
    */
  var installationId: String
  
  var intentUri: js.UndefOr[String] = js.undefined
  
  var isDetached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` if the app is running on a device, `false` if running in a simulator or emulator.
    * @deprecated Use `expo-device`'s [`Device.isDevice`](./device/#deviceisdevice).
    */
  var isDevice: Boolean
  
  var isHeadless: Boolean
  
  var linkingUri: String
  
  /**
    * Classic manifest for Expo apps using classic updates.
    * Returns `null` in bare workflow and when `manifest2` is non-null.
    */
  var manifest: AppManifest | Null
  
  /**
    * New manifest for Expo apps using modern Expo Updates.
    * Returns `null` in bare workflow and when `manifest` is non-null.
    */
  var manifest2: Manifest | Null
  
  /**
    * @hidden
    */
  var name: ExponentConstants
  
  /**
    * The **Info.plist** value for `CFBundleShortVersionString` on iOS and the version name set
    * by `version` in app.json on Android at the time the native app was built.
    * @deprecated Use `expo-application`'s [`Application.nativeApplicationVersion`](./application/#applicationnativeapplicationversion).
    */
  var nativeAppVersion: String | Null
  
  /**
    * The **Info.plist** value for `CFBundleVersion` on iOS (set with `ios.buildNumber` value in
    * **app.json** in a standalone app) and the version code set by `android.versionCode` in
    * **app.json** on Android at the time the native app was built.
    * @deprecated Use `expo-application`'s [`Application.nativeBuildVersion`](./application/#applicationnativebuildversion).
    */
  var nativeBuildVersion: String | Null
  
  var platform: js.UndefOr[PlatformManifest] = js.undefined
  
  /**
    * A string that is unique to the current session of your app. It is different across apps and
    * across multiple launches of the same app.
    */
  var sessionId: String
  
  /**
    * The default status bar height for the device. Does not factor in changes when location tracking
    * is in use or a phone call is active.
    */
  var statusBarHeight: Double
  
  /**
    * @hidden
    */
  var supportedExpoSdks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of the system font names available on the current device.
    */
  var systemFonts: js.Array[String]
  
  var systemVersion: js.UndefOr[Double] = js.undefined
}
object NativeConstants {
  
  inline def apply(
    debugMode: Boolean,
    executionEnvironment: ExecutionEnvironment,
    experienceUrl: String,
    getWebViewUserAgentAsync: () => js.Promise[String | Null],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String]
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(debugMode = debugMode.asInstanceOf[js.Any], executionEnvironment = executionEnvironment.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], name = "ExponentConstants", sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any], appOwnership = null, deviceYearClass = null, expoConfig = null, expoRuntimeVersion = null, expoVersion = null, manifest = null, manifest2 = null, nativeAppVersion = null, nativeBuildVersion = null)
    __obj.asInstanceOf[NativeConstants]
  }
  
  extension [Self <: NativeConstants](x: Self) {
    
    inline def setAppOwnership(value: AppOwnership): Self = StObject.set(x, "appOwnership", value.asInstanceOf[js.Any])
    
    inline def setAppOwnershipNull: Self = StObject.set(x, "appOwnership", null)
    
    inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceYearClass(value: Double): Self = StObject.set(x, "deviceYearClass", value.asInstanceOf[js.Any])
    
    inline def setDeviceYearClassNull: Self = StObject.set(x, "deviceYearClass", null)
    
    inline def setExecutionEnvironment(value: ExecutionEnvironment): Self = StObject.set(x, "executionEnvironment", value.asInstanceOf[js.Any])
    
    inline def setExperienceUrl(value: String): Self = StObject.set(x, "experienceUrl", value.asInstanceOf[js.Any])
    
    inline def setExpoConfig(value: ExpoConfig): Self = StObject.set(x, "expoConfig", value.asInstanceOf[js.Any])
    
    inline def setExpoConfigNull: Self = StObject.set(x, "expoConfig", null)
    
    inline def setExpoRuntimeVersion(value: String): Self = StObject.set(x, "expoRuntimeVersion", value.asInstanceOf[js.Any])
    
    inline def setExpoRuntimeVersionNull: Self = StObject.set(x, "expoRuntimeVersion", null)
    
    inline def setExpoVersion(value: String): Self = StObject.set(x, "expoVersion", value.asInstanceOf[js.Any])
    
    inline def setExpoVersionNull: Self = StObject.set(x, "expoVersion", null)
    
    inline def setGetWebViewUserAgentAsync(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getWebViewUserAgentAsync", js.Any.fromFunction0(value))
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setIntentUri(value: String): Self = StObject.set(x, "intentUri", value.asInstanceOf[js.Any])
    
    inline def setIntentUriUndefined: Self = StObject.set(x, "intentUri", js.undefined)
    
    inline def setIsDetached(value: Boolean): Self = StObject.set(x, "isDetached", value.asInstanceOf[js.Any])
    
    inline def setIsDetachedUndefined: Self = StObject.set(x, "isDetached", js.undefined)
    
    inline def setIsDevice(value: Boolean): Self = StObject.set(x, "isDevice", value.asInstanceOf[js.Any])
    
    inline def setIsHeadless(value: Boolean): Self = StObject.set(x, "isHeadless", value.asInstanceOf[js.Any])
    
    inline def setLinkingUri(value: String): Self = StObject.set(x, "linkingUri", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: AppManifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifest2(value: Manifest): Self = StObject.set(x, "manifest2", value.asInstanceOf[js.Any])
    
    inline def setManifest2Null: Self = StObject.set(x, "manifest2", null)
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setName(value: ExponentConstants): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNativeAppVersion(value: String): Self = StObject.set(x, "nativeAppVersion", value.asInstanceOf[js.Any])
    
    inline def setNativeAppVersionNull: Self = StObject.set(x, "nativeAppVersion", null)
    
    inline def setNativeBuildVersion(value: String): Self = StObject.set(x, "nativeBuildVersion", value.asInstanceOf[js.Any])
    
    inline def setNativeBuildVersionNull: Self = StObject.set(x, "nativeBuildVersion", null)
    
    inline def setPlatform(value: PlatformManifest): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setSupportedExpoSdks(value: js.Array[String]): Self = StObject.set(x, "supportedExpoSdks", value.asInstanceOf[js.Any])
    
    inline def setSupportedExpoSdksUndefined: Self = StObject.set(x, "supportedExpoSdks", js.undefined)
    
    inline def setSupportedExpoSdksVarargs(value: String*): Self = StObject.set(x, "supportedExpoSdks", js.Array(value*))
    
    inline def setSystemFonts(value: js.Array[String]): Self = StObject.set(x, "systemFonts", value.asInstanceOf[js.Any])
    
    inline def setSystemFontsVarargs(value: String*): Self = StObject.set(x, "systemFonts", js.Array(value*))
    
    inline def setSystemVersion(value: Double): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
    
    inline def setSystemVersionUndefined: Self = StObject.set(x, "systemVersion", js.undefined)
  }
}
