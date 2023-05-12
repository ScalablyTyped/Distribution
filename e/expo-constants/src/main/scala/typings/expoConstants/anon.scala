package typings.expoConstants

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigTypes.anon.AndroidCollapsedTitle
import typings.expoConfigTypes.anon.BackgroundColor
import typings.expoConfigTypes.anon.BarStyle
import typings.expoConfigTypes.anon.CheckAutomatically
import typings.expoConfigTypes.anon.Dictk
import typings.expoConfigTypes.anon.Policy
import typings.expoConfigTypes.anon.PostExport
import typings.expoConfigTypes.anon.SilentLaunch
import typings.expoConfigTypes.anon.TurboModules
import typings.expoConfigTypes.mod.Android
import typings.expoConfigTypes.mod.IOS
import typings.expoConfigTypes.mod.Splash
import typings.expoConfigTypes.mod.Web
import typings.expoConstants.expoConstantsStrings.android
import typings.expoConstants.expoConstantsStrings.automatic
import typings.expoConstants.expoConstantsStrings.dark
import typings.expoConstants.expoConstantsStrings.default
import typings.expoConstants.expoConstantsStrings.hermes
import typings.expoConstants.expoConstantsStrings.hidden
import typings.expoConstants.expoConstantsStrings.ios
import typings.expoConstants.expoConstantsStrings.jsc
import typings.expoConstants.expoConstantsStrings.landscape
import typings.expoConstants.expoConstantsStrings.light
import typings.expoConstants.expoConstantsStrings.portrait
import typings.expoConstants.expoConstantsStrings.public
import typings.expoConstants.expoConstantsStrings.unlisted
import typings.expoConstants.expoConstantsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var tool: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setTool(value: String): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
    }
  }
  
  /* Inlined @expo/config-types.@expo/config-types.ExpoConfig & {  hostUri :string | undefined} */
  trait ExpoConfighostUristringun extends StObject {
    
    /**
      * Internal properties for developer tools
      */
    var _internal: js.UndefOr[Dictk] = js.undefined
    
    var android: js.UndefOr[Android] = js.undefined
    
    /**
      * Configuration for the bottom navigation bar on Android. Can be used to configure the `expo-navigation-bar` module in EAS Build.
      */
    var androidNavigationBar: js.UndefOr[BarStyle] = js.undefined
    
    /**
      * Configuration for the status bar on Android. For more details please navigate to [Configuring StatusBar](https://docs.expo.dev/guides/configuring-statusbar/).
      */
    var androidStatusBar: js.UndefOr[BackgroundColor] = js.undefined
    
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
      * @deprecated Use a `main` field in the project `package.json` instead.
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
      * If you would like to share the source code of your app on Github, enter the URL for the repository here and it will be linked to from your Expo project page.
      */
    var githubUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration for scripts to run to hook into the publish process
      */
    var hooks: js.UndefOr[PostExport] = js.undefined
    
    /**
      * Only present during development using @expo/cli.
      */
    var hostUri: js.UndefOr[String] = js.undefined
    
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
      * Specifies the JavaScript engine for apps. Supported only on EAS Build. Defaults to `hermes`. Valid values: `hermes`, `jsc`.
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
      * Set this to `{"policy": "nativeVersion"}` to generate it automatically.
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
  object ExpoConfighostUristringun {
    
    inline def apply(name: String, slug: String): ExpoConfighostUristringun = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpoConfighostUristringun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpoConfighostUristringun] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: Android): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidNavigationBar(value: BarStyle): Self = StObject.set(x, "androidNavigationBar", value.asInstanceOf[js.Any])
      
      inline def setAndroidNavigationBarUndefined: Self = StObject.set(x, "androidNavigationBar", js.undefined)
      
      inline def setAndroidStatusBar(value: BackgroundColor): Self = StObject.set(x, "androidStatusBar", value.asInstanceOf[js.Any])
      
      inline def setAndroidStatusBarUndefined: Self = StObject.set(x, "androidStatusBar", js.undefined)
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
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
      
      inline def setGithubUrl(value: String): Self = StObject.set(x, "githubUrl", value.asInstanceOf[js.Any])
      
      inline def setGithubUrlUndefined: Self = StObject.set(x, "githubUrl", js.undefined)
      
      inline def setHooks(value: PostExport): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
      
      inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
      
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
      
      inline def set_internal(value: Dictk): Self = StObject.set(x, "_internal", value.asInstanceOf[js.Any])
      
      inline def set_internalUndefined: Self = StObject.set(x, "_internal", js.undefined)
    }
  }
  
  trait Scheme
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object Scheme {
    
    inline def apply(): Scheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scheme] (val x: Self) extends AnyVal {
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
