package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateApiKeyResponse extends StObject {
  
  var updated: Boolean
}
object SecurityUpdateApiKeyResponse {
  
  inline def apply(updated: Boolean): SecurityUpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUpdateApiKeyResponse]
  }
  
  extension [Self <: SecurityUpdateApiKeyResponse](x: Self) {
    
    inline def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
