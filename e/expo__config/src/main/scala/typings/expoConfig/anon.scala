package typings.expoConfig

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfig.buildConfigDottypesMod.AppJSONConfig
import typings.expoConfig.buildConfigDottypesMod.EASConfig
import typings.expoConfig.buildConfigDottypesMod.ExpoClientConfig
import typings.expoConfig.buildConfigDottypesMod.ExpoGoConfig
import typings.expoConfig.buildConfigDottypesMod.ProjectConfig
import typings.expoConfig.buildEvalConfigMod._RawDynamicConfig
import typings.expoConfig.expoConfigStrings.`object`
import typings.expoConfig.expoConfigStrings.android
import typings.expoConfig.expoConfigStrings.automatic
import typings.expoConfig.expoConfigStrings.bigint
import typings.expoConfig.expoConfigStrings.boolean
import typings.expoConfig.expoConfigStrings.dark
import typings.expoConfig.expoConfigStrings.default
import typings.expoConfig.expoConfigStrings.expo
import typings.expoConfig.expoConfigStrings.fail
import typings.expoConfig.expoConfigStrings.function
import typings.expoConfig.expoConfigStrings.hermes
import typings.expoConfig.expoConfigStrings.hidden
import typings.expoConfig.expoConfigStrings.ios
import typings.expoConfig.expoConfigStrings.jsc
import typings.expoConfig.expoConfigStrings.landscape
import typings.expoConfig.expoConfigStrings.light
import typings.expoConfig.expoConfigStrings.number
import typings.expoConfig.expoConfigStrings.portrait
import typings.expoConfig.expoConfigStrings.public
import typings.expoConfig.expoConfigStrings.string
import typings.expoConfig.expoConfigStrings.success
import typings.expoConfig.expoConfigStrings.symbol
import typings.expoConfig.expoConfigStrings.undefined
import typings.expoConfig.expoConfigStrings.unlisted
import typings.expoConfig.expoConfigStrings.warn
import typings.expoConfig.expoConfigStrings.web
import typings.expoConfigTypes.anon.AndroidCollapsedTitle
import typings.expoConfigTypes.anon.BarStyle
import typings.expoConfigTypes.anon.CheckAutomatically
import typings.expoConfigTypes.anon.PluginHistory
import typings.expoConfigTypes.anon.Policy
import typings.expoConfigTypes.anon.PostExport
import typings.expoConfigTypes.anon.SilentLaunch
import typings.expoConfigTypes.anon.TurboModules
import typings.expoConfigTypes.anon.Visible
import typings.expoConfigTypes.mod.Android
import typings.expoConfigTypes.mod.IOS
import typings.expoConfigTypes.mod.Splash
import typings.expoConfigTypes.mod.Web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AndroidManifestPath extends StObject {
    
    var androidManifestPath: js.UndefOr[String] = js.undefined
    
    var iosManifestPath: js.UndefOr[String] = js.undefined
  }
  object AndroidManifestPath {
    
    inline def apply(): AndroidManifestPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AndroidManifestPath]
    }
    
    extension [Self <: AndroidManifestPath](x: Self) {
      
      inline def setAndroidManifestPath(value: String): Self = StObject.set(x, "androidManifestPath", value.asInstanceOf[js.Any])
      
      inline def setAndroidManifestPathUndefined: Self = StObject.set(x, "androidManifestPath", js.undefined)
      
      inline def setIosManifestPath(value: String): Self = StObject.set(x, "iosManifestPath", value.asInstanceOf[js.Any])
      
      inline def setIosManifestPathUndefined: Self = StObject.set(x, "iosManifestPath", js.undefined)
    }
  }
  
  trait AppName extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var webName: js.UndefOr[String] = js.undefined
  }
  object AppName {
    
    inline def apply(): AppName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setWebName(value: String): Self = StObject.set(x, "webName", value.asInstanceOf[js.Any])
      
      inline def setWebNameUndefined: Self = StObject.set(x, "webName", js.undefined)
    }
  }
  
  /* Inlined @expo/config.@expo/config/build/Config.types.ClientScopingConfig & {  expoClient :@expo/config.@expo/config/build/Config.types.ExpoClientConfig | undefined,   expoGo :@expo/config.@expo/config/build/Config.types.ExpoGoConfig | undefined,   eas :@expo/config.@expo/config/build/Config.types.EASConfig | undefined} */
  trait ClientScopingConfigexpoCl extends StObject {
    
    var eas: js.UndefOr[EASConfig] = js.undefined
    
    var expoClient: js.UndefOr[ExpoClientConfig] = js.undefined
    
    var expoGo: js.UndefOr[ExpoGoConfig] = js.undefined
    
    var scopeKey: js.UndefOr[String] = js.undefined
  }
  object ClientScopingConfigexpoCl {
    
    inline def apply(): ClientScopingConfigexpoCl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientScopingConfigexpoCl]
    }
    
    extension [Self <: ClientScopingConfigexpoCl](x: Self) {
      
      inline def setEas(value: EASConfig): Self = StObject.set(x, "eas", value.asInstanceOf[js.Any])
      
      inline def setEasUndefined: Self = StObject.set(x, "eas", js.undefined)
      
      inline def setExpoClient(value: ExpoClientConfig): Self = StObject.set(x, "expoClient", value.asInstanceOf[js.Any])
      
      inline def setExpoClientUndefined: Self = StObject.set(x, "expoClient", js.undefined)
      
      inline def setExpoGo(value: ExpoGoConfig): Self = StObject.set(x, "expoGo", value.asInstanceOf[js.Any])
      
      inline def setExpoGoUndefined: Self = StObject.set(x, "expoGo", js.undefined)
      
      inline def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
      
      inline def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var config: AppJSONConfig | Null
    
    var message: js.UndefOr[String] = js.undefined
    
    var `type`: success | warn | fail
  }
  object Config {
    
    inline def apply(`type`: success | warn | fail): Config = {
      val __obj = js.Dynamic.literal(config = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: AppJSONConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigNull: Self = StObject.set(x, "config", null)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: success | warn | fail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigName extends StObject {
    
    var configName: String
    
    var configNamespace: expo
    
    var configPath: String
  }
  object ConfigName {
    
    inline def apply(configName: String, configPath: String): ConfigName = {
      val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any], configNamespace = "expo", configPath = configPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigName]
    }
    
    extension [Self <: ConfigName](x: Self) {
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNamespace(value: expo): Self = StObject.set(x, "configNamespace", value.asInstanceOf[js.Any])
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportedObjectType extends StObject {
    
    var config: Any
    
    var exportedObjectType: string | number | bigint | boolean | symbol | undefined | `object` | function
  }
  object ExportedObjectType {
    
    inline def apply(
      config: Any,
      exportedObjectType: string | number | bigint | boolean | symbol | undefined | `object` | function
    ): ExportedObjectType = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], exportedObjectType = exportedObjectType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedObjectType]
    }
    
    extension [Self <: ExportedObjectType](x: Self) {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setExportedObjectType(value: string | number | bigint | boolean | symbol | undefined | `object` | function): Self = StObject.set(x, "exportedObjectType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@expo/config.@expo/config/build/Config.types.ExpoConfig> */
  trait PartialExpoConfig
    extends StObject
       with _RawDynamicConfig {
    
    var _internal: js.UndefOr[PluginHistory] = js.undefined
    
    var android: js.UndefOr[Android] = js.undefined
    
    var androidNavigationBar: js.UndefOr[Visible] = js.undefined
    
    var androidStatusBar: js.UndefOr[BarStyle] = js.undefined
    
    var appKey: js.UndefOr[String] = js.undefined
    
    var assetBundlePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var currentFullName: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var detach: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var developmentClient: js.UndefOr[SilentLaunch] = js.undefined
    
    var entryPoint: js.UndefOr[String] = js.undefined
    
    var experiments: js.UndefOr[TurboModules] = js.undefined
    
    var extra: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var facebookAdvertiserIDCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookAppId: js.UndefOr[String] = js.undefined
    
    var facebookAutoInitEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookAutoLogAppEventsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var facebookDisplayName: js.UndefOr[String] = js.undefined
    
    var facebookScheme: js.UndefOr[String] = js.undefined
    
    var githubUrl: js.UndefOr[String] = js.undefined
    
    var hooks: js.UndefOr[PostExport] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var ios: js.UndefOr[IOS] = js.undefined
    
    var isDetached: js.UndefOr[Boolean] = js.undefined
    
    var jsEngine: js.UndefOr[hermes | jsc] = js.undefined
    
    var locales: js.UndefOr[StringDictionary[String | StringDictionary[Any]]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var notification: js.UndefOr[AndroidCollapsedTitle] = js.undefined
    
    var orientation: js.UndefOr[default | portrait | landscape] = js.undefined
    
    var originalFullName: js.UndefOr[String] = js.undefined
    
    var owner: js.UndefOr[String] = js.undefined
    
    var packagerOpts: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var platforms: js.UndefOr[js.Array[android | ios | web]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | (js.Array[Any | String]) | (js.Tuple2[String, Any])]] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var privacy: js.UndefOr[public | unlisted | hidden] = js.undefined
    
    var runtimeVersion: js.UndefOr[String | Policy] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var sdkVersion: js.UndefOr[String] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
    
    var splash: js.UndefOr[Splash] = js.undefined
    
    var updates: js.UndefOr[CheckAutomatically] = js.undefined
    
    var userInterfaceStyle: js.UndefOr[light | dark | automatic] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var web: js.UndefOr[Web] = js.undefined
  }
  object PartialExpoConfig {
    
    inline def apply(): PartialExpoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExpoConfig]
    }
    
    extension [Self <: PartialExpoConfig](x: Self) {
      
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
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
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
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
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
  
  /* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'owner'> */
  trait PickExpoConfigowner extends StObject {
    
    var owner: js.UndefOr[String] = js.undefined
  }
  object PickExpoConfigowner {
    
    inline def apply(): PickExpoConfigowner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickExpoConfigowner]
    }
    
    extension [Self <: PickExpoConfigowner](x: Self) {
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'owner' | 'slug'> */
  trait PickExpoConfigownerslug extends StObject {
    
    var owner: js.UndefOr[String] = js.undefined
    
    var slug: String
  }
  object PickExpoConfigownerslug {
    
    inline def apply(slug: String): PickExpoConfigownerslug = {
      val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickExpoConfigownerslug]
    }
    
    extension [Self <: PickExpoConfigownerslug](x: Self) {
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@expo/config.@expo/config/build/Config.types.ExpoConfig, 'sdkVersion'> */
  trait PickExpoConfigsdkVersion extends StObject {
    
    var sdkVersion: js.UndefOr[String] = js.undefined
  }
  object PickExpoConfigsdkVersion {
    
    inline def apply(): PickExpoConfigsdkVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickExpoConfigsdkVersion]
    }
    
    extension [Self <: PickExpoConfigsdkVersion](x: Self) {
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    }
  }
  
  trait Platform extends StObject {
    
    var platform: String
    
    var projectConfig: js.UndefOr[ProjectConfig] = js.undefined
  }
  object Platform {
    
    inline def apply(platform: String): Platform = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Platform]
    }
    
    extension [Self <: Platform](x: Self) {
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setProjectConfig(value: ProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
      
      inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    }
  }
  
  trait ProjectRoot extends StObject {
    
    var projectRoot: js.UndefOr[String] = js.undefined
    
    var tool: String | Null
  }
  object ProjectRoot {
    
    inline def apply(): ProjectRoot = {
      val __obj = js.Dynamic.literal(tool = null)
      __obj.asInstanceOf[ProjectRoot]
    }
    
    extension [Self <: ProjectRoot](x: Self) {
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def setTool(value: String): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolNull: Self = StObject.set(x, "tool", null)
    }
  }
}
