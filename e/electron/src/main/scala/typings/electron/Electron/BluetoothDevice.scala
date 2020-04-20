package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDevice extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/bluetooth-device
  var deviceId: String
  var deviceName: String
}

object BluetoothDevice {
  @scala.inline
  def apply(deviceId: String, deviceName: String): BluetoothDevice = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
}

