package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTransferconfigsRunsList
  extends StObject
     with StandardParameters {
  
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token, which can be used to request a specific page of `ListTransferRunsRequest` list results. For multiple-page results, `ListTransferRunsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of transfer configuration for which transfer runs should be retrieved. Format of transfer configuration resource name is: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how run attempts are to be pulled.
    */
  var runAttempt: js.UndefOr[String] = js.undefined
  
  /**
    * When specified, only transfer runs with requested states are returned.
    */
  var states: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceProjectsLocationsTransferconfigsRunsList {
  
  inline def apply(): ParamsResourceProjectsLocationsTransferconfigsRunsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTransferconfigsRunsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTransferconfigsRunsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRunAttempt(value: String): Self = StObject.set(x, "runAttempt", value.asInstanceOf[js.Any])
    
    inline def setRunAttemptUndefined: Self = StObject.set(x, "runAttempt", js.undefined)
    
    inline def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
