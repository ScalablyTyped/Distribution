package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the high availability requirement state for the VPN connection
  * between this Cloud VPN gateway and a peer gateway.
  */
@js.native
trait SchemaVpnGatewayStatusHighAvailabilityRequirementState extends js.Object {
  
  /**
    * Indicates the high availability requirement state for the VPN connection.
    * Valid values are CONNECTION_REDUNDANCY_MET,
    * CONNECTION_REDUNDANCY_NOT_MET.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Indicates the reason why the VPN connection does not meet the high
    * availability redundancy criteria/requirement. Valid values is
    * INCOMPLETE_TUNNELS_COVERAGE.
    */
  var unsatisfiedReason: js.UndefOr[String] = js.native
}
object SchemaVpnGatewayStatusHighAvailabilityRequirementState {
  
  @scala.inline
  def apply(): SchemaVpnGatewayStatusHighAvailabilityRequirementState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusHighAvailabilityRequirementState]
  }
  
  @scala.inline
  implicit class SchemaVpnGatewayStatusHighAvailabilityRequirementStateOps[Self <: SchemaVpnGatewayStatusHighAvailabilityRequirementState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUnsatisfiedReason(value: String): Self = this.set("unsatisfiedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsatisfiedReason: Self = this.set("unsatisfiedReason", js.undefined)
  }
}
