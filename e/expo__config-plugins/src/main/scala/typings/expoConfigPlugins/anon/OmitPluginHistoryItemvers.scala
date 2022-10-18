package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@expo/config-plugins.@expo/config-plugins/build/utils/history.PluginHistoryItem, 'version'> & {  version :string | undefined} */
trait OmitPluginHistoryItemvers extends StObject {
  
  var name: String
  
  var platform: js.UndefOr[ModPlatform] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object OmitPluginHistoryItemvers {
  
  inline def apply(name: String): OmitPluginHistoryItemvers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPluginHistoryItemvers]
  }
  
  extension [Self <: OmitPluginHistoryItemvers](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
