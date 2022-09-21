package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsMembershipsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership` to retrieve. Must be of the form `groups/{group\}/memberships/{membership\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsMembershipsGet {
  
  inline def apply(): ParamsResourceGroupsMembershipsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsMembershipsGet]
  }
  
  extension [Self <: ParamsResourceGroupsMembershipsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
