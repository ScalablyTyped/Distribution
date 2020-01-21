package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(state: String = null, unsatisfiedReason: String = null): SchemaVpnGatewayStatusHighAvailabilityRequirementState = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (unsatisfiedReason != null) __obj.updateDynamic("unsatisfiedReason")(unsatisfiedReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewayStatusHighAvailabilityRequirementState]
  }
}

