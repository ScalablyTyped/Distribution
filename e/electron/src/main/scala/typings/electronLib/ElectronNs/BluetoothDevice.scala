package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDevice extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/bluetooth-device
  var deviceId: java.lang.String
  var deviceName: java.lang.String
}

object BluetoothDevice {
  @scala.inline
  def apply(deviceId: java.lang.String, deviceName: java.lang.String): BluetoothDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.asInstanceOf[BluetoothDevice]
  }
}

