package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The unique identifier of the Google Workspace organization account of the customer the alerts are associated with. Inferred from the caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A query string for filtering alert results. For more details, see [Query filters](https://developers.google.com/admin-sdk/alertcenter/guides/query-filters) and [Supported query filter fields](https://developers.google.com/admin-sdk/alertcenter/reference/filter-fields#alerts.list).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The sort order of the list results. If not specified results may be returned in arbitrary order. You can sort the results in descending order based on the creation timestamp using `order_by="create_time desc"`. Currently, supported sorting are `create_time asc`, `create_time desc`, `update_time desc`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The requested page size. Server may return fewer items than requested. If unspecified, server picks an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A token identifying a page of results the server should return. If empty, a new iteration is started. To continue an iteration, pass in the value from the previous ListAlertsResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAlertsList {
  
  inline def apply(): ParamsResourceAlertsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsList]
  }
  
  extension [Self <: ParamsResourceAlertsList](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
