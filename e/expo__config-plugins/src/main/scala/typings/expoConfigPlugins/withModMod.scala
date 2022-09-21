package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Action
import typings.expoConfigPlugins.anon.ActionMod
import typings.expoConfigPlugins.pluginTypesMod.ExportedConfig
import typings.expoConfigPlugins.pluginTypesMod.ModPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withModMod {
  
  @JSImport("@expo/config-plugins/build/plugins/withMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withBaseMod[T](
    config: ExportedConfig,
    hasPlatformModActionSkipEmptyModIsProviderIsIntrospectiveSaveToInternal: BaseModOptions & ActionMod[T]
  ): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withBaseMod")(config.asInstanceOf[js.Any], hasPlatformModActionSkipEmptyModIsProviderIsIntrospectiveSaveToInternal.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  inline def withMod[T](config: ExportedConfig, hasPlatformModAction: Action[T]): ExportedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("withMod")(config.asInstanceOf[js.Any], hasPlatformModAction.asInstanceOf[js.Any])).asInstanceOf[ExportedConfig]
  
  trait BaseModOptions extends StObject {
    
    /**
      * If the mod supports introspection, and avoids making any filesystem modifications during compilation.
      * By enabling, this mod, and all of its descendants will be run in introspection mode.
      * This should only be used for static files like JSON or XML, and not for application files that require regexes,
      * or complex static files that require other files to be generated like Xcode `.pbxproj`.
      */
    var isIntrospective: js.UndefOr[Boolean] = js.undefined
    
    var isProvider: js.UndefOr[Boolean] = js.undefined
    
    var mod: String
    
    var platform: ModPlatform
    
    var saveToInternal: js.UndefOr[Boolean] = js.undefined
    
    var skipEmptyMod: js.UndefOr[Boolean] = js.undefined
  }
  object BaseModOptions {
    
    inline def apply(mod: String, platform: ModPlatform): BaseModOptions = {
      val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseModOptions]
    }
    
    extension [Self <: BaseModOptions](x: Self) {
      
      inline def setIsIntrospective(value: Boolean): Self = StObject.set(x, "isIntrospective", value.asInstanceOf[js.Any])
      
      inline def setIsIntrospectiveUndefined: Self = StObject.set(x, "isIntrospective", js.undefined)
      
      inline def setIsProvider(value: Boolean): Self = StObject.set(x, "isProvider", value.asInstanceOf[js.Any])
      
      inline def setIsProviderUndefined: Self = StObject.set(x, "isProvider", js.undefined)
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSaveToInternal(value: Boolean): Self = StObject.set(x, "saveToInternal", value.asInstanceOf[js.Any])
      
      inline def setSaveToInternalUndefined: Self = StObject.set(x, "saveToInternal", js.undefined)
      
      inline def setSkipEmptyMod(value: Boolean): Self = StObject.set(x, "skipEmptyMod", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyModUndefined: Self = StObject.set(x, "skipEmptyMod", js.undefined)
    }
  }
}
