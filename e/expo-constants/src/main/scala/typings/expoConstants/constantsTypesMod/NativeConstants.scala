package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.expoConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeConstants
  extends /* key */ StringDictionary[js.Any] {
  
  var appOwnership: AppOwnership | Null = js.native
  
  var debugMode: Boolean = js.native
  
  var deviceName: js.UndefOr[String] = js.native
  
  var deviceYearClass: Double | Null = js.native
  
  var experienceUrl: String = js.native
  
  var expoRuntimeVersion: String | Null = js.native
  
  /**
    * The version string of the Expo client currently running.
    * Returns `null` on and bare workflow and web.
    */
  var expoVersion: String | Null = js.native
  
  def getWebViewUserAgentAsync(): js.Promise[String | Null] = js.native
  
  var installationId: String = js.native
  
  var intentUri: js.UndefOr[String] = js.native
  
  var isDetached: js.UndefOr[Boolean] = js.native
  
  var isDevice: Boolean = js.native
  
  var isHeadless: Boolean = js.native
  
  var linkingUri: String = js.native
  
  var manifest: AppManifest = js.native
  
  var name: ExponentConstants = js.native
  
  var nativeAppVersion: String | Null = js.native
  
  var nativeBuildVersion: String | Null = js.native
  
  var platform: js.UndefOr[PlatformManifest] = js.native
  
  var sessionId: String = js.native
  
  var statusBarHeight: Double = js.native
  
  var systemFonts: js.Array[String] = js.native
  
  var systemVersion: js.UndefOr[Double] = js.native
}
object NativeConstants {
  
  @scala.inline
  def apply(
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
    systemFonts: js.Array[String]
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeConstants]
  }
  
  @scala.inline
  implicit class NativeConstantsOps[Self <: NativeConstants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperienceUrl(value: String): Self = this.set("experienceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWebViewUserAgentAsync(value: () => js.Promise[String | Null]): Self = this.set("getWebViewUserAgentAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDevice(value: Boolean): Self = this.set("isDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeadless(value: Boolean): Self = this.set("isHeadless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingUri(value: String): Self = this.set("linkingUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: AppManifest): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ExponentConstants): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemFontsVarargs(value: String*): Self = this.set("systemFonts", js.Array(value :_*))
    
    @scala.inline
    def setSystemFonts(value: js.Array[String]): Self = this.set("systemFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppOwnership(value: AppOwnership): Self = this.set("appOwnership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppOwnershipNull: Self = this.set("appOwnership", null)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDeviceYearClass(value: Double): Self = this.set("deviceYearClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceYearClassNull: Self = this.set("deviceYearClass", null)
    
    @scala.inline
    def setExpoRuntimeVersion(value: String): Self = this.set("expoRuntimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoRuntimeVersionNull: Self = this.set("expoRuntimeVersion", null)
    
    @scala.inline
    def setExpoVersion(value: String): Self = this.set("expoVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpoVersionNull: Self = this.set("expoVersion", null)
    
    @scala.inline
    def setIntentUri(value: String): Self = this.set("intentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentUri: Self = this.set("intentUri", js.undefined)
    
    @scala.inline
    def setIsDetached(value: Boolean): Self = this.set("isDetached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDetached: Self = this.set("isDetached", js.undefined)
    
    @scala.inline
    def setNativeAppVersion(value: String): Self = this.set("nativeAppVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeAppVersionNull: Self = this.set("nativeAppVersion", null)
    
    @scala.inline
    def setNativeBuildVersion(value: String): Self = this.set("nativeBuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeBuildVersionNull: Self = this.set("nativeBuildVersion", null)
    
    @scala.inline
    def setPlatform(value: PlatformManifest): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setSystemVersion(value: Double): Self = this.set("systemVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemVersion: Self = this.set("systemVersion", js.undefined)
  }
}
