package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Web Bluetooth-style device - get this using <code>NRF.requestDevice(address)</code></p>
* 
* @url http://www.espruino.com/Reference#BluetoothDevice
*/
@js.native
trait BluetoothDevice extends /**
  * 
  * @return  
  */
Instantiable0[BluetoothDevice] {
  /**
    * <p><strong>Note:</strong> This is only available on some devices</p>
    * 
    * @url http://www.espruino.com/Reference#l_BluetoothDevice_gatt
    */
  var gatt: js.Any = js.native
}

