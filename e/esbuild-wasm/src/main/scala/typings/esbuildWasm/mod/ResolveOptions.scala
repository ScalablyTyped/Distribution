package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptions extends StObject {
  
  var importer: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[ImportKind] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var pluginData: js.UndefOr[Any] = js.undefined
  
  var pluginName: js.UndefOr[String] = js.undefined
  
  var resolveDir: js.UndefOr[String] = js.undefined
}
object ResolveOptions {
  
  inline def apply(): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions]
  }
  
  extension [Self <: ResolveOptions](x: Self) {
    
    inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setKind(value: ImportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
    
    inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    inline def setResolveDir(value: String): Self = StObject.set(x, "resolveDir", value.asInstanceOf[js.Any])
    
    inline def setResolveDirUndefined: Self = StObject.set(x, "resolveDir", js.undefined)
  }
}
