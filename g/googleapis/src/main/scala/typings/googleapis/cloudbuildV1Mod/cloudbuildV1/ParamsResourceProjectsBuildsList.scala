package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBuildsList
  extends StObject
     with StandardParameters {
  
  /**
    * The raw filter text to constrain the results.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Number of results to return in the list.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token for the next page of Builds. If unspecified, the first page of results is returned. If the token is rejected for any reason, INVALID_ARGUMENT will be thrown. In this case, the token should be discarded, and pagination should be restarted from the first page of results. See https://google.aip.dev/158 for more.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent of the collection of `Builds`. Format: `projects/{project\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBuildsList {
  
  inline def apply(): ParamsResourceProjectsBuildsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBuildsList]
  }
  
  extension [Self <: ParamsResourceProjectsBuildsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
