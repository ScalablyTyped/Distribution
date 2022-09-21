package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsUpdatesecuritysettings
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource name of the security settings. Shall be of the form `groups/{group_id\}/securitySettings`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecuritySettings] = js.undefined
  
  /**
    * Required. The fully-qualified names of fields to update. May only contain the following field: `member_restriction.query`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsUpdatesecuritysettings {
  
  inline def apply(): ParamsResourceGroupsUpdatesecuritysettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsUpdatesecuritysettings]
  }
  
  extension [Self <: ParamsResourceGroupsUpdatesecuritysettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSecuritySettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
