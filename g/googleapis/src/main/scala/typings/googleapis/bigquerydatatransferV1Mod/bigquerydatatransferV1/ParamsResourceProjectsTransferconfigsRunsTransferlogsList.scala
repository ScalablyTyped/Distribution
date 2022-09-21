package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTransferconfigsRunsTransferlogsList
  extends StObject
     with StandardParameters {
  
  /**
    * Message types to return. If not populated - INFO, WARNING and ERROR messages are returned.
    */
  var messageTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token, which can be used to request a specific page of `ListTransferLogsRequest` list results. For multiple-page results, `ListTransferLogsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Transfer run name in the form: `projects/{project_id\}/transferConfigs/{config_id\}/runs/{run_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}/runs/{run_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTransferconfigsRunsTransferlogsList {
  
  inline def apply(): ParamsResourceProjectsTransferconfigsRunsTransferlogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTransferconfigsRunsTransferlogsList]
  }
  
  extension [Self <: ParamsResourceProjectsTransferconfigsRunsTransferlogsList](x: Self) {
    
    inline def setMessageTypes(value: js.Array[String]): Self = StObject.set(x, "messageTypes", value.asInstanceOf[js.Any])
    
    inline def setMessageTypesUndefined: Self = StObject.set(x, "messageTypes", js.undefined)
    
    inline def setMessageTypesVarargs(value: String*): Self = StObject.set(x, "messageTypes", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
