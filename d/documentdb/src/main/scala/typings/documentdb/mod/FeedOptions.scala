package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedOptions
  extends StObject
     with RequestOptions {
  
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.undefined
  
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[Boolean] = js.undefined
  
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[Double] = js.undefined
}
object FeedOptions {
  
  inline def apply(): FeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedOptions]
  }
  
  extension [Self <: FeedOptions](x: Self) {
    
    inline def setContinuation(value: String): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
    
    inline def setContinuationUndefined: Self = StObject.set(x, "continuation", js.undefined)
    
    inline def setEnableScanInQuery(value: Boolean): Self = StObject.set(x, "enableScanInQuery", value.asInstanceOf[js.Any])
    
    inline def setEnableScanInQueryUndefined: Self = StObject.set(x, "enableScanInQuery", js.undefined)
    
    inline def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCountUndefined: Self = StObject.set(x, "maxItemCount", js.undefined)
  }
}
