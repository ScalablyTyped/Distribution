package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.OmitPluginHistoryItemvers
import typings.expoConfigPlugins.anon.PickExpoConfiginternal
import typings.expoConfigPlugins.buildPluginDottypesMod.ModPlatform
import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsHistoryMod {
  
  @JSImport("@expo/config-plugins/build/utils/history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHistoryItem(config: ExpoConfig, item: OmitPluginHistoryItemvers): ExpoConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("addHistoryItem")(config.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[ExpoConfig]
  
  inline def getHistoryItem(config: PickExpoConfiginternal, name: String): PluginHistoryItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getHistoryItem")(config.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PluginHistoryItem | Null]
  
  trait PluginHistoryItem extends StObject {
    
    var name: String
    
    var platform: js.UndefOr[ModPlatform] = js.undefined
    
    var version: String
  }
  object PluginHistoryItem {
    
    inline def apply(name: String, version: String): PluginHistoryItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginHistoryItem]
    }
    
    extension [Self <: PluginHistoryItem](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: ModPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
