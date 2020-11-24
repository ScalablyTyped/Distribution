package typings.documentdb.mod

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
  implicit class FeedOptionsOps[Self <: FeedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuation(value: String): Self = this.set("continuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuation: Self = this.set("continuation", js.undefined)
    
    @scala.inline
    def setEnableScanInQuery(value: Boolean): Self = this.set("enableScanInQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScanInQuery: Self = this.set("enableScanInQuery", js.undefined)
    
    @scala.inline
    def setMaxItemCount(value: Double): Self = this.set("maxItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemCount: Self = this.set("maxItemCount", js.undefined)
  }
}
