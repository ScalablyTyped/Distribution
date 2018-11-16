package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Web Bluetooth-style GATT server - get this using <code>NRF.connect(address)</code>
* or <code>NRF.requestDevice(options)</code> then <code>response.gatt.connect</code></p>
* <p><a href="https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattserver">https://webbluetoothcg.github.io/web-bluetooth/#bluetoothremotegattserver</a></p>
* 
* @url http://www.espruino.com/Reference#BluetoothRemoteGATTServer
*/
@js.native
trait BluetoothRemoteGATTServer
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[BluetoothRemoteGATTServer] {
  /**
       * <p>Connect to a BLE device - returns a promise,
       * the argument of which is the <code>BluetoothRemoteGATTServer</code> connection.</p>
       * <p>See <a href="/Reference#l_NRF_requestDevice"><code>NRF.requestDevice</code></a> for usage examples.</p>
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTServer_connect
       */
  def connect(): js.Any = js.native
  /**
       * <p>Disconnect from a previously connected BLE device connected with
       * <code>NRF.connect</code> - this does not disconnect from something that has
       * connected to the Espruino.</p>
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTServer_disconnect
       */
  def disconnect(): scala.Unit = js.native
  /**
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @param service 
       * @return  
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTServer_getPrimaryService
       */
  def getPrimaryService(service: js.Any): js.Any = js.native
  /**
       * <p><strong>Note:</strong> This is only available on some devices</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_BluetoothRemoteGATTServer_getPrimaryServices
       */
  def getPrimaryServices(): js.Any = js.native
}

