package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedRoles
  extends StObject
     with Generic {
  
  var name: String | js.Array[String]
}
object SecurityClearCachedRoles {
  
  inline def apply(name: String | js.Array[String]): SecurityClearCachedRoles = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRoles]
  }
  
  extension [Self <: SecurityClearCachedRoles](x: Self) {
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
