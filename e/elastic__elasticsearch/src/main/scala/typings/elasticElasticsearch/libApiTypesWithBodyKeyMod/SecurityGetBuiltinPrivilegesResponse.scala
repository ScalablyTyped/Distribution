package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetBuiltinPrivilegesResponse extends StObject {
  
  var cluster: js.Array[String]
  
  var index: Indices
}
object SecurityGetBuiltinPrivilegesResponse {
  
  inline def apply(cluster: js.Array[String], index: Indices): SecurityGetBuiltinPrivilegesResponse = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetBuiltinPrivilegesResponse]
  }
  
  extension [Self <: SecurityGetBuiltinPrivilegesResponse](x: Self) {
    
    inline def setCluster(value: js.Array[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterVarargs(value: String*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
