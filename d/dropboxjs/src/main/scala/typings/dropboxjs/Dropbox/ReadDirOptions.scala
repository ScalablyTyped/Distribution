package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadDirOptions extends StObject {
  
  var contentHash: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var httpCache: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Any] = js.undefined
  
  var removed: js.UndefOr[Boolean] = js.undefined
  
  var versionTag: js.UndefOr[String] = js.undefined
}
object ReadDirOptions {
  
  inline def apply(): ReadDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadDirOptions]
  }
  
  extension [Self <: ReadDirOptions](x: Self) {
    
    inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    inline def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    inline def setLimit(value: Any): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    
    inline def setVersionTagUndefined: Self = StObject.set(x, "versionTag", js.undefined)
  }
}
