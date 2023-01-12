package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a read feed or query operation. */
trait IFeedOptions extends StObject {
  
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.undefined
  
  /** Allow order by with low precision (only for queryDocuments(), sortBy() and sortByDescending()) */
  var enableLowPrecisionOrderBy: js.UndefOr[Boolean] = js.undefined
  
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths (only for queryDocuments() and queryAttachments()) */
  var enableScan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max number of items to be returned in the enumeration operation.
    * Value is 100 by default
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object IFeedOptions {
  
  inline def apply(): IFeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFeedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFeedOptions] (val x: Self) extends AnyVal {
    
    inline def setContinuation(value: String): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
    
    inline def setContinuationUndefined: Self = StObject.set(x, "continuation", js.undefined)
    
    inline def setEnableLowPrecisionOrderBy(value: Boolean): Self = StObject.set(x, "enableLowPrecisionOrderBy", value.asInstanceOf[js.Any])
    
    inline def setEnableLowPrecisionOrderByUndefined: Self = StObject.set(x, "enableLowPrecisionOrderBy", js.undefined)
    
    inline def setEnableScan(value: Boolean): Self = StObject.set(x, "enableScan", value.asInstanceOf[js.Any])
    
    inline def setEnableScanUndefined: Self = StObject.set(x, "enableScan", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
