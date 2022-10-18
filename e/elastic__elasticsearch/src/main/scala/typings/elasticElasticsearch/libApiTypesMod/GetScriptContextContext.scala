package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptContextContext extends StObject {
  
  var methods: js.Array[GetScriptContextContextMethod]
  
  var name: Name
}
object GetScriptContextContext {
  
  inline def apply(methods: js.Array[GetScriptContextContextMethod], name: Name): GetScriptContextContext = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptContextContext]
  }
  
  extension [Self <: GetScriptContextContext](x: Self) {
    
    inline def setMethods(value: js.Array[GetScriptContextContextMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: GetScriptContextContextMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
