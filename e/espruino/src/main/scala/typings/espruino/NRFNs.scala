package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("NRF")
@js.native
object NRFNs extends js.Object {
  /**
    * <p>If a device is connected to Espruino, disconnect from it.</p>
    * 
    * @url http://www.espruino.com/Reference#l_NRF_disconnect
    */
  def disconnect(): Unit = js.native
  /**
    * <p>Get this device&#39;s Bluetooth MAC address.</p>
    * <p>For Puck.js, the last 5 characters of this (eg. <code>ee:ff</code>)
    * are used in the device&#39;s advertised Bluetooth name.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_NRF_getAddress
    */
  def getAddress(): js.Any = js.native
  /**
    * <p>This is just like <code>NRF.setAdvertising</code>, except instead of advertising
    * the data, it returns the packet that would be advertised as an array.</p>
    * 
    * @param data 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_NRF_getAdvertisingData
    */
  def getAdvertisingData(data: js.Any, options: js.Any): js.Any = js.native
  /**
    * <p>Get the battery level in volts (the voltage that the NRF chip is running off of).</p>
    * <p>This is the battery level of the device itself - it has nothing to with any
    * device that might be connected.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_NRF_getBattery
    */
  def getBattery(): Double = js.native
  /**
    * <p>Restart the Bluetooth softdevice (if there is currently a BLE connection,
    * it will queue a restart to be done when the connection closes).</p>
    * <p>You shouldn&#39;t need to call this function in normal usage. However, Nordic&#39;s
    * BLE softdevice has some settings that cannot be reset. For example there
    * are only a certain number of unique UUIDs. Once these are all used the
    * only option is to restart the softdevice to clear them all out.</p>
    * 
    * @url http://www.espruino.com/Reference#l_NRF_restart
    */
  def restart(): Unit = js.native
  /**
    * <p>Send a USB HID report. HID must first be enabled with <code>NRF.setServices({}, {hid: hid_report})</code></p>
    * 
    * @param data 
    * @param callback 
    * @url http://www.espruino.com/Reference#l_NRF_sendHIDReport
    */
  def sendHIDReport(data: js.Any, callback: js.Any): Unit = js.native
  /**
    * <p>This sets the connection parameters - these affect the transfer speed and
    * power usage when the device is connected.</p>
    * <ul>
    * <li>When not low power, the connection interval is between 7.5 and 20ms</li>
    * <li>When low power, the connection interval is between 500 and 1000ms</li>
    * </ul>
    * <p>When low power connection is enabled, transfers of data over Bluetooth
    * will be very slow, however power usage while connected will be drastically
    * decreased.</p>
    * <p>This will only take effect after the connection is disconnected and
    * re-established.</p>
    * 
    * @param lowPower 
    * @url http://www.espruino.com/Reference#l_NRF_setLowPowerConnection
    */
  def setLowPowerConnection(lowPower: Boolean): Unit = js.native
  /**
    * <p>Set the BLE radio transmit power. The default TX power is 0 dBm.</p>
    * 
    * @param power 
    * @url http://www.espruino.com/Reference#l_NRF_setTxPower
    */
  def setTxPower(power: Double): Unit = js.native
  /**
    * <p>If set to true, whenever a device bonds it will be added to the
    * whitelist.</p>
    * <p>When set to false, the whitelist is cleared and newly bonded
    * devices will not be added to the whitelist.</p>
    * <p><strong>Note:</strong> This is remembered between <code>reset()</code>s but isn&#39;t
    * remembered after power-on (you&#39;ll have to add it to <code>onInit()</code>.</p>
    * 
    * @param whitelisting 
    * @url http://www.espruino.com/Reference#l_NRF_setWhitelist
    */
  def setWhitelist(whitelisting: Boolean): Unit = js.native
  /**
    * <p>Disable Bluetooth advertising and disconnect from any device that
    * connected to Puck.js as a peripheral (this won&#39;t affect any devices
    * that Puck.js initiated connections to).</p>
    * <p>This makes Puck.js undiscoverable, so it can&#39;t be connected to.</p>
    * <p>Use <code>NRF.wake()</code> to wake up and make Puck.js connectable again.</p>
    * 
    * @url http://www.espruino.com/Reference#l_NRF_sleep
    */
  def sleep(): Unit = js.native
  /**
    * <p>Enable Bluetooth advertising (this is enabled by default), which
    * allows other devices to discover and connect to Puck.js.</p>
    * <p>Use <code>NRF.sleep()</code> to disable advertising.</p>
    * 
    * @url http://www.espruino.com/Reference#l_NRF_wake
    */
  def wake(): Unit = js.native
}

