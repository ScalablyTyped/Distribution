package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesAccesslevelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the Access Level. Format: `accessPolicies/{policy_id\}/accessLevels/{access_level_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesAccesslevelsDelete {
  
  inline def apply(): ParamsResourceAccesspoliciesAccesslevelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesAccesslevelsDelete]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesAccesslevelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
