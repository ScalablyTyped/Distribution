package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPluginFile extends StObject {
  
  var isPluginFile: Boolean
  
  var plugin: Any
  
  var pluginFile: String
  
  var pluginReference: String
}
object IsPluginFile {
  
  inline def apply(isPluginFile: Boolean, plugin: Any, pluginFile: String, pluginReference: String): IsPluginFile = {
    val __obj = js.Dynamic.literal(isPluginFile = isPluginFile.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginFile = pluginFile.asInstanceOf[js.Any], pluginReference = pluginReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPluginFile]
  }
  
  extension [Self <: IsPluginFile](x: Self) {
    
    inline def setIsPluginFile(value: Boolean): Self = StObject.set(x, "isPluginFile", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginFile(value: String): Self = StObject.set(x, "pluginFile", value.asInstanceOf[js.Any])
    
    inline def setPluginReference(value: String): Self = StObject.set(x, "pluginReference", value.asInstanceOf[js.Any])
  }
}
