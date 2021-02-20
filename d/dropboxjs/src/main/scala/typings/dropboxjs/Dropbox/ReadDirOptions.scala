package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadDirOptions extends StObject {
  
  var contentHash: js.UndefOr[String] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var httpCache: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[js.Any] = js.native
  
  var removed: js.UndefOr[Boolean] = js.native
  
  var versionTag: js.UndefOr[String] = js.native
}
object ReadDirOptions {
  
  @scala.inline
  def apply(): ReadDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadDirOptions]
  }
  
  @scala.inline
  implicit class ReadDirOptionsMutableBuilder[Self <: ReadDirOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    @scala.inline
    def setLimit(value: js.Any): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTagUndefined: Self = StObject.set(x, "versionTag", js.undefined)
  }
}
