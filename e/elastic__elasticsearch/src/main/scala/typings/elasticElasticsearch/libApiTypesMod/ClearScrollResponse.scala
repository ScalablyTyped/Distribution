package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearScrollResponse extends StObject {
  
  var num_freed: integer
  
  var succeeded: Boolean
}
object ClearScrollResponse {
  
  inline def apply(num_freed: integer, succeeded: Boolean): ClearScrollResponse = {
    val __obj = js.Dynamic.literal(num_freed = num_freed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearScrollResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearScrollResponse] (val x: Self) extends AnyVal {
    
    inline def setNum_freed(value: integer): Self = StObject.set(x, "num_freed", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
