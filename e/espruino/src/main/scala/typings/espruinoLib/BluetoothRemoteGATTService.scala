package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Web Bluetooth-style GATT service - get this using <code>BluetoothRemoteGATTServer.getPrimaryService(s)</code></p>
* <p><a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattservice">https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattservice</a></p>
* 
* @url http://www.espruino.com/Reference#BluetoothRemoteGATTService
*/
@js.native
trait BluetoothRemoteGATTService
  extends /**
     * 
     * @return  
     */
org.scalablytyped.runtime.Instantiable0[BluetoothRemoteGATTService] {
  /**
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @param characteristic 
       * @return  
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTService_getCharacteristic
       */
  def getCharacteristic(characteristic: js.Any): js.Any = js.native
  /**
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTService_getCharacteristics
       */
  def getCharacteristics(): js.Any = js.native
}

