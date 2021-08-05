package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindByNameOptions extends StObject {
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var httpCache: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var removed: js.UndefOr[Boolean] = js.undefined
}
object FindByNameOptions {
  
  inline def apply(): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByNameOptions]
  }
  
  extension [Self <: FindByNameOptions](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    inline def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
  }
}
