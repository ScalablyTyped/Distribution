package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration of MQTT for a device registry.
  */
@js.native
trait Schema$MqttConfig extends js.Object {
  /**
    * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
    * connections to this registry will fail.
    */
  var mqttEnabledState: js.UndefOr[String] = js.native
}

object Schema$MqttConfig {
  @scala.inline
  def apply(mqttEnabledState: String = null): Schema$MqttConfig = {
    val __obj = js.Dynamic.literal()
    if (mqttEnabledState != null) __obj.updateDynamic("mqttEnabledState")(mqttEnabledState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MqttConfig]
  }
}

