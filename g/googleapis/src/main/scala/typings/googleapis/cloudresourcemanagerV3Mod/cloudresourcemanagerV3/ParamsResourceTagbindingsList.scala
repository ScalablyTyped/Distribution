package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagbindingsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum number of TagBindings to return in the response. The server allows a maximum of 300 TagBindings to return. If unspecified, the server will use 100 as the default. Currently this api returns unpaginated response and `page_size` is ignored.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A pagination token returned from a previous call to `ListTagBindings` that indicates where this listing should continue from. Currently this api returns unpaginated response and `page_token` is ignored.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The full resource name of a resource for which you want to list existing TagBindings. E.g. "//cloudresourcemanager.googleapis.com/projects/123"
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceTagbindingsList {
  
  inline def apply(): ParamsResourceTagbindingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagbindingsList]
  }
  
  extension [Self <: ParamsResourceTagbindingsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
