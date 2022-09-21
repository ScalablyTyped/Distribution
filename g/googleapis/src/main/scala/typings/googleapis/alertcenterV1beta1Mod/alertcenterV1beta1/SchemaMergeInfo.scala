package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMergeInfo extends StObject {
  
  /**
    * Optional. New alert ID. Reference the [google.apps.alertcenter.Alert] with this ID for the current state.
    */
  var newAlertId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new tracking ID from the parent incident.
    */
  var newIncidentTrackingId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMergeInfo {
  
  inline def apply(): SchemaMergeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeInfo]
  }
  
  extension [Self <: SchemaMergeInfo](x: Self) {
    
    inline def setNewAlertId(value: String): Self = StObject.set(x, "newAlertId", value.asInstanceOf[js.Any])
    
    inline def setNewAlertIdNull: Self = StObject.set(x, "newAlertId", null)
    
    inline def setNewAlertIdUndefined: Self = StObject.set(x, "newAlertId", js.undefined)
    
    inline def setNewIncidentTrackingId(value: String): Self = StObject.set(x, "newIncidentTrackingId", value.asInstanceOf[js.Any])
    
    inline def setNewIncidentTrackingIdNull: Self = StObject.set(x, "newIncidentTrackingId", null)
    
    inline def setNewIncidentTrackingIdUndefined: Self = StObject.set(x, "newIncidentTrackingId", js.undefined)
  }
}
