package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDevice extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/bluetooth-device
  var deviceId: String = js.native
  var deviceName: String = js.native
}

object BluetoothDevice {
  @scala.inline
  def apply(deviceId: String, deviceName: String): BluetoothDevice = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  @scala.inline
  implicit class BluetoothDeviceOps[Self <: BluetoothDevice] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
  }
  
}

