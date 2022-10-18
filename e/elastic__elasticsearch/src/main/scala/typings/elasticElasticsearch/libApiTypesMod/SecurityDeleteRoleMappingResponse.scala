package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteRoleMappingResponse extends StObject {
  
  var found: Boolean
}
object SecurityDeleteRoleMappingResponse {
  
  inline def apply(found: Boolean): SecurityDeleteRoleMappingResponse = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteRoleMappingResponse]
  }
  
  extension [Self <: SecurityDeleteRoleMappingResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
