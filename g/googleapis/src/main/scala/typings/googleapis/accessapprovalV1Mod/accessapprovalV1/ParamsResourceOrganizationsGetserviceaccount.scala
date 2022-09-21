package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetserviceaccount
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the AccessApprovalServiceAccount to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetserviceaccount {
  
  inline def apply(): ParamsResourceOrganizationsGetserviceaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetserviceaccount]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetserviceaccount](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
