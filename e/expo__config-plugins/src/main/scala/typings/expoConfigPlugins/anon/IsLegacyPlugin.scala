package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigPlugins.buildPluginDottypesMod.StaticPlugin
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLegacyPlugin extends StObject {
  
  var _isLegacyPlugin: js.UndefOr[Boolean] = js.undefined
  
  var fallback: js.UndefOr[ConfigPlugin[ResolverError & Any]] = js.undefined
  
  var plugin: StaticPlugin[Any] | ConfigPlugin[Unit] | String
  
  var projectRoot: js.UndefOr[String] = js.undefined
}
object IsLegacyPlugin {
  
  inline def apply(plugin: StaticPlugin[Any] | ConfigPlugin[Unit] | String): IsLegacyPlugin = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLegacyPlugin]
  }
  
  extension [Self <: IsLegacyPlugin](x: Self) {
    
    inline def setFallback(value: (/* config */ ExpoConfig, ResolverError & Any) => ExpoConfig): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setPlugin(value: StaticPlugin[Any] | ConfigPlugin[Unit] | String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginFunction2(value: (/* config */ ExpoConfig, Unit) => ExpoConfig): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
    
    inline def set_isLegacyPlugin(value: Boolean): Self = StObject.set(x, "_isLegacyPlugin", value.asInstanceOf[js.Any])
    
    inline def set_isLegacyPluginUndefined: Self = StObject.set(x, "_isLegacyPlugin", js.undefined)
  }
}
