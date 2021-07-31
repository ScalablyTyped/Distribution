package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryOptions extends StObject {
  
  var httpCache: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object HistoryOptions {
  
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  @scala.inline
  implicit class HistoryOptionsMutableBuilder[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
