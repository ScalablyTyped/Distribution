package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGcpuseraccessbindingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example: "organizations/256"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGcpUserAccessBinding] = js.undefined
}
object ParamsResourceOrganizationsGcpuseraccessbindingsCreate {
  
  inline def apply(): ParamsResourceOrganizationsGcpuseraccessbindingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGcpuseraccessbindingsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsGcpuseraccessbindingsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGcpUserAccessBinding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
