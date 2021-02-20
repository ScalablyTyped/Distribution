package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedOptions extends RequestOptions {
  
  /** Opaque token for continuing the enumeration. */
  var continuation: js.UndefOr[String] = js.native
  
  /** Allow scan on the queries which couldn't be served as indexing was opted out on the requested paths. */
  var enableScanInQuery: js.UndefOr[Boolean] = js.native
  
  /** Max number of items to be returned in the enumeration operation. */
  var maxItemCount: js.UndefOr[Double] = js.native
}
object FeedOptions {
  
  @scala.inline
  def apply(): FeedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedOptions]
  }
  
  @scala.inline
  implicit class FeedOptionsMutableBuilder[Self <: FeedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuation(value: String): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationUndefined: Self = StObject.set(x, "continuation", js.undefined)
    
    @scala.inline
    def setEnableScanInQuery(value: Boolean): Self = StObject.set(x, "enableScanInQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableScanInQueryUndefined: Self = StObject.set(x, "enableScanInQuery", js.undefined)
    
    @scala.inline
    def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemCountUndefined: Self = StObject.set(x, "maxItemCount", js.undefined)
  }
}
