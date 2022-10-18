package typings.expoConfigTypes

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigTypes.anon.Action
import typings.expoConfigTypes.anon.AndroidCollapsedTitle
import typings.expoConfigTypes.anon.BackgroundColor
import typings.expoConfigTypes.anon.BarStyle
import typings.expoConfigTypes.anon.Branch
import typings.expoConfigTypes.anon.CheckAutomatically
import typings.expoConfigTypes.anon.Dictk
import typings.expoConfigTypes.anon.Firebase
import typings.expoConfigTypes.anon.GoogleMapsApiKey
import typings.expoConfigTypes.anon.Image
import typings.expoConfigTypes.anon.PluginHistory
import typings.expoConfigTypes.anon.Policy
import typings.expoConfigTypes.anon.PostExport
import typings.expoConfigTypes.anon.ResizeMode
import typings.expoConfigTypes.anon.SilentLaunch
import typings.expoConfigTypes.anon.TurboModules
import typings.expoConfigTypes.anon.Visible
import typings.expoConfigTypes.expoConfigTypesStrings.`black-translucent`
import typings.expoConfigTypes.expoConfigTypesStrings.`landscape-primary`
import typings.expoConfigTypes.expoConfigTypesStrings.`landscape-secondary`
import typings.expoConfigTypes.expoConfigTypesStrings.`minimal-ui`
import typings.expoConfigTypes.expoConfigTypesStrings.`portrait-primary`
import typings.expoConfigTypes.expoConfigTypesStrings.`portrait-secondary`
import typings.expoConfigTypes.expoConfigTypesStrings.android
import typings.expoConfigTypes.expoConfigTypesStrings.any
import typings.expoConfigTypes.expoConfigTypesStrings.auto
import typings.expoConfigTypes.expoConfigTypesStrings.automatic
import typings.expoConfigTypes.expoConfigTypesStrings.black
import typings.expoConfigTypes.expoConfigTypesStrings.browser
import typings.expoConfigTypes.expoConfigTypesStrings.contain
import typings.expoConfigTypes.expoConfigTypesStrings.cover
import typings.expoConfigTypes.expoConfigTypesStrings.dark
import typings.expoConfigTypes.expoConfigTypesStrings.default
import typings.expoConfigTypes.expoConfigTypesStrings.fullscreen
import typings.expoConfigTypes.expoConfigTypesStrings.hermes
import typings.expoConfigTypes.expoConfigTypesStrings.hidden
import typings.expoConfigTypes.expoConfigTypesStrings.ios
import typings.expoConfigTypes.expoConfigTypesStrings.jsc
import typings.expoConfigTypes.expoConfigTypesStrings.landscape
import typings.expoConfigTypes.expoConfigTypesStrings.light
import typings.expoConfigTypes.expoConfigTypesStrings.ltr
import typings.expoConfigTypes.expoConfigTypesStrings.metro
import typings.expoConfigTypes.expoConfigTypesStrings.natural
import typings.expoConfigTypes.expoConfigTypesStrings.pan
import typings.expoConfigTypes.expoConfigTypesStrings.portrait
import typings.expoConfigTypes.expoConfigTypesStrings.public
import typings.expoConfigTypes.expoConfigTypesStrings.resize
import typings.expoConfigTypes.expoConfigTypesStrings.rtl
import typings.expoConfigTypes.expoConfigTypesStrings.standalone
import typings.expoConfigTypes.expoConfigTypesStrings.unlisted
import typings.expoConfigTypes.expoConfigTypesStrings.web
import typings.expoConfigTypes.expoConfigTypesStrings.webpack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Android extends StObject {
    
    /**
      * The package name for your Android standalone app. You make it up, but it needs to be unique on the Play Store. See [this StackOverflow question](http://stackoverflow.com/questions/6273892/android-package-name-convention).
      */
    @JSName("package")
    var _package: js.UndefOr[String] = js.undefined
    
    /**
      * Settings for an Adaptive Launcher Icon on Android. [Learn more](https://developer.android.com/guide/practices/ui_guidelines/icon_design_adaptive)
      */
    var adaptiveIcon: js.UndefOr[BackgroundColor] = js.undefined
    
    /**
      * Allows your user's app data to be automatically backed up to their Google Drive. If this is set to false, no backup or restore of the application will ever be performed (this is useful if your app deals with sensitive information). Defaults to the Android default, which is `true`.
      */
    var allowBackup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The background color for your Android app, behind any of your React views. Overrides the top-level `backgroundColor` key if it is present.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * List of permissions to block in the final `AndroidManifest.xml`. This is useful for removing permissions that are added by native package `AndroidManifest.xml` files which are merged into the final manifest. Internally this feature uses the `tools:node="remove"` XML attribute to remove permissions. Not available in the classic `expo build:android` or Expo Go.
      */
    var blockedPermissions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Note: This property key is not included in the production manifest and will evaluate to `undefined`. It is used internally only in the build process, because it contains API keys that some may want to keep private.
      */
    var config: js.UndefOr[Branch] = js.undefined
    
    /**
      * [Firebase Configuration File](https://support.google.com/firebase/answer/7015592) Location of the `GoogleService-Info.plist` file for configuring Firebase. Including this key automatically enables FCM in your standalone app.
      */
    var googleServicesFile: js.UndefOr[String] = js.undefined
    
    /**
      * Local path or remote URL to an image to use for your app's icon on Android. If specified, this overrides the top-level `icon` key. We recommend that you use a 1024x1024 png file (transparency is recommended for the Google Play Store). This icon will appear on the home screen and within the Expo app.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration for setting an array of custom intent filters in Android manifest. [Learn more](https://developer.android.com/guide/components/intents-filters)
      */
    var intentFilters: js.UndefOr[js.Array[Action]] = js.undefined
    
    /**
      * Specifies the JavaScript engine for Android apps. Supported only on EAS Build and in Expo Go. Defaults to `jsc`. Valid values: `hermes`, `jsc`.
      */
    var jsEngine: js.UndefOr[hermes | jsc] = js.undefined
    
    /**
      * List of permissions used by the standalone app.
      *
      *  To use ONLY the following minimum necessary permissions and none of the extras supported by Expo in a default managed app, set `permissions` to `[]`. The minimum necessary permissions do not require a Privacy Policy when uploading to Google Play Store and are:
      * • receive data from Internet
      * • view network connections
      * • full network access
      * • change your audio settings
      * • prevent device from sleeping
      *
      *  To use ALL permissions supported by Expo by default, do not specify the `permissions` key.
      *
      *   To use the minimum necessary permissions ALONG with certain additional permissions, specify those extras in `permissions`, e.g.
      *
      *  `[ "CAMERA", "ACCESS_FINE_LOCATION" ]`.
      *
      *   You can specify the following permissions depending on what you need:
      *
      * - `ACCESS_COARSE_LOCATION`
      * - `ACCESS_FINE_LOCATION`
      * - `ACCESS_BACKGROUND_LOCATION`
      * - `CAMERA`
      * - `RECORD_AUDIO`
      * - `READ_CONTACTS`
      * - `WRITE_CONTACTS`
      * - `READ_CALENDAR`
      * - `WRITE_CALENDAR`
      * - `READ_EXTERNAL_STORAGE`
      * - `WRITE_EXTERNAL_STORAGE`
      * - `USE_FINGERPRINT`
      * - `USE_BIOMETRIC`
      * - `WRITE_SETTINGS`
      * - `VIBRATE`
      * - `READ_PHONE_STATE`
      * - `FOREGROUND_SERVICE`
      * - `WAKE_LOCK`
      * - `com.anddoes.launcher.permission.UPDATE_COUNT`
      * - `com.android.launcher.permission.INSTALL_SHORTCUT`
      * - `com.google.android.c2dm.permission.RECEIVE`
      * - `com.google.android.gms.permission.ACTIVITY_RECOGNITION`
      * - `com.google.android.providers.gsf.permission.READ_GSERVICES`
      * - `com.htc.launcher.permission.READ_SETTINGS`
      * - `com.htc.launcher.permission.UPDATE_SHORTCUT`
      * - `com.majeur.launcher.permission.UPDATE_BADGE`
      * - `com.sec.android.provider.badge.permission.READ`
      * - `com.sec.android.provider.badge.permission.WRITE`
      * - `com.sonyericsson.home.permission.BROADCAST_BADGE`
      *
      */
    var permissions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * URL to your app on the Google Play Store, if you have deployed it there. This is used to link to your store page from your Expo project page if your app is public.
      */
    var playStoreUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The bundle for the Android version of your app will be written to this path during publish.
      */
    var publishBundlePath: js.UndefOr[String] = js.undefined
    
    /**
      * The manifest for the Android version of your app will be written to this path during publish.
      */
    var publishManifestPath: js.UndefOr[String] = js.undefined
    
    /**
      * **Note: Don't use this property unless you are sure what you're doing**
      *
      * The runtime version associated with this manifest for the Android platform. If provided, this will override the top level runtimeVersion key.
      * Set this to `{"policy": "nativeVersion"}` to generate it automatically based on the 'version' and 'versionCode' or
      * to `{"policy": "appVersion"}` to use just 'version' field.
      */
    var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
    
    /**
      * Determines how the software keyboard will impact the layout of your application. This maps to the `android:windowSoftInputMode` property. Defaults to `resize`. Valid values: `resize`, `pan`.
      */
    var softwareKeyboardLayoutMode: js.UndefOr[resize | pan] = js.undefined
    
    /**
      * Configuration for loading and splash screen for managed and standalone Android apps.
      */
    var splash: js.UndefOr[Dictk] = js.undefined
    
    /**
      * @deprecated A Boolean value that indicates whether the app should use the new notifications API.
      */
    var useNextNotificationsApi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration to force the app to always use the light or dark user-interface appearance, such as "dark mode", or make it automatically adapt to the system preferences. If not provided, defaults to `light`. Requires `expo-system-ui` be installed in your project to work on Android.
      */
    var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
    
    /**
      * Version number required by Google Play. Increment by one for each release. Must be a positive integer. [Learn more](https://developer.android.com/studio/publish/versioning.html)
      */
    var versionCode: js.UndefOr[Double] = js.undefined
  }
  object Android {
    
    inline def apply(): Android = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Android]
    }
    
    extension [Self <: Android](x: Self) {
      
      inline def setAdaptiveIcon(value: BackgroundColor): Self = StObject.set(x, "adaptiveIcon", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveIconUndefined: Self = StObject.set(x, "adaptiveIcon", js.undefined)
      
      inline def setAllowBackup(value: Boolean): Self = StObject.set(x, "allowBackup", value.asInstanceOf[js.Any])
      
      inline def setAllowBackupUndefined: Self = StObject.set(x, "allowBackup", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBlockedPermissions(value: js.Array[String]): Self = StObject.set(x, "blockedPermissions", value.asInstanceOf[js.Any])
      
      inline def setBlockedPermissionsUndefined: Self = StObject.set(x, "blockedPermissions", js.undefined)
      
      inline def setBlockedPermissionsVarargs(value: String*): Self = StObject.set(x, "blockedPermissions", js.Array(value*))
      
      inline def setConfig(value: Branch): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setGoogleServicesFile(value: String): Self = StObject.set(x, "googleServicesFile", value.asInstanceOf[js.Any])
      
      inline def setGoogleServicesFileUndefined: Self = StObject.set(x, "googleServicesFile", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIntentFilters(value: js.Array[Action]): Self = StObject.set(x, "intentFilters", value.asInstanceOf[js.Any])
      
      inline def setIntentFiltersUndefined: Self = StObject.set(x, "intentFilters", js.undefined)
      
      inline def setIntentFiltersVarargs(value: Action*): Self = StObject.set(x, "intentFilters", js.Array(value*))
      
      inline def setJsEngine(value: hermes | jsc): Self = StObject.set(x, "jsEngine", value.asInstanceOf[js.Any])
      
      inline def setJsEngineUndefined: Self = StObject.set(x, "jsEngine", js.undefined)
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setPlayStoreUrl(value: String): Self = StObject.set(x, "playStoreUrl", value.asInstanceOf[js.Any])
      
      inline def setPlayStoreUrlUndefined: Self = StObject.set(x, "playStoreUrl", js.undefined)
      
      inline def setPublishBundlePath(value: String): Self = StObject.set(x, "publishBundlePath", value.asInstanceOf[js.Any])
      
      inline def setPublishBundlePathUndefined: Self = StObject.set(x, "publishBundlePath", js.undefined)
      
      inline def setPublishManifestPath(value: String): Self = StObject.set(x, "publishManifestPath", value.asInstanceOf[js.Any])
      
      inline def setPublishManifestPathUndefined: Self = StObject.set(x, "publishManifestPath", js.undefined)
      
      inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
      
      inline def setSoftwareKeyboardLayoutMode(value: resize | pan): Self = StObject.set(x, "softwareKeyboardLayoutMode", value.asInstanceOf[js.Any])
      
      inline def setSoftwareKeyboardLayoutModeUndefined: Self = StObject.set(x, "softwareKeyboardLayoutMode", js.undefined)
      
      inline def setSplash(value: Dictk): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
      
      inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
      
      inline def setUseNextNotificationsApi(value: Boolean): Self = StObject.set(x, "useNextNotificationsApi", value.asInstanceOf[js.Any])
      
      inline def setUseNextNotificationsApiUndefined: Self = StObject.set(x, "useNextNotificationsApi", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
      
      inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
  
  trait AndroidIntentFiltersData extends StObject {
    
    /**
      * Hostname, e.g. `myapp.io`
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * MIME type for URLs that should be matched by the filter
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * Exact path for URLs that should be matched by the filter, e.g. `/records`
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Pattern for paths that should be matched by the filter, e.g. `.*`. Must begin with `/`
      */
    var pathPattern: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix for paths that should be matched by the filter, e.g. `/records/` will match `/records/123`
      */
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Port, e.g. `3000`
      */
    var port: js.UndefOr[String] = js.undefined
    
    /**
      * Scheme of the URL, e.g. `https`
      */
    var scheme: js.UndefOr[String] = js.undefined
  }
  object AndroidIntentFiltersData {
    
    inline def apply(): AndroidIntentFiltersData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidIntentFiltersData]
    }
    
    extension [Self <: AndroidIntentFiltersData](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
      
      inline def setPathPatternUndefined: Self = StObject.set(x, "pathPattern", js.undefined)
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
  
  trait ExpoConfig extends StObject {
    
    /**
      * Internal properties for developer tools
      */
    var _internal: js.UndefOr[PluginHistory] = js.undefined
    
    var android: js.UndefOr[Android] = js.undefined
    
    /**
      * Configuration for the bottom navigation bar on Android. Can be used to configure the `expo-navigation-bar` module in EAS Build.
      */
    var androidNavigationBar: js.UndefOr[Visible] = js.undefined
    
    /**
      * Configuration for the status bar on Android. For more details please navigate to [Configuring StatusBar](https://docs.expo.dev/guides/configuring-statusbar/).
      */
    var androidStatusBar: js.UndefOr[BarStyle] = js.undefined
    
    /**
      * @deprecated By default, Expo looks for the application registered with the AppRegistry as `main`. If you would like to change this, you can specify the name in this property.
      */
    var appKey: js.UndefOr[String] = js.undefined
    
    /**
      * An array of file glob strings which point to assets that will be bundled within your standalone app binary. Read more in the [Offline Support guide](https://docs.expo.dev/guides/offline-support/)
      */
    var assetBundlePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The background color for your app, behind any of your React views. This is also known as the root view background color. Requires `expo-system-ui` be installed in your project to work on iOS.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * The auto generated Expo account name and slug used for display purposes. Formatted like `@username/slug`. When unauthenticated, the username is `@anonymous`. For published projects, this value may change when a project is transferred between accounts or renamed.
      */
    var currentFullName: js.UndefOr[String] = js.undefined
    
    /**
      * A short description of what your app is and why it is great.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Extra fields needed by detached apps
      */
    var detach: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Settings that apply specifically to running this app in a development client
      */
    var developmentClient: js.UndefOr[SilentLaunch] = js.undefined
    
    /**
      * The relative path to your main JavaScript file.
      */
    var entryPoint: js.UndefOr[String] = js.undefined
    
    /**
      * Enable experimental features that may be unstable, unsupported, or removed without deprecation notices.
      */
    var experiments: js.UndefOr[TurboModules] = js.undefined
    
    /**
      * Any extra fields you want to pass to your experience. Values are accessible via `Expo.Constants.manifest.extra` ([Learn more](https://docs.expo.dev/versions/latest/sdk/constants/#constantsmanifest))
      */
    var extra: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Whether the Facebook SDK should collect advertiser ID properties, like the Apple IDFA and Android Advertising ID, automatically. If you don't set this property, Facebook's default policy will be used. (Applicable only to standalone apps.)
      */
    var facebookAdvertiserIDCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for all Facebook libraries. Set up your Facebook App ID at https://developers.facebook.com.
      */
    var facebookAppId: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the Facebook SDK should be initialized automatically. The default in Expo (Client and in standalone apps) is `false`.
      */
    var facebookAutoInitEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the Facebook SDK log app events automatically. If you don't set this property, Facebook's default will be used. (Applicable only to standalone apps.) Note: The Facebook SDK must be initialized for app events to work. You may autoinitialize Facebook SDK by setting `facebookAutoInitEnabled` to `true`
      */
    var facebookAutoLogAppEventsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for native Facebook login.
      */
    var facebookDisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * Used for Facebook native login. Starts with 'fb' and followed by a string of digits, like 'fb1234567890'. You can find your scheme [here](https://developers.facebook.com/docs/facebook-login/ios)in the 'Configuring Your info.plist' section (only applicable to standalone apps and custom Expo Go apps).
      */
    var facebookScheme: js.UndefOr[String] = js.undefined
    
    /**
      * If you would like to share the source code of your app on Github, enter the URL for the repository here and it will be linked to from your Expo project page.
      */
    var githubUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration for scripts to run to hook into the publish process
      */
    var hooks: js.UndefOr[PostExport] = js.undefined
    
    /**
      * Local path or remote URL to an image to use for your app's icon. We recommend that you use a 1024x1024 png file. This icon will appear on the home screen and within the Expo app.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    var ios: js.UndefOr[IOS] = js.undefined
    
    /**
      * Is app detached
      */
    var isDetached: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the JavaScript engine for apps. Supported only on EAS Build. Defaults to `jsc`. Valid values: `hermes`, `jsc`.
      */
    var jsEngine: js.UndefOr[hermes | jsc] = js.undefined
    
    /**
      * Provide overrides by locale for System Dialog prompts like Permissions Boxes
      */
    var locales: js.UndefOr[StringDictionary[String | StringDictionary[Any]]] = js.undefined
    
    /**
      * The name of your app as it appears both within Expo Go and on your home screen as a standalone app.
      */
    var name: String
    
    /**
      * Configuration for remote (push) notifications.
      */
    var notification: js.UndefOr[AndroidCollapsedTitle] = js.undefined
    
    /**
      * Locks your app to a specific orientation with portrait or landscape. Defaults to no lock. Valid values: `default`, `portrait`, `landscape`
      */
    var orientation: js.UndefOr[default | portrait | landscape] = js.undefined
    
    /**
      * The auto generated Expo account name and slug used for services like Notifications and AuthSession proxy. Formatted like `@username/slug`. When unauthenticated, the username is `@anonymous`. For published projects, this value will not change when a project is transferred between accounts or renamed.
      */
    var originalFullName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the Expo account that owns the project. This is useful for teams collaborating on a project. If not provided, the owner defaults to the username of the current user.
      */
    var owner: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use a `metro.config.js` file instead. [Learn more](https://docs.expo.dev/guides/customizing-metro/)
      */
    var packagerOpts: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Platforms that your project explicitly supports. If not specified, it defaults to `["ios", "android"]`.
      */
    var platforms: js.UndefOr[js.Array[android | ios | web]] = js.undefined
    
    /**
      * Config plugins for adding extra functionality to your project. [Learn more](https://docs.expo.dev/guides/config-plugins/).
      */
    var plugins: js.UndefOr[js.Array[String | (js.Array[Any | String]) | (js.Tuple2[String, Any])]] = js.undefined
    
    /**
      * On Android, this will determine the color of your app in the multitasker. Currently this is not used on iOS, but it may be used for other purposes in the future.
      */
    var primaryColor: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to `unlisted`. `unlisted` hides the project from search results. `hidden` restricts access to the project page to only the owner and other users that have been granted access. Valid values: `public`, `unlisted`, `hidden`.
      */
    var privacy: js.UndefOr[public | unlisted | hidden] = js.undefined
    
    /**
      * **Note: Don't use this property unless you are sure what you're doing**
      *
      * The runtime version associated with this manifest.
      * Set this to `{"policy": "nativeVersion"}` to generate it automatically based on the 'version' and
      * 'android.versionCode'/'ios.buildNumber' or to `{"policy": "appVersion"}` to use just 'version' field.
      */
    var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
    
    /**
      * **Standalone Apps Only**. URL scheme to link into your app. For example, if we set this to `'demo'`, then demo:// URLs would open your app when tapped.
      */
    var scheme: js.UndefOr[String] = js.undefined
    
    /**
      * The Expo sdkVersion to run the project on. This should line up with the version specified in your package.json.
      */
    var sdkVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The friendly URL name for publishing. For example, `myAppName` will refer to the `expo.dev/@project-owner/myAppName` project.
      */
    var slug: String
    
    var splash: js.UndefOr[Splash] = js.undefined
    
    /**
      * Configuration for how and when the app should request OTA JavaScript updates
      */
    var updates: js.UndefOr[CheckAutomatically] = js.undefined
    
    /**
      * Configuration to force the app to always use the light or dark user-interface appearance, such as "dark mode", or make it automatically adapt to the system preferences. If not provided, defaults to `light`. Requires `expo-system-ui` be installed in your project to work on Android.
      */
    var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
    
    /**
      * Your app version. In addition to this field, you'll also use `ios.buildNumber` and `android.versionCode` — read more about how to version your app [here](https://docs.expo.dev/distribution/app-stores/#versioning-your-app). On iOS this corresponds to `CFBundleShortVersionString`, and on Android, this corresponds to `versionName`. The required format can be found [here](https://developer.apple.com/documentation/bundleresources/information_property_list/cfbundleshortversionstring).
      */
    var version: js.UndefOr[String] = js.undefined
    
    var web: js.UndefOr[Web] = js.undefined
  }
  object ExpoConfig {
    
    inline def apply(name: String, slug: String): ExpoConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpoConfig]
    }
    
    extension [Self <: ExpoConfig](x: Self) {
      
      inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidNavigationBar(value: Visible): Self = StObject.set(x, "androidNavigationBar", value.asInstanceOf[js.Any])
      
      inline def setAndroidNavigationBarUndefined: Self = StObject.set(x, "androidNavigationBar", js.undefined)
      
      inline def setAndroidStatusBar(value: BarStyle): Self = StObject.set(x, "androidStatusBar", value.asInstanceOf[js.Any])
      
      inline def setAndroidStatusBarUndefined: Self = StObject.set(x, "androidStatusBar", js.undefined)
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      inline def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
      
      inline def setAssetBundlePatterns(value: js.Array[String]): Self = StObject.set(x, "assetBundlePatterns", value.asInstanceOf[js.Any])
      
      inline def setAssetBundlePatternsUndefined: Self = StObject.set(x, "assetBundlePatterns", js.undefined)
      
      inline def setAssetBundlePatternsVarargs(value: String*): Self = StObject.set(x, "assetBundlePatterns", js.Array(value*))
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCurrentFullName(value: String): Self = StObject.set(x, "currentFullName", value.asInstanceOf[js.Any])
      
      inline def setCurrentFullNameUndefined: Self = StObject.set(x, "currentFullName", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetach(value: StringDictionary[Any]): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
      
      inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
      
      inline def setDevelopmentClient(value: SilentLaunch): Self = StObject.set(x, "developmentClient", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentClientUndefined: Self = StObject.set(x, "developmentClient", js.undefined)
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      inline def setExperiments(value: TurboModules): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
      
      inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
      
      inline def setExtra(value: StringDictionary[Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFacebookAdvertiserIDCollectionEnabled(value: Boolean): Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAdvertiserIDCollectionEnabledUndefined: Self = StObject.set(x, "facebookAdvertiserIDCollectionEnabled", js.undefined)
      
      inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
      
      inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
      
      inline def setFacebookAutoInitEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoInitEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAutoInitEnabledUndefined: Self = StObject.set(x, "facebookAutoInitEnabled", js.undefined)
      
      inline def setFacebookAutoLogAppEventsEnabled(value: Boolean): Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", value.asInstanceOf[js.Any])
      
      inline def setFacebookAutoLogAppEventsEnabledUndefined: Self = StObject.set(x, "facebookAutoLogAppEventsEnabled", js.undefined)
      
      inline def setFacebookDisplayName(value: String): Self = StObject.set(x, "facebookDisplayName", value.asInstanceOf[js.Any])
      
      inline def setFacebookDisplayNameUndefined: Self = StObject.set(x, "facebookDisplayName", js.undefined)
      
      inline def setFacebookScheme(value: String): Self = StObject.set(x, "facebookScheme", value.asInstanceOf[js.Any])
      
      inline def setFacebookSchemeUndefined: Self = StObject.set(x, "facebookScheme", js.undefined)
      
      inline def setGithubUrl(value: String): Self = StObject.set(x, "githubUrl", value.asInstanceOf[js.Any])
      
      inline def setGithubUrlUndefined: Self = StObject.set(x, "githubUrl", js.undefined)
      
      inline def setHooks(value: PostExport): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIos(value: IOS): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setIsDetached(value: Boolean): Self = StObject.set(x, "isDetached", value.asInstanceOf[js.Any])
      
      inline def setIsDetachedUndefined: Self = StObject.set(x, "isDetached", js.undefined)
      
      inline def setJsEngine(value: hermes | jsc): Self = StObject.set(x, "jsEngine", value.asInstanceOf[js.Any])
      
      inline def setJsEngineUndefined: Self = StObject.set(x, "jsEngine", js.undefined)
      
      inline def setLocales(value: StringDictionary[String | StringDictionary[Any]]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: AndroidCollapsedTitle): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setOrientation(value: default | portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOriginalFullName(value: String): Self = StObject.set(x, "originalFullName", value.asInstanceOf[js.Any])
      
      inline def setOriginalFullNameUndefined: Self = StObject.set(x, "originalFullName", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setPackagerOpts(value: StringDictionary[Any]): Self = StObject.set(x, "packagerOpts", value.asInstanceOf[js.Any])
      
      inline def setPackagerOptsUndefined: Self = StObject.set(x, "packagerOpts", js.undefined)
      
      inline def setPlatforms(value: js.Array[android | ios | web]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: (android | ios | web)*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setPlugins(value: js.Array[String | (js.Array[Any | String]) | (js.Tuple2[String, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | (js.Array[Any | String]) | (js.Tuple2[String, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setPrivacy(value: public | unlisted | hidden): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
      
      inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSplash(value: Splash): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
      
      inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
      
      inline def setUpdates(value: CheckAutomatically): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
      
      inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWeb(value: Web): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
      
      inline def set_internal(value: PluginHistory): Self = StObject.set(x, "_internal", value.asInstanceOf[js.Any])
      
      inline def set_internalUndefined: Self = StObject.set(x, "_internal", js.undefined)
    }
  }
  
  trait IOS extends StObject {
    
    /**
      * A Boolean value that indicates whether the app may access the notes stored in contacts. You must [receive permission from Apple](https://developer.apple.com/documentation/bundleresources/entitlements/com_apple_developer_contacts_notes) before you can submit your app for review with this capability.
      */
    var accessesContactNotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * URL to your app on the Apple App Store, if you have deployed it there. This is used to link to your store page from your Expo project page if your app is public.
      */
    var appStoreUrl: js.UndefOr[String] = js.undefined
    
    /**
      * An array that contains Associated Domains for the standalone app. [Learn more](https://developer.apple.com/documentation/safariservices/supporting_associated_domains).
      */
    var associatedDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The background color for your iOS app, behind any of your React views. Overrides the top-level `backgroundColor` key if it is present. Requires `expo-system-ui` be installed in your project to work on iOS.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Enable iOS Bitcode optimizations in the native build. Accepts the name of an iOS build configuration to enable for a single configuration and disable for all others, e.g. Debug, Release. Not available in the classic 'expo build:ios' or Expo Go. Defaults to `undefined` which uses the template's predefined settings.
      */
    var bitcode: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Build number for your iOS standalone app. Corresponds to `CFBundleVersion` and must match Apple's [specified format](https://developer.apple.com/library/content/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102364). (Note: Transporter will pull the value for `Version Number` from `expo.version` and NOT from `expo.ios.buildNumber`.)
      */
    var buildNumber: js.UndefOr[String] = js.undefined
    
    /**
      * The bundle identifier for your iOS standalone app. You make it up, but it needs to be unique on the App Store. See [this StackOverflow question](http://stackoverflow.com/questions/11347470/what-does-bundle-identifier-mean-in-the-ios-project).
      */
    var bundleIdentifier: js.UndefOr[String] = js.undefined
    
    /**
      * Note: This property key is not included in the production manifest and will evaluate to `undefined`. It is used internally only in the build process, because it contains API keys that some may want to keep private.
      */
    var config: js.UndefOr[GoogleMapsApiKey] = js.undefined
    
    /**
      * Dictionary of arbitrary configuration to add to your standalone app's native *.entitlements (plist). Applied prior to all other Expo-specific configuration. No other validation is performed, so use this at your own risk of rejection from the App Store.
      */
    var entitlements: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * [Firebase Configuration File](https://support.google.com/firebase/answer/7015592) Location of the `GoogleService-Info.plist` file for configuring Firebase.
      */
    var googleServicesFile: js.UndefOr[String] = js.undefined
    
    /**
      * Local path or remote URL to an image to use for your app's icon on iOS. If specified, this overrides the top-level `icon` key. Use a 1024x1024 icon which follows Apple's interface guidelines for icons, including color profile and transparency.
      *
      *  Expo will generate the other required sizes. This icon will appear on the home screen and within the Expo app.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Dictionary of arbitrary configuration to add to your standalone app's native Info.plist. Applied prior to all other Expo-specific configuration. No other validation is performed, so use this at your own risk of rejection from the App Store.
      */
    var infoPlist: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * If true, indicates that your standalone iOS app does not support handsets, and only supports tablets.
      */
    var isTabletOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the JavaScript engine for iOS apps. Supported only on EAS Build. Defaults to `jsc`. Valid values: `hermes`, `jsc`.
      */
    var jsEngine: js.UndefOr[hermes | jsc] = js.undefined
    
    /**
      * @deprecated Merchant ID for use with Apple Pay in your standalone app.
      */
    var merchantId: js.UndefOr[String] = js.undefined
    
    /**
      * The bundle for the iOS version of your app will be written to this path during publish.
      */
    var publishBundlePath: js.UndefOr[String] = js.undefined
    
    /**
      * The manifest for the iOS version of your app will be written to this path during publish.
      */
    var publishManifestPath: js.UndefOr[String] = js.undefined
    
    /**
      * If true, indicates that your standalone iOS app does not support Slide Over and Split View on iPad. Defaults to `false`
      */
    var requireFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **Note: Don't use this property unless you are sure what you're doing**
      *
      * The runtime version associated with this manifest for the iOS platform. If provided, this will override the top level runtimeVersion key.
      * Set this to `{"policy": "nativeVersion"}` to generate it automatically based on the 'version' and 'ios.buildNumber' or
      * to `{"policy": "appVersion"}` to use just 'version' field.
      */
    var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
    
    /**
      * Configuration for loading and splash screen for standalone iOS apps.
      */
    var splash: js.UndefOr[Image] = js.undefined
    
    /**
      * Whether your standalone iOS app supports tablet screen sizes. Defaults to `false`.
      */
    var supportsTablet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration to force the app to always use the light or dark user-interface appearance, such as "dark mode", or make it automatically adapt to the system preferences. If not provided, defaults to `light`.
      */
    var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
    
    /**
      * A boolean indicating if the app uses Apple Sign-In. See `AppleAuthentication` docs for details.
      */
    var usesAppleSignIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean indicating if the app uses iCloud Storage for `DocumentPicker`. See `DocumentPicker` docs for details.
      */
    var usesIcloudStorage: js.UndefOr[Boolean] = js.undefined
  }
  object IOS {
    
    inline def apply(): IOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOS]
    }
    
    extension [Self <: IOS](x: Self) {
      
      inline def setAccessesContactNotes(value: Boolean): Self = StObject.set(x, "accessesContactNotes", value.asInstanceOf[js.Any])
      
      inline def setAccessesContactNotesUndefined: Self = StObject.set(x, "accessesContactNotes", js.undefined)
      
      inline def setAppStoreUrl(value: String): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
      
      inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
      
      inline def setAssociatedDomains(value: js.Array[String]): Self = StObject.set(x, "associatedDomains", value.asInstanceOf[js.Any])
      
      inline def setAssociatedDomainsUndefined: Self = StObject.set(x, "associatedDomains", js.undefined)
      
      inline def setAssociatedDomainsVarargs(value: String*): Self = StObject.set(x, "associatedDomains", js.Array(value*))
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBitcode(value: Boolean | String): Self = StObject.set(x, "bitcode", value.asInstanceOf[js.Any])
      
      inline def setBitcodeUndefined: Self = StObject.set(x, "bitcode", js.undefined)
      
      inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
      
      inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
      
      inline def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
      
      inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
      
      inline def setConfig(value: GoogleMapsApiKey): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEntitlements(value: StringDictionary[Any]): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      inline def setGoogleServicesFile(value: String): Self = StObject.set(x, "googleServicesFile", value.asInstanceOf[js.Any])
      
      inline def setGoogleServicesFileUndefined: Self = StObject.set(x, "googleServicesFile", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInfoPlist(value: StringDictionary[Any]): Self = StObject.set(x, "infoPlist", value.asInstanceOf[js.Any])
      
      inline def setInfoPlistUndefined: Self = StObject.set(x, "infoPlist", js.undefined)
      
      inline def setIsTabletOnly(value: Boolean): Self = StObject.set(x, "isTabletOnly", value.asInstanceOf[js.Any])
      
      inline def setIsTabletOnlyUndefined: Self = StObject.set(x, "isTabletOnly", js.undefined)
      
      inline def setJsEngine(value: hermes | jsc): Self = StObject.set(x, "jsEngine", value.asInstanceOf[js.Any])
      
      inline def setJsEngineUndefined: Self = StObject.set(x, "jsEngine", js.undefined)
      
      inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
      
      inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
      
      inline def setPublishBundlePath(value: String): Self = StObject.set(x, "publishBundlePath", value.asInstanceOf[js.Any])
      
      inline def setPublishBundlePathUndefined: Self = StObject.set(x, "publishBundlePath", js.undefined)
      
      inline def setPublishManifestPath(value: String): Self = StObject.set(x, "publishManifestPath", value.asInstanceOf[js.Any])
      
      inline def setPublishManifestPathUndefined: Self = StObject.set(x, "publishManifestPath", js.undefined)
      
      inline def setRequireFullScreen(value: Boolean): Self = StObject.set(x, "requireFullScreen", value.asInstanceOf[js.Any])
      
      inline def setRequireFullScreenUndefined: Self = StObject.set(x, "requireFullScreen", js.undefined)
      
      inline def setRuntimeVersion(value: String | Policy): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
      
      inline def setSplash(value: Image): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
      
      inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
      
      inline def setSupportsTablet(value: Boolean): Self = StObject.set(x, "supportsTablet", value.asInstanceOf[js.Any])
      
      inline def setSupportsTabletUndefined: Self = StObject.set(x, "supportsTablet", js.undefined)
      
      inline def setUserInterfaceStyle(value: light | dark | automatic): Self = StObject.set(x, "userInterfaceStyle", value.asInstanceOf[js.Any])
      
      inline def setUserInterfaceStyleUndefined: Self = StObject.set(x, "userInterfaceStyle", js.undefined)
      
      inline def setUsesAppleSignIn(value: Boolean): Self = StObject.set(x, "usesAppleSignIn", value.asInstanceOf[js.Any])
      
      inline def setUsesAppleSignInUndefined: Self = StObject.set(x, "usesAppleSignIn", js.undefined)
      
      inline def setUsesIcloudStorage(value: Boolean): Self = StObject.set(x, "usesIcloudStorage", value.asInstanceOf[js.Any])
      
      inline def setUsesIcloudStorageUndefined: Self = StObject.set(x, "usesIcloudStorage", js.undefined)
    }
  }
  
  trait PublishHook
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var config: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
  }
  object PublishHook {
    
    inline def apply(): PublishHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishHook]
    }
    
    extension [Self <: PublishHook](x: Self) {
      
      inline def setConfig(value: StringDictionary[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfigTypes.expoConfigTypesStrings.sdkVersion
    - typings.expoConfigTypes.expoConfigTypesStrings.nativeVersion
    - typings.expoConfigTypes.expoConfigTypesStrings.appVersion
  */
  trait RuntimeVersionPolicy extends StObject
  object RuntimeVersionPolicy {
    
    inline def appVersion: typings.expoConfigTypes.expoConfigTypesStrings.appVersion = "appVersion".asInstanceOf[typings.expoConfigTypes.expoConfigTypesStrings.appVersion]
    
    inline def nativeVersion: typings.expoConfigTypes.expoConfigTypesStrings.nativeVersion = "nativeVersion".asInstanceOf[typings.expoConfigTypes.expoConfigTypesStrings.nativeVersion]
    
    inline def sdkVersion: typings.expoConfigTypes.expoConfigTypesStrings.sdkVersion = "sdkVersion".asInstanceOf[typings.expoConfigTypes.expoConfigTypesStrings.sdkVersion]
  }
  
  trait Splash
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * Color to fill the loading screen background
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Local path or remote URL to an image to fill the background of the loading screen. Image size and aspect ratio are up to you. Must be a .png.
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * Determines how the `image` will be displayed in the splash loading screen. Must be one of `cover` or `contain`, defaults to `contain`.
      */
    var resizeMode: js.UndefOr[cover | contain] = js.undefined
  }
  object Splash {
    
    inline def apply(): Splash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Splash]
    }
    
    extension [Self <: Splash](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setResizeMode(value: cover | contain): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    }
  }
  
  trait Web
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    /**
      * Defines the expected “background color” for the website. This value repeats what is already available in the site’s CSS, but can be used by browsers to draw the background color of a shortcut when the manifest is available before the stylesheet has loaded. This creates a smooth transition between launching the web application and loading the site's content.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * If content is set to default, the status bar appears normal. If set to black, the status bar has a black background. If set to black-translucent, the status bar is black and translucent. If set to default or black, the web content is displayed below the status bar. If set to black-translucent, the web content is displayed on the entire screen, partially obscured by the status bar.
      */
    var barStyle: js.UndefOr[default | black | `black-translucent`] = js.undefined
    
    /**
      * Sets the bundler to use for the web platform. Only supported in the local CLI `npx expo`.
      */
    var bundler: js.UndefOr[webpack | metro] = js.undefined
    
    /**
      * Firebase web configuration. Used by the expo-firebase packages on both web and native. [Learn more](https://firebase.google.com/docs/reference/js/firebase.html#initializeapp)
      */
    var config: js.UndefOr[Firebase] = js.undefined
    
    /**
      * Experimental features. These will break without deprecation notice.
      */
    var dangerous: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Provides a general description of what the pinned website does.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the primary text direction for the name, short_name, and description members. Together with the lang member, it helps the correct display of right-to-left languages.
      */
    var dir: js.UndefOr[auto | ltr | rtl] = js.undefined
    
    /**
      * Defines the developers’ preferred display mode for the website.
      */
    var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.undefined
    
    /**
      * Relative path of an image to use for your app's favicon.
      */
    var favicon: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the primary language for the values in the name and short_name members. This value is a string containing a single language tag.
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the title of the document, defaults to the outer level name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the default orientation for all the website's top level browsing contexts.
      */
    var orientation: js.UndefOr[
        any | natural | landscape | `landscape-primary` | `landscape-secondary` | portrait | `portrait-primary` | `portrait-secondary`
      ] = js.undefined
    
    /**
      * Hints for the user agent to indicate to the user that the specified native applications (defined in expo.ios and expo.android) are recommended over the website.
      */
    var preferRelatedApplications: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the navigation scope of this website's context. This restricts what web pages can be viewed while the manifest is applied. If the user navigates outside the scope, it returns to a normal web page inside a browser tab/window. If the scope is a relative URL, the base URL will be the URL of the manifest.
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * A short version of the app's name, 12 characters or fewer. Used in app launcher and new tab pages. Maps to `short_name` in the PWA manifest.json. Defaults to the `name` property.
      */
    var shortName: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration for PWA splash screens.
      */
    var splash: js.UndefOr[ResizeMode] = js.undefined
    
    /**
      * The URL that loads when a user launches the application (e.g., when added to home screen), typically the index. Note: This has to be a relative URL, relative to the manifest URL.
      */
    var startUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the color of the Android tool bar, and may be reflected in the app's preview in task switchers.
      */
    var themeColor: js.UndefOr[String] = js.undefined
  }
  object Web {
    
    inline def apply(): Web = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Web]
    }
    
    extension [Self <: Web](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBarStyle(value: default | black | `black-translucent`): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setBundler(value: webpack | metro): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
      
      inline def setBundlerUndefined: Self = StObject.set(x, "bundler", js.undefined)
      
      inline def setConfig(value: Firebase): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDangerous(value: StringDictionary[Any]): Self = StObject.set(x, "dangerous", value.asInstanceOf[js.Any])
      
      inline def setDangerousUndefined: Self = StObject.set(x, "dangerous", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDir(value: auto | ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrientation(
        value: any | natural | landscape | `landscape-primary` | `landscape-secondary` | portrait | `portrait-primary` | `portrait-secondary`
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPreferRelatedApplications(value: Boolean): Self = StObject.set(x, "preferRelatedApplications", value.asInstanceOf[js.Any])
      
      inline def setPreferRelatedApplicationsUndefined: Self = StObject.set(x, "preferRelatedApplications", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setSplash(value: ResizeMode): Self = StObject.set(x, "splash", value.asInstanceOf[js.Any])
      
      inline def setSplashUndefined: Self = StObject.set(x, "splash", js.undefined)
      
      inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
      
      inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
      
      inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
    }
  }
}
