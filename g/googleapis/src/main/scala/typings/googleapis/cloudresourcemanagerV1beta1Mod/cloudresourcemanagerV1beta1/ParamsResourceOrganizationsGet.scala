package typings.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the Organization to fetch. This is the organization's relative path in the API, formatted as "organizations/[organizationId]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the Organization resource to fetch. This field is deprecated and will be removed in v1. Use name instead.
    */
  var organizationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGet {
  
  inline def apply(): ParamsResourceOrganizationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
