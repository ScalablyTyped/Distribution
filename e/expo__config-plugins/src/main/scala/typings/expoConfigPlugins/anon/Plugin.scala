package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.pluginTypesMod.ConfigPlugin
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var name: String
  
  def plugin(config: ExpoConfig, props: Unit): ExpoConfig
  @JSName("plugin")
  var plugin_Original: ConfigPlugin[Unit]
  
  var version: js.UndefOr[String] = js.undefined
}
object Plugin {
  
  inline def apply(name: String, plugin: (/* config */ ExpoConfig, Unit) => ExpoConfig): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], plugin = js.Any.fromFunction2(plugin))
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: (/* config */ ExpoConfig, Unit) => ExpoConfig): Self = StObject.set(x, "plugin", js.Any.fromFunction2(value))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
