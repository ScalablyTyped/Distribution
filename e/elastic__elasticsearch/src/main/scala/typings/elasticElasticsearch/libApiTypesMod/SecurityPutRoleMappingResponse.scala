package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRoleMappingResponse extends StObject {
  
  var created: js.UndefOr[Boolean] = js.undefined
  
  var role_mapping: SecurityCreatedStatus
}
object SecurityPutRoleMappingResponse {
  
  inline def apply(role_mapping: SecurityCreatedStatus): SecurityPutRoleMappingResponse = {
    val __obj = js.Dynamic.literal(role_mapping = role_mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleMappingResponse]
  }
  
  extension [Self <: SecurityPutRoleMappingResponse](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setRole_mapping(value: SecurityCreatedStatus): Self = StObject.set(x, "role_mapping", value.asInstanceOf[js.Any])
  }
}
