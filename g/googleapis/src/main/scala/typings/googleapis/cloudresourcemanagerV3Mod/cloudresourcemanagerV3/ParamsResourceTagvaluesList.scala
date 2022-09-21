package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum number of TagValues to return in the response. The server allows a maximum of 300 TagValues to return. If unspecified, the server will use 100 as the default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A pagination token returned from a previous call to `ListTagValues` that indicates where this listing should continue from.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for TagKey, parent of the TagValues to be listed, in the format `tagKeys/123`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceTagvaluesList {
  
  inline def apply(): ParamsResourceTagvaluesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesList]
  }
  
  extension [Self <: ParamsResourceTagvaluesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
