package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePointInTimeResponse extends StObject {
  
  var num_freed: integer
  
  var succeeded: Boolean
}
object ClosePointInTimeResponse {
  
  inline def apply(num_freed: integer, succeeded: Boolean): ClosePointInTimeResponse = {
    val __obj = js.Dynamic.literal(num_freed = num_freed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosePointInTimeResponse]
  }
  
  extension [Self <: ClosePointInTimeResponse](x: Self) {
    
    inline def setNum_freed(value: integer): Self = StObject.set(x, "num_freed", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
