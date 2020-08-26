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
  def apply(): SchemaGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewayConfig]
  }
  @scala.inline
  implicit class SchemaGatewayConfigOps[Self <: SchemaGatewayConfig] (val x: Self) extends AnyVal {
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
    def setGatewayAuthMethod(value: String): Self = this.set("gatewayAuthMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayAuthMethod: Self = this.set("gatewayAuthMethod", js.undefined)
    @scala.inline
    def setGatewayType(value: String): Self = this.set("gatewayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayType: Self = this.set("gatewayType", js.undefined)
    @scala.inline
    def setLastAccessedGatewayId(value: String): Self = this.set("lastAccessedGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessedGatewayId: Self = this.set("lastAccessedGatewayId", js.undefined)
    @scala.inline
    def setLastAccessedGatewayTime(value: String): Self = this.set("lastAccessedGatewayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessedGatewayTime: Self = this.set("lastAccessedGatewayTime", js.undefined)
  }
  
}

