package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUndeleteAlertsResponse extends StObject {
  
  /**
    * The status details for each failed alert_id.
    */
  var failedAlertStatus: js.UndefOr[StringDictionary[SchemaStatus] | Null] = js.undefined
  
  /**
    * The successful list of alert IDs.
    */
  var successAlertIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchUndeleteAlertsResponse {
  
  inline def apply(): SchemaBatchUndeleteAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUndeleteAlertsResponse]
  }
  
  extension [Self <: SchemaBatchUndeleteAlertsResponse](x: Self) {
    
    inline def setFailedAlertStatus(value: StringDictionary[SchemaStatus]): Self = StObject.set(x, "failedAlertStatus", value.asInstanceOf[js.Any])
    
    inline def setFailedAlertStatusNull: Self = StObject.set(x, "failedAlertStatus", null)
    
    inline def setFailedAlertStatusUndefined: Self = StObject.set(x, "failedAlertStatus", js.undefined)
    
    inline def setSuccessAlertIds(value: js.Array[String]): Self = StObject.set(x, "successAlertIds", value.asInstanceOf[js.Any])
    
    inline def setSuccessAlertIdsNull: Self = StObject.set(x, "successAlertIds", null)
    
    inline def setSuccessAlertIdsUndefined: Self = StObject.set(x, "successAlertIds", js.undefined)
    
    inline def setSuccessAlertIdsVarargs(value: String*): Self = StObject.set(x, "successAlertIds", js.Array(value*))
  }
}
