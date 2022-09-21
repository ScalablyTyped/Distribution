package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesWebappsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the web app in the form enterprises/{enterpriseId\}/webApps/{packageName\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWebApp] = js.undefined
  
  /**
    * The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesWebappsPatch {
  
  inline def apply(): ParamsResourceEnterprisesWebappsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesWebappsPatch]
  }
  
  extension [Self <: ParamsResourceEnterprisesWebappsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaWebApp): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
