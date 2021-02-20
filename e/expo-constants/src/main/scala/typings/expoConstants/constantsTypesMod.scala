package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.anon.Dev
import typings.expoConstants.anon.Dictkey
import typings.expoConstants.anon.Icon
import typings.expoConstants.anon.Scheme
import typings.expoConstants.anon.Tool
import typings.expoConstants.expoConstantsStrings.ExponentConstants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsTypesMod {
  
  @js.native
  sealed trait AppOwnership extends StObject
  @JSImport("expo-constants/build/Constants.types", "AppOwnership")
  @js.native
  object AppOwnership extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AppOwnership with String] = js.native
    
    @js.native
    sealed trait Expo extends AppOwnership
    /* "expo" */ val Expo: typings.expoConstants.constantsTypesMod.AppOwnership.Expo with String = js.native
    
    @js.native
    sealed trait Guest extends AppOwnership
    /* "guest" */ val Guest: typings.expoConstants.constantsTypesMod.AppOwnership.Guest with String = js.native
    
    @js.native
    sealed trait Standalone extends AppOwnership
    /* "standalone" */ val Standalone: typings.expoConstants.constantsTypesMod.AppOwnership.Standalone with String = js.native
  }
  
  @js.native
  sealed trait UserInterfaceIdiom extends StObject
  @JSImport("expo-constants/build/Constants.types", "UserInterfaceIdiom")
  @js.native
  object UserInterfaceIdiom extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UserInterfaceIdiom with String] = js.native
    
    @js.native
    sealed trait Handset extends UserInterfaceIdiom
    /* "handset" */ val Handset: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Handset with String = js.native
    
    @js.native
    sealed trait Tablet extends UserInterfaceIdiom
    /* "tablet" */ val Tablet: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Tablet with String = js.native
    
    @js.native
    sealed trait Unsupported extends UserInterfaceIdiom
    /* "unsupported" */ val Unsupported: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Unsupported with String = js.native
  }
  
  @js.native
  trait AndroidManifest
    extends /* key */ StringDictionary[js.Any] {
    
    var versionCode: Double = js.native
  }
  object AndroidManifest {
    
    @scala.inline
    def apply(versionCode: Double): AndroidManifest = {
      val __obj = js.Dynamic.literal(versionCode = versionCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AndroidManifest]
    }
    
    @scala.inline
    implicit class AndroidManifestMutableBuilder[Self <: AndroidManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppManifest
    extends /* key */ StringDictionary[js.Any] {
    
    var bundleUrl: String = js.native
    
    var debuggerHost: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var developer: js.UndefOr[Tool] = js.native
    
    var entryPoint: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Icon] = js.native
    
    var logUrl: js.UndefOr[String] = js.native
    
    var mainModuleName: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var notification: js.UndefOr[Dictkey] = js.native
    
    var orientation: js.UndefOr[String] = js.native
    
    var packagerOpts: js.UndefOr[Dev] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var releaseChannel: js.UndefOr[String] = js.native
    
    /** Published Apps Only */
    var releaseId: js.UndefOr[String] = js.native
    
    var revisionId: js.UndefOr[String] = js.native
    
    var sdkVersion: js.UndefOr[String] = js.native
    
    var slug: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xde: js.UndefOr[Boolean] = js.native
  }
  object AppManifest {
    
    @scala.inline
    def apply(bundleUrl: String): AppManifest = {
      val __obj = js.Dynamic.literal(bundleUrl = bundleUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppManifest]
    }
    
    @scala.inline
    implicit class AppManifestMutableBuilder[Self <: AppManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggerHost(value: String): Self = StObject.set(x, "debuggerHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggerHostUndefined: Self = StObject.set(x, "debuggerHost", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDeveloper(value: Tool): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
      
      @scala.inline
      def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLoading(value: Icon): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
      
      @scala.inline
      def setMainModuleName(value: String): Self = StObject.set(x, "mainModuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainModuleNameUndefined: Self = StObject.set(x, "mainModuleName", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotification(value: Dictkey): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPackagerOpts(value: Dev): Self = StObject.set(x, "packagerOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagerOptsUndefined: Self = StObject.set(x, "packagerOpts", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setReleaseChannel(value: String): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
      
      @scala.inline
      def setReleaseId(value: String): Self = StObject.set(x, "releaseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseIdUndefined: Self = StObject.set(x, "releaseId", js.undefined)
      
      @scala.inline
      def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
      
      @scala.inline
      def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setXde(value: Boolean): Self = StObject.set(x, "xde", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXdeUndefined: Self = StObject.set(x, "xde", js.undefined)
    }
  }
  
  @js.native
  trait Constants extends NativeConstants {
    
    var deviceId: js.UndefOr[String] = js.native
    
    var linkingUrl: js.UndefOr[String] = js.native
  }
  object Constants {
    
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
    ): Constants = {
      val __obj = js.Dynamic.literal(debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setLinkingUrl(value: String): Self = StObject.set(x, "linkingUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkingUrlUndefined: Self = StObject.set(x, "linkingUrl", js.undefined)
    }
  }
  
  @js.native
  trait IOSManifest
    extends /* key */ StringDictionary[js.Any] {
    
    var buildNumber: String = js.native
    
    var model: String = js.native
    
    var platform: String = js.native
    
    var systemVersion: String = js.native
    
    var userInterfaceIdiom: UserInterfaceIdiom = js.native
  }
  object IOSManifest {
    
    @scala.inline
    def apply(
      buildNumber: String,
      model: String,
      platform: String,
      systemVersion: String,
      userInterfaceIdiom: UserInterfaceIdiom
    ): IOSManifest = {
      val __obj = js.Dynamic.literal(buildNumber = buildNumber.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], userInterfaceIdiom = userInterfaceIdiom.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOSManifest]
    }
    
    @scala.inline
    implicit class IOSManifestMutableBuilder[Self <: IOSManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemVersion(value: String): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInterfaceIdiom(value: UserInterfaceIdiom): Self = StObject.set(x, "userInterfaceIdiom", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class NativeConstantsMutableBuilder[Self <: NativeConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppOwnership(value: AppOwnership): Self = StObject.set(x, "appOwnership", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppOwnershipNull: Self = StObject.set(x, "appOwnership", null)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
      
      @scala.inline
      def setDeviceYearClass(value: Double): Self = StObject.set(x, "deviceYearClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceYearClassNull: Self = StObject.set(x, "deviceYearClass", null)
      
      @scala.inline
      def setExperienceUrl(value: String): Self = StObject.set(x, "experienceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoRuntimeVersion(value: String): Self = StObject.set(x, "expoRuntimeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoRuntimeVersionNull: Self = StObject.set(x, "expoRuntimeVersion", null)
      
      @scala.inline
      def setExpoVersion(value: String): Self = StObject.set(x, "expoVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoVersionNull: Self = StObject.set(x, "expoVersion", null)
      
      @scala.inline
      def setGetWebViewUserAgentAsync(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getWebViewUserAgentAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUri(value: String): Self = StObject.set(x, "intentUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntentUriUndefined: Self = StObject.set(x, "intentUri", js.undefined)
      
      @scala.inline
      def setIsDetached(value: Boolean): Self = StObject.set(x, "isDetached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDetachedUndefined: Self = StObject.set(x, "isDetached", js.undefined)
      
      @scala.inline
      def setIsDevice(value: Boolean): Self = StObject.set(x, "isDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHeadless(value: Boolean): Self = StObject.set(x, "isHeadless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkingUri(value: String): Self = StObject.set(x, "linkingUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifest(value: AppManifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: ExponentConstants): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeAppVersion(value: String): Self = StObject.set(x, "nativeAppVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeAppVersionNull: Self = StObject.set(x, "nativeAppVersion", null)
      
      @scala.inline
      def setNativeBuildVersion(value: String): Self = StObject.set(x, "nativeBuildVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeBuildVersionNull: Self = StObject.set(x, "nativeBuildVersion", null)
      
      @scala.inline
      def setPlatform(value: PlatformManifest): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemFonts(value: js.Array[String]): Self = StObject.set(x, "systemFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemFontsVarargs(value: String*): Self = StObject.set(x, "systemFonts", js.Array(value :_*))
      
      @scala.inline
      def setSystemVersion(value: Double): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemVersionUndefined: Self = StObject.set(x, "systemVersion", js.undefined)
    }
  }
  
  @js.native
  trait PlatformManifest
    extends /* key */ StringDictionary[js.Any] {
    
    var android: js.UndefOr[AndroidManifest] = js.native
    
    var detach: js.UndefOr[Scheme] = js.native
    
    var developer: js.UndefOr[String] = js.native
    
    var hostUri: js.UndefOr[String] = js.native
    
    var ios: js.UndefOr[IOSManifest] = js.native
    
    var logUrl: js.UndefOr[String] = js.native
    
    var scheme: js.UndefOr[String] = js.native
    
    var web: js.UndefOr[WebManifest] = js.native
  }
  object PlatformManifest {
    
    @scala.inline
    def apply(): PlatformManifest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformManifest]
    }
    
    @scala.inline
    implicit class PlatformManifestMutableBuilder[Self <: PlatformManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: AndroidManifest): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      @scala.inline
      def setDetach(value: Scheme): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
      
      @scala.inline
      def setDeveloper(value: String): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
      
      @scala.inline
      def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
      
      @scala.inline
      def setIos(value: IOSManifest): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      @scala.inline
      def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUrlUndefined: Self = StObject.set(x, "logUrl", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setWeb(value: WebManifest): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    }
  }
  
  type WebManifest = StringDictionary[js.Any]
}
