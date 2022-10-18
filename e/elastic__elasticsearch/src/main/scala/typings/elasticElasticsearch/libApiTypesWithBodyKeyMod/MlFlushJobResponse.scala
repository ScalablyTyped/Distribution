package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFlushJobResponse extends StObject {
  
  var flushed: Boolean
  
  var last_finalized_bucket_end: js.UndefOr[integer] = js.undefined
}
object MlFlushJobResponse {
  
  inline def apply(flushed: Boolean): MlFlushJobResponse = {
    val __obj = js.Dynamic.literal(flushed = flushed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFlushJobResponse]
  }
  
  extension [Self <: MlFlushJobResponse](x: Self) {
    
    inline def setFlushed(value: Boolean): Self = StObject.set(x, "flushed", value.asInstanceOf[js.Any])
    
    inline def setLast_finalized_bucket_end(value: integer): Self = StObject.set(x, "last_finalized_bucket_end", value.asInstanceOf[js.Any])
    
    inline def setLast_finalized_bucket_endUndefined: Self = StObject.set(x, "last_finalized_bucket_end", js.undefined)
  }
}
