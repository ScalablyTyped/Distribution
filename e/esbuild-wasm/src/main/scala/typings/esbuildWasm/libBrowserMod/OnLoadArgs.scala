package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLoadArgs extends StObject {
  
  var namespace: String
  
  var path: String
  
  var pluginData: Any
  
  var suffix: String
}
object OnLoadArgs {
  
  inline def apply(namespace: String, path: String, pluginData: Any, suffix: String): OnLoadArgs = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pluginData = pluginData.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnLoadArgs] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
