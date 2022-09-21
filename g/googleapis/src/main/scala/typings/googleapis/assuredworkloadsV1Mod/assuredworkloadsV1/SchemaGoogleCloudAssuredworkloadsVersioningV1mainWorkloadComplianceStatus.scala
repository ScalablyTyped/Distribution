package typings.googleapis.assuredworkloadsV1Mod.assuredworkloadsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus extends StObject {
  
  /**
    * Count of active Violations which are acknowledged in the Workload.
    */
  var acknowledgedViolationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Count of active Violations which haven't been acknowledged.
    */
  var activeViolationCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus {
  
  inline def apply(): SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus]
  }
  
  extension [Self <: SchemaGoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus](x: Self) {
    
    inline def setAcknowledgedViolationCount(value: Double): Self = StObject.set(x, "acknowledgedViolationCount", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedViolationCountNull: Self = StObject.set(x, "acknowledgedViolationCount", null)
    
    inline def setAcknowledgedViolationCountUndefined: Self = StObject.set(x, "acknowledgedViolationCount", js.undefined)
    
    inline def setActiveViolationCount(value: Double): Self = StObject.set(x, "activeViolationCount", value.asInstanceOf[js.Any])
    
    inline def setActiveViolationCountNull: Self = StObject.set(x, "activeViolationCount", null)
    
    inline def setActiveViolationCountUndefined: Self = StObject.set(x, "activeViolationCount", js.undefined)
  }
}
