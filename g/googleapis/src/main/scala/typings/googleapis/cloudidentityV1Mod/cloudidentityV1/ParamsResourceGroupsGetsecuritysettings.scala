package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsGetsecuritysettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The security settings to retrieve. Format: `groups/{group_id\}/securitySettings`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Field-level read mask of which fields to return. "*" returns all fields. If not specified, all fields will be returned. May only contain the following field: `member_restriction`.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsGetsecuritysettings {
  
  inline def apply(): ParamsResourceGroupsGetsecuritysettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsGetsecuritysettings]
  }
  
  extension [Self <: ParamsResourceGroupsGetsecuritysettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
