package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageQuery extends StObject {
  
  var count: js.UndefOr[integer] = js.undefined
  
  var failed: js.UndefOr[integer] = js.undefined
  
  var paging: js.UndefOr[integer] = js.undefined
  
  var total: js.UndefOr[integer] = js.undefined
}
object XpackUsageQuery {
  
  inline def apply(): XpackUsageQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsageQuery]
  }
  
  extension [Self <: XpackUsageQuery](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFailed(value: integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPaging(value: integer): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
