package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsBatchundelete
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUndeleteAlertsRequest] = js.undefined
}
object ParamsResourceAlertsBatchundelete {
  
  inline def apply(): ParamsResourceAlertsBatchundelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsBatchundelete]
  }
  
  extension [Self <: ParamsResourceAlertsBatchundelete](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchUndeleteAlertsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
