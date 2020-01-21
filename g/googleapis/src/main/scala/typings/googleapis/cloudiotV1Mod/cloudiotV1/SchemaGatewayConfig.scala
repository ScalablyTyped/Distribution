package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gateway-related configuration and state.
  */
@js.native
trait SchemaGatewayConfig extends js.Object {
  /**
    * Indicates how to authorize and/or authenticate devices to access the
    * gateway.
    */
  var gatewayAuthMethod: js.UndefOr[String] = js.native
  /**
    * Indicates whether the device is a gateway.
    */
  var gatewayType: js.UndefOr[String] = js.native
  /**
    * [Output only] The ID of the gateway the device accessed most recently.
    */
  var lastAccessedGatewayId: js.UndefOr[String] = js.native
  /**
    * [Output only] The most recent time at which the device accessed the
    * gateway specified in `last_accessed_gateway`.
    */
  var lastAccessedGatewayTime: js.UndefOr[String] = js.native
}

object SchemaGatewayConfig {
  @scala.inline
  def apply(
    gatewayAuthMethod: String = null,
    gatewayType: String = null,
    lastAccessedGatewayId: String = null,
    lastAccessedGatewayTime: String = null
  ): SchemaGatewayConfig = {
    val __obj = js.Dynamic.literal()
    if (gatewayAuthMethod != null) __obj.updateDynamic("gatewayAuthMethod")(gatewayAuthMethod.asInstanceOf[js.Any])
    if (gatewayType != null) __obj.updateDynamic("gatewayType")(gatewayType.asInstanceOf[js.Any])
    if (lastAccessedGatewayId != null) __obj.updateDynamic("lastAccessedGatewayId")(lastAccessedGatewayId.asInstanceOf[js.Any])
    if (lastAccessedGatewayTime != null) __obj.updateDynamic("lastAccessedGatewayTime")(lastAccessedGatewayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGatewayConfig]
  }
}

