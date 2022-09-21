package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeleteAlertsRequest] = js.undefined
}
object ParamsResourceAlertsBatchdelete {
  
  inline def apply(): ParamsResourceAlertsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsBatchdelete]
  }
  
  extension [Self <: ParamsResourceAlertsBatchdelete](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchDeleteAlertsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
