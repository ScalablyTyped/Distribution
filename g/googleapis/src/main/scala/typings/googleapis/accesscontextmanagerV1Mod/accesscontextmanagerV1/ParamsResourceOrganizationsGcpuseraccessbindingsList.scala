package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGcpuseraccessbindingsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Maximum number of items to return. The server may return fewer items. If left blank, the server may return any number of items.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If left blank, returns the first page. To enumerate all items, use the next_page_token from your previous list operation.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Example: "organizations/256"
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGcpuseraccessbindingsList {
  
  inline def apply(): ParamsResourceOrganizationsGcpuseraccessbindingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGcpuseraccessbindingsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsGcpuseraccessbindingsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
