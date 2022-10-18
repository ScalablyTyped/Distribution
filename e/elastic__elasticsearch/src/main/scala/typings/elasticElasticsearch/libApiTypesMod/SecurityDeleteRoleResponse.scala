package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteRoleResponse extends StObject {
  
  var found: Boolean
}
object SecurityDeleteRoleResponse {
  
  inline def apply(found: Boolean): SecurityDeleteRoleResponse = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteRoleResponse]
  }
  
  extension [Self <: SecurityDeleteRoleResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
