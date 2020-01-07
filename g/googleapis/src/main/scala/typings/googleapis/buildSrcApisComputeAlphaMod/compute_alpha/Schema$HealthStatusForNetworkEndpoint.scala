package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HealthStatusForNetworkEndpoint extends js.Object {
  /**
    * URL of the backend service associated with the health state of the
    * network endpoint.
    */
  var backendService: js.UndefOr[Schema$BackendServiceReference] = js.native
  /**
    * URL of the forwarding rule associated with the health state of the
    * network endpoint.
    */
  var forwardingRule: js.UndefOr[Schema$ForwardingRuleReference] = js.native
  /**
    * URL of the health check associated with the health state of the network
    * endpoint.
    */
  var healthCheck: js.UndefOr[Schema$HealthCheckReference] = js.native
  /**
    * Health state of the network endpoint determined based on the health
    * checks configured.
    */
  var healthState: js.UndefOr[String] = js.native
}

object Schema$HealthStatusForNetworkEndpoint {
  @scala.inline
  def apply(
    backendService: Schema$BackendServiceReference = null,
    forwardingRule: Schema$ForwardingRuleReference = null,
    healthCheck: Schema$HealthCheckReference = null,
    healthState: String = null
  ): Schema$HealthStatusForNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    if (forwardingRule != null) __obj.updateDynamic("forwardingRule")(forwardingRule.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (healthState != null) __obj.updateDynamic("healthState")(healthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HealthStatusForNetworkEndpoint]
  }
}

