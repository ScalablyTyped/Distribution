package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDevice extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/bluetooth-device
  var deviceId: String
  
  var deviceName: String
}
object BluetoothDevice {
  
  inline def apply(deviceId: String, deviceName: String): BluetoothDevice = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  
  extension [Self <: BluetoothDevice](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
  }
}
