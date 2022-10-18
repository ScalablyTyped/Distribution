package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ConfigPlugin
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginFile extends StObject {
  
  var isPluginFile: Boolean
  
  def plugin(config: ExpoConfig, props: Any): ExpoConfig
  
  var pluginFile: String
  
  var pluginReference: String
  
  @JSName("plugin")
  var plugin_Original: ConfigPlugin[Any]
}
object PluginFile {
  
  inline def apply(
    isPluginFile: Boolean,
    plugin: (/* config */ ExpoConfig, Any) => ExpoConfig,
    pluginFile: String,
    pluginReference: String
  ): PluginFile = {
    val __obj = js.Dynamic.literal(isPluginFile = isPluginFile.asInstanceOf[js.Any], plugin = js.Any.fromFunction2(plugin), pluginFile = pluginFile.asInstanceOf[js.Any], pluginReference = pluginReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginFile]
  }
  
  extension [Self <: PluginFile](x: Self) {
    
    inline def setIsPluginFile(value: Boolean): Self = StObject.set(x, "isPluginFile", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: (/* config */ ExpoConfig, Any) => ExpoConfig): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
    
    inline def setPluginFile(value: String): Self = StObject.set(x, "pluginFile", value.asInstanceOf[js.Any])
    
    inline def setPluginReference(value: String): Self = StObject.set(x, "pluginReference", value.asInstanceOf[js.Any])
  }
}
