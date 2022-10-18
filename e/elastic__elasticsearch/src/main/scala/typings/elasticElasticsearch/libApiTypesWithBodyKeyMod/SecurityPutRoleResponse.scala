package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRoleResponse extends StObject {
  
  var role: SecurityCreatedStatus
}
object SecurityPutRoleResponse {
  
  inline def apply(role: SecurityCreatedStatus): SecurityPutRoleResponse = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleResponse]
  }
  
  extension [Self <: SecurityPutRoleResponse](x: Self) {
    
    inline def setRole(value: SecurityCreatedStatus): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
