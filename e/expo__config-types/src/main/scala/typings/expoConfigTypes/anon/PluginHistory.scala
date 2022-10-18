package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginHistory
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * List of plugins already run on the config
    */
  var pluginHistory: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object PluginHistory {
  
  inline def apply(): PluginHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginHistory]
  }
  
  extension [Self <: PluginHistory](x: Self) {
    
    inline def setPluginHistory(value: StringDictionary[Any]): Self = StObject.set(x, "pluginHistory", value.asInstanceOf[js.Any])
    
    inline def setPluginHistoryUndefined: Self = StObject.set(x, "pluginHistory", js.undefined)
  }
}
