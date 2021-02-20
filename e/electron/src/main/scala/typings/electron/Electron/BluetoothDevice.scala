package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDevice extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/bluetooth-device
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
  implicit class BluetoothDeviceMutableBuilder[Self <: BluetoothDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
  }
}
