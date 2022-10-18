package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptContextResponse extends StObject {
  
  var contexts: js.Array[GetScriptContextContext]
}
object GetScriptContextResponse {
  
  inline def apply(contexts: js.Array[GetScriptContextContext]): GetScriptContextResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptContextResponse]
  }
  
  extension [Self <: GetScriptContextResponse](x: Self) {
    
    inline def setContexts(value: js.Array[GetScriptContextContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: GetScriptContextContext*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
