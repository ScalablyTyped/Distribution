package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProduceCompilationCacheRequest extends StObject {
  
  var scripts: js.Array[CompilationCacheParams]
}
object ProduceCompilationCacheRequest {
  
  inline def apply(scripts: js.Array[CompilationCacheParams]): ProduceCompilationCacheRequest = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProduceCompilationCacheRequest]
  }
  
  extension [Self <: ProduceCompilationCacheRequest](x: Self) {
    
    inline def setScripts(value: js.Array[CompilationCacheParams]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: CompilationCacheParams*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
