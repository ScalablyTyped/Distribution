package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryOptions extends StObject {
  
  var httpCache: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object HistoryOptions {
  
  inline def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  extension [Self <: HistoryOptions](x: Self) {
    
    inline def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    inline def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
