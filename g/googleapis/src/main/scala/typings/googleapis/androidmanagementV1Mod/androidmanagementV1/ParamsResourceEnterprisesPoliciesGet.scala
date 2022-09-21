package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesPoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the policy in the form enterprises/{enterpriseId\}/policies/{policyId\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesPoliciesGet {
  
  inline def apply(): ParamsResourceEnterprisesPoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPoliciesGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesPoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
