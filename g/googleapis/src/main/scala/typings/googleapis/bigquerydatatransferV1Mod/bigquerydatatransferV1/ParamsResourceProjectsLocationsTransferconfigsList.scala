package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTransferconfigsList
  extends StObject
     with StandardParameters {
  
  /**
    * When specified, only configurations of requested data sources are returned.
    */
  var dataSourceIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token, which can be used to request a specific page of `ListTransfersRequest` list results. For multiple-page results, `ListTransfersResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The BigQuery project id for which transfer configs should be returned: `projects/{project_id\}` or `projects/{project_id\}/locations/{location_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTransferconfigsList {
  
  inline def apply(): ParamsResourceProjectsLocationsTransferconfigsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTransferconfigsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTransferconfigsList](x: Self) {
    
    inline def setDataSourceIds(value: js.Array[String]): Self = StObject.set(x, "dataSourceIds", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdsUndefined: Self = StObject.set(x, "dataSourceIds", js.undefined)
    
    inline def setDataSourceIdsVarargs(value: String*): Self = StObject.set(x, "dataSourceIds", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
