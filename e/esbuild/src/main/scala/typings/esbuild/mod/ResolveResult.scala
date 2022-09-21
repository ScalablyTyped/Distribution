package typings.esbuild.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveResult extends StObject {
  
  var errors: js.Array[Message]
  
  var external: Boolean
  
  var namespace: String
  
  var path: String
  
  var pluginData: Any
  
  var sideEffects: Boolean
  
  var suffix: String
  
  var warnings: js.Array[Message]
}
object ResolveResult {
  
  inline def apply(
    errors: js.Array[Message],
    external: Boolean,
    namespace: String,
    path: String,
    pluginData: Any,
    sideEffects: Boolean,
    suffix: String,
    warnings: js.Array[Message]
  ): ResolveResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pluginData = pluginData.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveResult]
  }
  
  extension [Self <: ResolveResult](x: Self) {
    
    inline def setErrors(value: js.Array[Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
