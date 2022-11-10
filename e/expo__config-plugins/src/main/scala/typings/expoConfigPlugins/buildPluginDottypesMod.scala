package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.AppBuildGradle
import typings.expoConfigPlugins.anon.AppDelegate
import typings.expoConfigPlugins.anon.IsIntrospective
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginDottypesMod {
  
  type ConfigPlugin[Props] = js.Function2[/* config */ ExpoConfig, /* props */ Props, ExpoConfig]
  
  trait ExportedConfig
    extends StObject
       with ExpoConfig {
    
    var mods: js.UndefOr[ModConfig | Null] = js.undefined
  }
  object ExportedConfig {
    
    inline def apply(name: String, slug: String): ExportedConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedConfig]
    }
    
    extension [Self <: ExportedConfig](x: Self) {
      
      inline def setMods(value: ModConfig): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
      
      inline def setModsNull: Self = StObject.set(x, "mods", null)
      
      inline def setModsUndefined: Self = StObject.set(x, "mods", js.undefined)
    }
  }
  
  trait ExportedConfigWithProps[Data]
    extends StObject
       with ExportedConfig {
    
    /**
      * A frozen representation of the original file contents,
      * this can be used as a reference into the user's original intent.
      *
      * For example, you could infer that the user defined a certain
      * value explicitly and disable any automatic changes.
      */
    val modRawConfig: ExpoConfig
    
    var modRequest: ModProps[Data]
    
    /**
      * The Object representation of a complex file type.
      */
    var modResults: Data
  }
  object ExportedConfigWithProps {
    
    inline def apply[Data](modRawConfig: ExpoConfig, modRequest: ModProps[Data], modResults: Data, name: String, slug: String): ExportedConfigWithProps[Data] = {
      val __obj = js.Dynamic.literal(modRawConfig = modRawConfig.asInstanceOf[js.Any], modRequest = modRequest.asInstanceOf[js.Any], modResults = modResults.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedConfigWithProps[Data]]
    }
    
    extension [Self <: ExportedConfigWithProps[?], Data](x: Self & ExportedConfigWithProps[Data]) {
      
      inline def setModRawConfig(value: ExpoConfig): Self = StObject.set(x, "modRawConfig", value.asInstanceOf[js.Any])
      
      inline def setModRequest(value: ModProps[Data]): Self = StObject.set(x, "modRequest", value.asInstanceOf[js.Any])
      
      inline def setModResults(value: Data): Self = StObject.set(x, "modResults", value.asInstanceOf[js.Any])
    }
  }
  
  type Mod[Props] = (js.Function1[
    /* config */ ExportedConfigWithProps[Props], 
    OptionalPromise[ExportedConfigWithProps[Props]]
  ]) & IsIntrospective
  
  trait ModConfig extends StObject {
    
    var android: js.UndefOr[AppBuildGradle] = js.undefined
    
    var ios: js.UndefOr[AppDelegate] = js.undefined
  }
  object ModConfig {
    
    inline def apply(): ModConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModConfig]
    }
    
    extension [Self <: ModConfig](x: Self) {
      
      inline def setAndroid(value: AppBuildGradle): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setIos(value: AppDelegate): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfigPlugins.expoConfigPluginsStrings.android
    - typings.expoConfigPlugins.expoConfigPluginsStrings.ios
  */
  trait ModPlatform extends StObject
  
  trait ModProps[T] extends StObject {
    
    /**
      * If the mod is being evaluated in introspection mode.
      * No file system modifications should be made when introspect is `true`.
      */
    val introspect: Boolean
    
    /**
      * Name of the mod.
      */
    val modName: String
    
    var nextMod: js.UndefOr[Mod[T]] = js.undefined
    
    /**
      * Name of the platform used in the mods config.
      */
    val platform: ModPlatform
    
    /**
      * Project root for the specific platform.
      */
    val platformProjectRoot: String
    
    /**
      * [iOS]: The path component used for querying project files.
      *
      * @example projectRoot/ios/[projectName]/
      */
    val projectName: js.UndefOr[String] = js.undefined
    
    /**
      * Project root directory for the universal app.
      */
    val projectRoot: String
  }
  object ModProps {
    
    inline def apply[T](
      introspect: Boolean,
      modName: String,
      platform: ModPlatform,
      platformProjectRoot: String,
      projectRoot: String
    ): ModProps[T] = {
      val __obj = js.Dynamic.literal(introspect = introspect.asInstanceOf[js.Any], modName = modName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformProjectRoot = platformProjectRoot.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModProps[T]]
    }
    
    extension [Self <: ModProps[?], T](x: Self & ModProps[T]) {
      
      inline def setIntrospect(value: Boolean): Self = StObject.set(x, "introspect", value.asInstanceOf[js.Any])
      
      inline def setModName(value: String): Self = StObject.set(x, "modName", value.asInstanceOf[js.Any])
      
      inline def setNextMod(value: Mod[T]): Self = StObject.set(x, "nextMod", value.asInstanceOf[js.Any])
      
      inline def setNextModUndefined: Self = StObject.set(x, "nextMod", js.undefined)
      
      inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformProjectRoot(value: String): Self = StObject.set(x, "platformProjectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionalPromise[T] = js.Promise[T] | T
  
  type Plist = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONObject */ Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (config : any, props : infer P): any ? P : never
    }}}
    */
  @js.native
  trait PluginParameters[T /* <: ConfigPlugin[Any] */] extends StObject
  
  type StaticPlugin[T] = js.Tuple2[String | ConfigPlugin[T], T]
}
