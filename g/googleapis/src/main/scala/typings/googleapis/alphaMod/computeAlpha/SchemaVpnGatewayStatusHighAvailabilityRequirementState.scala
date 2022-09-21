package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayStatusHighAvailabilityRequirementState extends StObject {
  
  /**
    * Indicates the high availability requirement state for the VPN connection. Valid values are CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the reason why the VPN connection does not meet the high availability redundancy criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
    */
  var unsatisfiedReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpnGatewayStatusHighAvailabilityRequirementState {
  
  inline def apply(): SchemaVpnGatewayStatusHighAvailabilityRequirementState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusHighAvailabilityRequirementState]
  }
  
  extension [Self <: SchemaVpnGatewayStatusHighAvailabilityRequirementState](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUnsatisfiedReason(value: String): Self = StObject.set(x, "unsatisfiedReason", value.asInstanceOf[js.Any])
    
    inline def setUnsatisfiedReasonNull: Self = StObject.set(x, "unsatisfiedReason", null)
    
    inline def setUnsatisfiedReasonUndefined: Self = StObject.set(x, "unsatisfiedReason", js.undefined)
  }
}
