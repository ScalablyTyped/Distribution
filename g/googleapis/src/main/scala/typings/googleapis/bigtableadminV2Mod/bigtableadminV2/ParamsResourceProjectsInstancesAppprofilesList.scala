package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesAppprofilesList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of results per page. A page_size of zero lets the server choose the number of items to return. A page_size which is strictly positive will return at most that many items. A negative page_size will cause an error. Following the first request, subsequent paginated calls are not required to pass a page_size. If a page_size is set in subsequent calls, it must match the page_size given in the first request.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of `next_page_token` returned by a previous call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique name of the instance for which a list of app profiles is requested. Values are of the form `projects/{project\}/instances/{instance\}`. Use `{instance\} = '-'` to list AppProfiles for all Instances in a project, e.g., `projects/myproject/instances/-`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesAppprofilesList {
  
  inline def apply(): ParamsResourceProjectsInstancesAppprofilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesAppprofilesList]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesAppprofilesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
