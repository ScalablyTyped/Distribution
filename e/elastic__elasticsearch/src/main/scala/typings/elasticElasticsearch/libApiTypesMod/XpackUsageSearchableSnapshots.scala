package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSearchableSnapshots
  extends StObject
     with XpackUsageBase {
  
  var full_copy_indices_count: js.UndefOr[integer] = js.undefined
  
  var indices_count: integer
  
  var shared_cache_indices_count: js.UndefOr[integer] = js.undefined
}
object XpackUsageSearchableSnapshots {
  
  inline def apply(available: Boolean, enabled: Boolean, indices_count: integer): XpackUsageSearchableSnapshots = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], indices_count = indices_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSearchableSnapshots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSearchableSnapshots] (val x: Self) extends AnyVal {
    
    inline def setFull_copy_indices_count(value: integer): Self = StObject.set(x, "full_copy_indices_count", value.asInstanceOf[js.Any])
    
    inline def setFull_copy_indices_countUndefined: Self = StObject.set(x, "full_copy_indices_count", js.undefined)
    
    inline def setIndices_count(value: integer): Self = StObject.set(x, "indices_count", value.asInstanceOf[js.Any])
    
    inline def setShared_cache_indices_count(value: integer): Self = StObject.set(x, "shared_cache_indices_count", value.asInstanceOf[js.Any])
    
    inline def setShared_cache_indices_countUndefined: Self = StObject.set(x, "shared_cache_indices_count", js.undefined)
  }
}
