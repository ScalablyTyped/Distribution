package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesPoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the policy in the form enterprises/{enterpriseId\}/policies/{policyId\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesPoliciesDelete {
  
  inline def apply(): ParamsResourceEnterprisesPoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPoliciesDelete]
  }
  
  extension [Self <: ParamsResourceEnterprisesPoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
