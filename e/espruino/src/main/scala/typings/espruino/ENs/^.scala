package typings.espruino.ENs

import typings.espruino.File
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("E")
@js.native
object ^ extends js.Object {
  /**
    * <p>Clip a number to be between min and max (inclusive)</p>
    * 
    * @param x 
    * @param min 
    * @param max 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_clip
    */
  def clip(x: Double, min: Double, max: Double): Double = js.native
  /**
    * <p>Convolve arr1 with arr2. This is equivalent to <code>v=0;for (i in arr1) v+=arr1[i] * arr2[(i+offset) % arr2.length]</code></p>
    * 
    * @param arr1 
    * @param arr2 
    * @param offset 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_convolve
    */
  def convolve(arr1: js.Any, arr2: js.Any, offset: Double): Double = js.native
  /**
    * <p>Dump any locked variables that aren&#39;t referenced from <code>global</code> - for debugging memory leaks only.</p>
    * 
    * @url http://www.espruino.com/Reference#l_E_dumpLockedVars
    */
  def dumpLockedVars(): Unit = js.native
  /**
    * <p>Get the current interpreter state in a text form such that it can be copied to a new device</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_dumpStr
    */
  def dumpStr(): String = js.native
  /**
    * <p>Output the current list of Utility Timer Tasks - for debugging only</p>
    * 
    * @url http://www.espruino.com/Reference#l_E_dumpTimers
    */
  def dumpTimers(): Unit = js.native
  /**
    * <p>Check the internal voltage reference. To work out an actual voltage of an input pin, you can use <code>analogRead(pin)*E.getAnalogVRef()</code></p>
    * <p> <strong>Note:</strong> This value is calculated by reading the voltage on an internal voltage reference with the ADC.
    * It will be slightly noisy, so if you need this for accurate measurements we&#39;d recommend that you call
    * this function several times and average the results.</p>
    * <p>While this is implemented on Espruino boards, it may not be implemented on other devices. If so it&#39;ll return NaN.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_getAnalogVRef
    */
  def getAnalogVRef(): Double = js.native
  /**
    * <p>Get and reset the error flags. Returns an array that can contain:</p>
    * <p><code>&#39;FIFO_FULL&#39;</code>: The receive FIFO filled up and data was lost. This could be state transitions for setWatch, or received characters.</p>
    * <p><code>&#39;BUFFER_FULL&#39;</code>: A buffer for a stream filled up and characters were lost. This can happen to any stream - Serial,HTTP,etc.</p>
    * <p><code>&#39;CALLBACK&#39;</code>: A callback (s<code>etWatch</code>, <code>setInterval</code>, <code>on(&#39;data&#39;,...)</code>) caused an error and so was removed.</p>
    * <p><code>&#39;LOW_MEMORY&#39;</code>: Memory is running low - Espruino had to run a garbage collection pass or remove some of the command history</p>
    * <p><code>&#39;MEMORY&#39;</code>: Espruino ran out of memory and was unable to allocate some data that it needed.</p>
    * <p><code>&#39;JSERR_UART_OVERFLOW&#39;</code> : A UART received data but it was not read in time and was lost</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_getErrorFlags
    */
  def getErrorFlags(): js.Any = js.native
  /**
    * <p>Get Espruino&#39;s interpreter flags that control the way it handles your JavaScript code.</p>
    * <ul>
    * <li><code>deepSleep</code> - Allow deep sleep modes (also set by setDeepSleep)</li>
    * <li><code>pretokenise</code> - When adding functions, pre-minify them and tokenise reserved words</li>
    * </ul>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_getFlags
    */
  def getFlags(): js.Any = js.native
  /**
    * <p>Use the STM32&#39;s internal thermistor to work out the temperature.</p>
    * <p>While this is implemented on Espruino boards, it may not be implemented on other devices. If so it&#39;ll return NaN.</p>
    * <p> <strong>Note:</strong> This is not entirely accurate and varies by a few degrees from chip to chip. It measures the <strong>die temperature</strong>, so when connected to USB it could be reading 10 over degrees C above ambient temperature. When running from battery with <code>setDeepSleep(true)</code> it is much more accurate though.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_getTemperature
    */
  def getTemperature(): Double = js.native
  /**
    * <p>Unlike &#39;Math.random()&#39; which uses a pseudo-random number generator, this
    * method reads from the internal voltage reference several times, xoring and
    * rotating to try and make a relatively random value from the noise in the
    * signal.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_hwRand
    */
  def hwRand(): Double = js.native
  /**
    * <p>Interpolate between two adjacent values in the Typed Array</p>
    * 
    * @param array 
    * @param index 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_interpolate
    */
  def interpolate(array: js.Any, index: Double): Double = js.native
  /**
    * <p>Interpolate between four adjacent values in the Typed Array, in 2D.</p>
    * 
    * @param array 
    * @param width 
    * @param x 
    * @param y 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_interpolate2d
    */
  def interpolate2d(array: js.Any, width: Double, x: Double, y: Double): Double = js.native
  /**
    * <p>Kicks a Watchdog timer set up with <code>E.enableWatchdog(..., false)</code>. See
    * <code>E.enableWatchdog</code> for more information.</p>
    * <p><strong>NOTE:</strong> This is only implemented on STM32 and nRF5x devices (all official Espruino boards).</p>
    * 
    * @url http://www.espruino.com/Reference#l_E_kickWatchdog
    */
  def kickWatchdog(): Unit = js.native
  /**
    * <p>If a password has been set with <code>E.setPassword()</code>, this will lock the console
    * so the password needs to be entered to unlock it.</p>
    * 
    * @url http://www.espruino.com/Reference#l_E_lockConsole
    */
  def lockConsole(): Unit = js.native
  /**
    * <p>Take each element of the <code>from</code> array, look it up in <code>map</code> (or call the
    * function with it as a first argument), and write it into the corresponding
    * element in the <code>to</code> array.</p>
    * 
    * @param from 
    * @param to 
    * @param map 
    * @param bits 
    * @url http://www.espruino.com/Reference#l_E_mapInPlace
    */
  def mapInPlace(from: js.Any, to: js.Any, map: js.Any, bits: Double): Unit = js.native
  /**
    * <p>This creates and returns a special type of string, which actually references
    * a specific memory address. It can be used in order to use sections of
    * Flash memory directly in Espruino (for example to execute code straight
    * from flash memory with <code>eval(E.memoryArea( ... ))</code>)</p>
    * <p><strong>Note:</strong> This is only tested on STM32-based platforms (Espruino Original
    * and Espruino Pico) at the moment.</p>
    * 
    * @param addr 
    * @param len 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_memoryArea
    */
  def memoryArea(addr: Double, len: Double): String = js.native
  /**
    * <p>ADVANCED: This is a great way to crash Espruino if you&#39;re not sure what you are doing</p>
    * <p>Create a native function that executes the code at the given address. Eg. <code>E.nativeCall(0x08012345,&#39;double (double,double)&#39;)(1.1, 2.2)</code></p>
    * <p>If you&#39;re executing a thumb function, you&#39;ll almost certainly need to set the bottom bit of the address to 1.</p>
    * <p>Note it&#39;s not guaranteed that the call signature you provide can be used - there are limits on the number of arguments allowed.</p>
    * <p>When supplying <code>data</code>, if it is a &#39;flat string&#39; then it will be used directly, otherwise it&#39;ll be converted to a flat string and used.</p>
    * 
    * @param addr 
    * @param sig 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_nativeCall
    */
  def nativeCall(addr: Double, sig: js.Any, data: js.Any): js.Any = js.native
  /**
    * <p>Open a file</p>
    * 
    * @param path 
    * @param mode 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_openFile
    */
  def openFile(path: js.Any, mode: js.Any): File = js.native
  /**
    * <p>Reverse the 8 bits in a byte, swapping MSB and LSB.</p>
    * <p>For example, <code>E.reverseByte(0b10010000) == 0b00001001</code>.</p>
    * <p>Note that you can reverse all the bytes in an array with: <code>arr = arr.map(E.reverseByte)</code></p>
    * 
    * @param x 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_reverseByte
    */
  def reverseByte(x: Double): Double = js.native
  /**
    * 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_sendUSBHID
    */
  def sendUSBHID(data: js.Any): Boolean = js.native
  /**
    * <p>This writes JavaScript code into Espruino&#39;s flash memory, to be executed on
    * startup. It differs from <code>save()</code> in that <code>save()</code> saves the whole state of
    * the interpreter, whereas this just saves JS code that is executed at boot.</p>
    * <p>Code will be executed before <code>onInit()</code> and <code>E.on(&#39;init&#39;, ...)</code>.</p>
    * <p>If <code>alwaysExec</code> is <code>true</code>, the code will be executed even after a call to
    * <code>reset()</code>. This is useful if you&#39;re making something that you want to
    * program, but you want some code that is always built in (for instance
    * setting up a display or keyboard).</p>
    * <p>To remove boot code that has been saved previously, use <code>E.setBootCode(&quot;&quot;)</code></p>
    * <p><strong>Note:</strong> this removes any code that was previously saved with <code>save()</code></p>
    * 
    * @param code 
    * @param alwaysExec 
    * @url http://www.espruino.com/Reference#l_E_setBootCode
    */
  def setBootCode(code: js.Any, alwaysExec: Boolean): Unit = js.native
  /**
    * <p>This sets the clock frequency of Espruino&#39;s processor. It will return <code>0</code> if
    * it is unimplemented or the clock speed cannot be changed.</p>
    * <p><strong>Note:</strong> On pretty much all boards, UART, SPI, I2C, PWM, etc will change
    * frequency and will need setting up again in order to work.</p>
    * <h3 id="stm32f4">STM32F4</h3>
    * <p>Options is of the form <code>{ M: int, N: int, P: int, Q: int }</code> - see the &#39;Clocks&#39;
    * section of the microcontroller&#39;s reference manual for what these mean.</p>
    * <ul>
    * <li>System clock = 8Mhz <em> N / ( M </em> P )</li>
    * <li>USB clock (should be 48Mhz) = 8Mhz <em> N / ( M </em> Q )</li>
    * </ul>
    * <p>Optional arguments are:</p>
    * <ul>
    * <li><code>latency</code> - flash latency from 0..15</li>
    * <li><code>PCLK1</code> - Peripheral clock 1 divisor (default: 2)</li>
    * <li><code>PCLK2</code> - Peripheral clock 2 divisor (default: 4)</li>
    * </ul>
    * <p>The Pico&#39;s default is <code>{M:8, N:336, P:4, Q:7, PCLK1:2, PCLK2:4}</code>, use
    * <code>{M:8, N:336, P:8, Q:7, PCLK:1, PCLK2:2}</code> to halve the system clock speed
    * while keeping the peripherals running at the same speed (omitting PCLK1/2
    * will lead to the peripherals changing speed too).</p>
    * <p>On STM32F4 boards (eg. Espruino Pico), the USB clock needs to be kept at 48Mhz
    * or USB will fail to work. You&#39;ll also experience USB instability if the processor
    * clock falls much below 48Mhz.</p>
    * <h3 id="esp8266">ESP8266</h3>
    * <p>Just specify an integer value, either 80 or 160 (for 80 or 160Mhz)</p>
    * 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_setClock
    */
  def setClock(options: js.Any): Double = js.native
  /**
    * <p>Set the Espruino interpreter flags that control the way it handles your JavaScript code.</p>
    * <p>Run <code>E.getFlags()</code> and check its description for a list of available flags and their values.</p>
    * 
    * @param flags 
    * @url http://www.espruino.com/Reference#l_E_setFlags
    */
  def setFlags(flags: js.Any): Unit = js.native
  /**
    * <p>Set a password on the console (REPL). When powered on, Espruino will
    * then demand a password before the console can be used. If you want to
    * lock the console immediately after this you can call <code>E.lockConsole()</code></p>
    * <p>To remove the password, call this function with no arguments.</p>
    * <p><strong>Note:</strong> There is no protection against multiple password attempts, so someone
    * could conceivably try every password in a dictionary.</p>
    * <p><strong>Note:</strong> This password is stored in memory in plain text. If someone is able
    * to execute arbitrary JavaScript code on the device (eg, you use <code>eval</code> on input
    * from unknown sources) or read the device&#39;s firmware then they may be able to
    * obtain it.</p>
    * 
    * @param password 
    * @url http://www.espruino.com/Reference#l_E_setPassword
    */
  def setPassword(password: js.Any): Unit = js.native
  /**
    * <p>Set the time zone to be used with <code>Date</code> objects.</p>
    * <p>For example <code>E.setTimeZone(1)</code> will be GMT+0100</p>
    * 
    * @param zone 
    * @url http://www.espruino.com/Reference#l_E_setTimeZone
    */
  def setTimeZone(zone: Double): Unit = js.native
  /**
    * <p>USB HID will only take effect next time you unplug and re-plug your Espruino. If you&#39;re
    * disconnecting it from power you&#39;ll have to make sure you have <code>save()</code>d after calling
    * this function.</p>
    * 
    * @param opts 
    * @url http://www.espruino.com/Reference#l_E_setUSBHID
    */
  def setUSBHID(opts: js.Any): Unit = js.native
  /**
    * <p>Set the seed for the random number generator used by <code>Math.random()</code>.</p>
    * 
    * @param v 
    * @url http://www.espruino.com/Reference#l_E_srand
    */
  def srand(v: Double): Unit = js.native
  /**
    * <p>Sum the contents of the given Array, String or ArrayBuffer and return the result</p>
    * 
    * @param arr 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_sum
    */
  def sum(arr: js.Any): Double = js.native
  /**
    * <p>Create an ArrayBuffer from the given string. This is done via a reference, not a copy - so it is very fast and memory efficient.</p>
    * <p>Note that this is an ArrayBuffer, not a Uint8Array. To get one of those, do: <code>new Uint8Array(E.toArrayBuffer(&#39;....&#39;))</code>.</p>
    * 
    * @param str 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_toArrayBuffer
    */
  def toArrayBuffer(str: js.Any): ArrayBuffer = js.native
  /**
    * <p>This creates a Uint8Array from the given arguments. If an argument is a String or an Array,
    * each element is traversed and added as if it were an 8 bit value. If it is anything else, it is
    * converted to an 8 bit value directly.</p>
    * 
    * @param args 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_toUint8Array
    */
  def toUint8Array(args: js.Any): Uint8Array = js.native
  /**
    * <p>Unmount the SD card, so it can be removed. If you remove the SD card without calling this you may cause corruption, and you will be unable to access another SD card until you reset Espruino or call <code>E.unmountSD()</code>.</p>
    * 
    * @url http://www.espruino.com/Reference#l_E_unmountSD
    */
  def unmountSD(): Unit = js.native
  /**
    * <p>Work out the variance of the contents of the given Array, String or ArrayBuffer and return the result. This is equivalent to <code>v=0;for (i in arr) v+=Math.pow(mean-arr[i],2)</code></p>
    * 
    * @param arr 
    * @param mean 
    * @return  
    * @url http://www.espruino.com/Reference#l_E_variance
    */
  def variance(arr: js.Any, mean: Double): Double = js.native
}

