package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsApprovalrequestsList
  extends StObject
     with StandardParameters {
  
  /**
    * A filter on the type of approval requests to retrieve. Must be one of the following values: * [not set]: Requests that are pending or have active approvals. * ALL: All requests. * PENDING: Only pending requests. * ACTIVE: Only active (i.e. currently approved) requests. * DISMISSED: Only requests that have been dismissed, or requests that are not approved and past expiration. * EXPIRED: Only requests that have been approved, and the approval has expired. * HISTORY: Active, dismissed and expired requests.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying the page of results to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource. This may be "projects/{project\}", "folders/{folder\}", or "organizations/{organization\}".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsApprovalrequestsList {
  
  inline def apply(): ParamsResourceProjectsApprovalrequestsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsApprovalrequestsList]
  }
  
  extension [Self <: ParamsResourceProjectsApprovalrequestsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
