package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The initial configuration option for the `Group`.
    */
  var initialGroupConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGroup] = js.undefined
}
object ParamsResourceGroupsCreate {
  
  inline def apply(): ParamsResourceGroupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsCreate]
  }
  
  extension [Self <: ParamsResourceGroupsCreate](x: Self) {
    
    inline def setInitialGroupConfig(value: String): Self = StObject.set(x, "initialGroupConfig", value.asInstanceOf[js.Any])
    
    inline def setInitialGroupConfigUndefined: Self = StObject.set(x, "initialGroupConfig", js.undefined)
    
    inline def setRequestBody(value: SchemaGroup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
