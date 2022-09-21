package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesIssuecommand
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the device in the form enterprises/{enterpriseId\}/devices/{deviceId\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCommand] = js.undefined
}
object ParamsResourceEnterprisesDevicesIssuecommand {
  
  inline def apply(): ParamsResourceEnterprisesDevicesIssuecommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesIssuecommand]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesIssuecommand](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCommand): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
