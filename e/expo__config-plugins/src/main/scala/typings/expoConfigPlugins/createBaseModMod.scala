package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Platform
import typings.expoConfigPlugins.expoConfigPluginsStrings.methodName
import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.expoConfigPlugins.pluginTypesMod.ExportedConfig
import typings.expoConfigPlugins.pluginTypesMod.ExportedConfigWithProps
import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBaseModMod {
  
  @JSImport("@expo/config-plugins/build/plugins/createBaseMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertModResults(results: Any, platformName: String, modName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertModResults")(results.asInstanceOf[js.Any], platformName.asInstanceOf[js.Any], modName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createBaseMod[ModType, Props /* <: ForwardedBaseModOptions */](
    hasMethodNamePlatformModNameGetFilePathReadWriteIsIntrospective: CreateBaseModProps[ModType, Props]
  ): ConfigPlugin[Props | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaseMod")(hasMethodNamePlatformModNameGetFilePathReadWriteIsIntrospective.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Props | Unit]]
  
  inline def createPlatformBaseMod_methodName[ModType, Props /* <: ForwardedBaseModOptions */](hasModNameProps: Omit[CreateBaseModProps[ModType, Props], methodName]): ConfigPlugin[Unit | Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformBaseMod")(hasModNameProps.asInstanceOf[js.Any]).asInstanceOf[ConfigPlugin[Unit | Props]]
  
  inline def provider[ModType, Props /* <: ForwardedBaseModOptions */](props: BaseModProviderMethods[ModType, Props]): BaseModProviderMethods[ModType, Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("provider")(props.asInstanceOf[js.Any]).asInstanceOf[BaseModProviderMethods[ModType, Props]]
  
  inline def withGeneratedBaseMods[ModName /* <: String */](config: ExportedConfig, hasPlatformProvidersProps: ForwardedBaseModOptions & Platform[ModName]): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withGeneratedBaseMods")(config.asInstanceOf[js.Any], hasPlatformProvidersProps.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  trait BaseModProviderMethods[ModType, Props /* <: ForwardedBaseModOptions */] extends StObject {
    
    def getFilePath(config: ExportedConfigWithProps[ModType], props: Props): js.Promise[String] | String
    
    /**
      * If the mod supports introspection, and avoids making any filesystem modifications during compilation.
      * By enabling, this mod, and all of its descendants will be run in introspection mode.
      * This should only be used for static files like JSON or XML, and not for application files that require regexes,
      * or complex static files that require other files to be generated like Xcode `.pbxproj`.
      */
    var isIntrospective: js.UndefOr[Boolean] = js.undefined
    
    def read(filePath: String, config: ExportedConfigWithProps[ModType], props: Props): js.Promise[ModType] | ModType
    
    def write(filePath: String, config: ExportedConfigWithProps[ModType], props: Props): js.Promise[Unit] | Unit
  }
  object BaseModProviderMethods {
    
    inline def apply[ModType, Props /* <: ForwardedBaseModOptions */](
      getFilePath: (ExportedConfigWithProps[ModType], Props) => js.Promise[String] | String,
      read: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[ModType] | ModType,
      write: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[Unit] | Unit
    ): BaseModProviderMethods[ModType, Props] = {
      val __obj = js.Dynamic.literal(getFilePath = js.Any.fromFunction2(getFilePath), read = js.Any.fromFunction3(read), write = js.Any.fromFunction3(write))
      __obj.asInstanceOf[BaseModProviderMethods[ModType, Props]]
    }
    
    extension [Self <: BaseModProviderMethods[?, ?], ModType, Props /* <: ForwardedBaseModOptions */](x: Self & (BaseModProviderMethods[ModType, Props])) {
      
      inline def setGetFilePath(value: (ExportedConfigWithProps[ModType], Props) => js.Promise[String] | String): Self = StObject.set(x, "getFilePath", js.Any.fromFunction2(value))
      
      inline def setIsIntrospective(value: Boolean): Self = StObject.set(x, "isIntrospective", value.asInstanceOf[js.Any])
      
      inline def setIsIntrospectiveUndefined: Self = StObject.set(x, "isIntrospective", js.undefined)
      
      inline def setRead(value: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[ModType] | ModType): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      inline def setWrite(value: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[Unit] | Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
    }
  }
  
  trait CreateBaseModProps[ModType, Props /* <: ForwardedBaseModOptions */]
    extends StObject
       with BaseModProviderMethods[ModType, Props] {
    
    var methodName: String
    
    var modName: String
    
    var platform: ModPlatform
  }
  object CreateBaseModProps {
    
    inline def apply[ModType, Props /* <: ForwardedBaseModOptions */](
      getFilePath: (ExportedConfigWithProps[ModType], Props) => js.Promise[String] | String,
      methodName: String,
      modName: String,
      platform: ModPlatform,
      read: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[ModType] | ModType,
      write: (String, ExportedConfigWithProps[ModType], Props) => js.Promise[Unit] | Unit
    ): CreateBaseModProps[ModType, Props] = {
      val __obj = js.Dynamic.literal(getFilePath = js.Any.fromFunction2(getFilePath), methodName = methodName.asInstanceOf[js.Any], modName = modName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], read = js.Any.fromFunction3(read), write = js.Any.fromFunction3(write))
      __obj.asInstanceOf[CreateBaseModProps[ModType, Props]]
    }
    
    extension [Self <: CreateBaseModProps[?, ?], ModType, Props /* <: ForwardedBaseModOptions */](x: Self & (CreateBaseModProps[ModType, Props])) {
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setModName(value: String): Self = StObject.set(x, "modName", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<@expo/config-plugins.@expo/config-plugins/build/plugins/withMod.BaseModOptions, 'saveToInternal' | 'skipEmptyMod'>> */
  trait ForwardedBaseModOptions extends StObject {
    
    var saveToInternal: js.UndefOr[Boolean] = js.undefined
    
    var skipEmptyMod: js.UndefOr[Boolean] = js.undefined
  }
  object ForwardedBaseModOptions {
    
    inline def apply(): ForwardedBaseModOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardedBaseModOptions]
    }
    
    extension [Self <: ForwardedBaseModOptions](x: Self) {
      
      inline def setSaveToInternal(value: Boolean): Self = StObject.set(x, "saveToInternal", value.asInstanceOf[js.Any])
      
      inline def setSaveToInternalUndefined: Self = StObject.set(x, "saveToInternal", js.undefined)
      
      inline def setSkipEmptyMod(value: Boolean): Self = StObject.set(x, "skipEmptyMod", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyModUndefined: Self = StObject.set(x, "skipEmptyMod", js.undefined)
    }
  }
}
