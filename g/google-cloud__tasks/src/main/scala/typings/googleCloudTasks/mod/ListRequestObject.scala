package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRequestObject
  extends StObject
     with ParentRequest {
  
  /**
    * `filter` can be used to specify a subset of queues. Any Queue field can be used as a filter and several operators as supported.
    * For example: <=, <, >=, >, !=, =, :. The filter syntax is the same as described in Stackdriver's Advanced Logs Filters.
    * Sample filter "state: PAUSED".
    * Note that using filters might cause fewer queues than the requested page_size to be returned.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of resources contained in the underlying API response. If page streaming is performed per-resource,
    * this parameter does not affect the return value. If page streaming is performed per-page, this determines the maximum number of resources in a page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object ListRequestObject {
  
  @scala.inline
  def apply(parent: String): ListRequestObject = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRequestObject]
  }
  
  @scala.inline
  implicit class ListRequestObjectMutableBuilder[Self <: ListRequestObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
