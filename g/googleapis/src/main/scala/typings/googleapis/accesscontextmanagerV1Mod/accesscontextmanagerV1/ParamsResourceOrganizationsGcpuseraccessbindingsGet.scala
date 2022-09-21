package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGcpuseraccessbindingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Example: "organizations/256/gcpUserAccessBindings/b3-BhcX_Ud5N"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGcpuseraccessbindingsGet {
  
  inline def apply(): ParamsResourceOrganizationsGcpuseraccessbindingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGcpuseraccessbindingsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsGcpuseraccessbindingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
