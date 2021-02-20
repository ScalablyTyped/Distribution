package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindByNameOptions extends StObject {
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var httpCache: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var removed: js.UndefOr[Boolean] = js.native
}
object FindByNameOptions {
  
  @scala.inline
  def apply(): FindByNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindByNameOptions]
  }
  
  @scala.inline
  implicit class FindByNameOptionsMutableBuilder[Self <: FindByNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
  }
}
