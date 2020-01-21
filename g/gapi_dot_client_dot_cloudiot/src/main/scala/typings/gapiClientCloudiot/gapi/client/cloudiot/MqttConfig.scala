package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MqttConfig extends js.Object {
  /**
    * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
    * connections to this registry will fail.
    */
  var mqttEnabledState: js.UndefOr[String] = js.undefined
}

object MqttConfig {
  @scala.inline
  def apply(mqttEnabledState: String = null): MqttConfig = {
    val __obj = js.Dynamic.literal()
    if (mqttEnabledState != null) __obj.updateDynamic("mqttEnabledState")(mqttEnabledState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MqttConfig]
  }
}

