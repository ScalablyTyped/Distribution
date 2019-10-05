package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>The ESP8266 library is specific to the ESP8266 version of Espruino, i.e., running Espruino on an ESP8266 module (not to be confused with using the ESP8266 as Wifi add-on to an Espruino board).  This library contains functions to handle ESP8266-specific actions.
* For example: <code>var esp8266 = require(&#39;ESP8266&#39;); esp8266.reboot();</code> performs a hardware reset of the module.</p>
* 
* @url http://www.espruino.com/Reference#l_ESP8266_undefined
*/
@js.native
trait ESP8266 extends /**
  * 
  * @return  
  */
Instantiable0[ESP8266]

/**
* 
*/
@JSGlobal("ESP8266")
@js.native
object ESP8266 extends js.Object {
  /**
    * 
    * @param arrayOfData 
    * @return  
    * @url http://www.espruino.com/Reference#l_ESP8266_crc32
    */
  def crc32(arrayOfData: js.Any): js.Any = js.native
  /**
    * <p>Put the ESP8266 into &#39;deep sleep&#39; for the given number of microseconds, 
    * reducing power consumption drastically. </p>
    * <p>meaning of option values:</p>
    * <p>0 - the 108th Byte of init parameter decides whether RF calibration will be performed or not.</p>
    * <p>1 - run RF calibration after waking up. Power consumption is high.</p>
    * <p>2 - no RF calibration after waking up. Power consumption is low.</p>
    * <p>4 - no RF after waking up. Power consumption is the lowest.</p>
    * <p><strong>Note:</strong> unlike normal Espruino boards&#39; &#39;deep sleep&#39; mode, ESP8266 deep sleep actually turns off the processor. After the given number of microseconds have elapsed, the ESP8266 will restart as if power had been turned off and then back on. <em>All contents of RAM will be lost</em>. 
    * Connect GPIO 16 to RST to enable wakeup.</p>
    * <p><strong>Special:</strong> 0 microseconds cause sleep forever until external wakeup RST pull down occurs.</p>
    * 
    * @param micros 
    * @param option 
    * @url http://www.espruino.com/Reference#l_ESP8266_deepSleep
    */
  def deepSleep(micros: js.Any, option: js.Any): Unit = js.native
  /**
    * <p>Dumps info about all sockets to the log. This is for troubleshooting the socket implementation.</p>
    * 
    * @url http://www.espruino.com/Reference#l_ESP8266_dumpSocketInfo
    */
  def dumpSocketInfo(): Unit = js.native
  /**
    * <p><strong>Note:</strong> This is deprecated. Use <code>require(&quot;flash&quot;).getFree()</code></p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_ESP8266_getFreeFlash
    */
  def getFreeFlash(): js.Any = js.native
  /**
    * <p>Returns an object that contains details about the state of the ESP8266 with the following fields:</p>
    * <ul>
    * <li><code>sdkVersion</code>   - Version of the SDK.</li>
    * <li><code>cpuFrequency</code> - CPU operating frequency in Mhz.</li>
    * <li><code>freeHeap</code>     - Amount of free heap in bytes.</li>
    * <li><code>maxCon</code>       - Maximum number of concurrent connections.</li>
    * <li><code>flashMap</code>     - Configured flash size&amp;map: &#39;512KB:256/256&#39; .. &#39;4MB:512/512&#39;</li>
    * <li><code>flashKB</code>      - Configured flash size in KB as integer</li>
    * <li><code>flashChip</code>    - Type of flash chip as string with manufacturer &amp; chip, ex: &#39;0xEF 0x4016`</li>
    * </ul>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_ESP8266_getState
    */
  def getState(): js.Any = js.native
  /**
    * <p>Enable or disable the logging of debug information.  A value of <code>true</code> enables debug logging while a value of <code>false</code> disables debug logging.  Debug output is sent to UART1 (gpio2).</p>
    * 
    * @param enable 
    * @url http://www.espruino.com/Reference#l_ESP8266_logDebug
    */
  def logDebug(enable: Boolean): Unit = js.native
  /**
    * <p><strong>This function is deprecated.</strong> Please use <code>require(&quot;neopixel&quot;).write(pin, data)</code> instead</p>
    * 
    * @param pin 
    * @param arrayOfData 
    * @url http://www.espruino.com/Reference#l_ESP8266_neopixelWrite
    */
  def neopixelWrite(pin: Pin, arrayOfData: js.Any): Unit = js.native
  /**
    * <p>Perform a network ping request. The parameter can be either a String or a numeric IP address.
    * <strong>Note:</strong> This function should probably be removed, or should it be part of the wifi library?</p>
    * 
    * @param ipAddr 
    * @param pingCallback 
    * @url http://www.espruino.com/Reference#l_ESP8266_ping
    */
  def ping(ipAddr: js.Any, pingCallback: js.Any): Unit = js.native
  /**
    * <p>Prints the contents of the debug log to the console.</p>
    * 
    * @url http://www.espruino.com/Reference#l_ESP8266_printLog
    */
  def printLog(): Unit = js.native
  /**
    * <p>Returns one line from the log or up to 128 characters.</p>
    * 
    * @url http://www.espruino.com/Reference#l_ESP8266_readLog
    */
  def readLog(): Unit = js.native
  /**
    * <p>Perform a hardware reset/reboot of the esp8266.</p>
    * 
    * @url http://www.espruino.com/Reference#l_ESP8266_reboot
    */
  def reboot(): Unit = js.native
  /**
    * <p><strong>Note:</strong> This is deprecated. Use <code>E.setClock(80/160)</code>
    * <strong>Note:</strong>
    * Set the operating frequency of the ESP8266 processor. The default is 160Mhz.</p>
    * <p><strong>Warning</strong>: changing the cpu frequency affects the timing of some I/O operations, notably of software SPI and I2C, so things may be a bit slower at 80Mhz.</p>
    * 
    * @param freq 
    * @url http://www.espruino.com/Reference#l_ESP8266_setCPUFreq
    */
  def setCPUFreq(freq: js.Any): Unit = js.native
  /**
    * <p>Set the debug logging mode. It can be disabled (which frees ~1.2KB of heap), enabled in-memory only, or in-memory and output to a UART.</p>
    * 
    * @param mode 
    * @url http://www.espruino.com/Reference#l_ESP8266_setLog
    */
  def setLog(mode: Double): Unit = js.native
}

