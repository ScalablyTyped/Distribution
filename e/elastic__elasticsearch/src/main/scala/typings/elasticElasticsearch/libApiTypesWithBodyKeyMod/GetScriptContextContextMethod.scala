package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptContextContextMethod extends StObject {
  
  var name: Name
  
  var params: js.Array[GetScriptContextContextMethodParam]
  
  var return_type: String
}
object GetScriptContextContextMethod {
  
  inline def apply(name: Name, params: js.Array[GetScriptContextContextMethodParam], return_type: String): GetScriptContextContextMethod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], return_type = return_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptContextContextMethod]
  }
  
  extension [Self <: GetScriptContextContextMethod](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[GetScriptContextContextMethodParam]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: GetScriptContextContextMethodParam*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturn_type(value: String): Self = StObject.set(x, "return_type", value.asInstanceOf[js.Any])
  }
}
