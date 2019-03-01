package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MqttConfig extends js.Object {
  /**
    * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
    * connections to this registry will fail.
    */
  var mqttEnabledState: js.UndefOr[java.lang.String] = js.undefined
}

object MqttConfig {
  @scala.inline
  def apply(mqttEnabledState: java.lang.String = null): MqttConfig = {
    val __obj = js.Dynamic.literal()
    if (mqttEnabledState != null) __obj.updateDynamic("mqttEnabledState")(mqttEnabledState)
    __obj.asInstanceOf[MqttConfig]
  }
}

