package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Web Bluetooth-style GATT characteristic - get this using <code>BluetoothRemoteGATTService.getCharacteristic(s)</code></p>
* <p><a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattcharacteristic">https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattcharacteristic</a></p>
* 
* @url http://www.espruino.com/Reference#BluetoothRemoteGATTCharacteristic
*/
@js.native
trait BluetoothRemoteGATTCharacteristic extends /**
  * 
  * @return  
  */
Instantiable0[BluetoothRemoteGATTCharacteristic] {
  /**
    * <p><strong>Note:</strong> This is only available on some devices</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTCharacteristic_stopNotifications
    */
  def stopNotifications(): js.Any = js.native
}

