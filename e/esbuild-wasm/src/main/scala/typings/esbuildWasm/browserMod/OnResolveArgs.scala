package typings.esbuildWasm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResolveArgs extends StObject {
  
  var importer: String
  
  var kind: ImportKind
  
  var namespace: String
  
  var path: String
  
  var pluginData: Any
  
  var resolveDir: String
}
object OnResolveArgs {
  
  inline def apply(
    importer: String,
    kind: ImportKind,
    namespace: String,
    path: String,
    pluginData: Any,
    resolveDir: String
  ): OnResolveArgs = {
    val __obj = js.Dynamic.literal(importer = importer.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pluginData = pluginData.asInstanceOf[js.Any], resolveDir = resolveDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResolveArgs]
  }
  
  extension [Self <: OnResolveArgs](x: Self) {
    
    inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ImportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setResolveDir(value: String): Self = StObject.set(x, "resolveDir", value.asInstanceOf[js.Any])
  }
}
