package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteUserResponse extends StObject {
  
  var found: Boolean
}
object SecurityDeleteUserResponse {
  
  inline def apply(found: Boolean): SecurityDeleteUserResponse = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteUserResponse]
  }
  
  extension [Self <: SecurityDeleteUserResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
  }
}
