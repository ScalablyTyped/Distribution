package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesEnrollmenttokensCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the enterprise in the form enterprises/{enterpriseId\}.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnrollmentToken] = js.undefined
}
object ParamsResourceEnterprisesEnrollmenttokensCreate {
  
  inline def apply(): ParamsResourceEnterprisesEnrollmenttokensCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesEnrollmenttokensCreate]
  }
  
  extension [Self <: ParamsResourceEnterprisesEnrollmenttokensCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaEnrollmentToken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
