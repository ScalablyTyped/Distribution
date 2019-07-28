package typings.espruino

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Creates a pin from the given argument (or returns undefined if no argument)</p>
* 
* @url http://www.espruino.com/Reference#l_Pin_Pin
*/
@js.native
trait Pin
  extends /**
  * 
  * @param value 
  * @return  
  */
Instantiable1[/* value */ js.Any, js.Any] {
  /**
    * <p>Return the current mode of the given pin. See <code>pinMode</code> for more information.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Pin_getMode
    */
  def getMode(): js.Any = js.native
  /**
    * <p>Set the mode of the given pin. See <a href="#l__global_pinMode"><code>pinMode</code></a> for more information on pin modes.</p>
    * 
    * @param mode 
    * @url http://www.espruino.com/Reference#l_Pin_mode
    */
  def mode(mode: js.Any): Unit = js.native
  /**
    * <p>Returns the input state of the pin as a boolean.</p>
    * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset the pin&#39;s state to <code>&quot;input&quot;</code></p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Pin_read
    */
  def read(): Boolean = js.native
  /**
    * <p>Sets the output state of the pin to a 0</p>
    * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset the pin&#39;s state to <code>&quot;output&quot;</code></p>
    * 
    * @url http://www.espruino.com/Reference#l_Pin_reset
    */
  def reset(): Unit = js.native
  /**
    * <p>Sets the output state of the pin to a 1</p>
    * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset the pin&#39;s state to <code>&quot;output&quot;</code></p>
    * 
    * @url http://www.espruino.com/Reference#l_Pin_set
    */
  def set(): Unit = js.native
  /**
    * <p>Toggles the state of the pin from off to on, or from on to off.</p>
    * <p><strong>Note:</strong> This method doesn&#39;t currently work on the ESP8266 port of Espruino.</p>
    * <p><strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset the pin&#39;s state to <code>&quot;output&quot;</code></p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Pin_toggle
    */
  def toggle(): Boolean = js.native
  /**
    * <p>Sets the output state of the pin to the parameter given</p>
    * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset the pin&#39;s state to <code>&quot;output&quot;</code></p>
    * 
    * @param value 
    * @url http://www.espruino.com/Reference#l_Pin_write
    */
  def write(value: Boolean): Unit = js.native
  /**
    * <p>Sets the output state of the pin to the parameter given at the specified time.</p>
    * <p> <strong>Note:</strong> this <strong>doesn&#39;t</strong> change the mode of the pin to an output. To do that, you need to use <code>pin.write(0)</code> or <code>pinMode(pin, &#39;output&#39;)</code> first.</p>
    * 
    * @param value 
    * @param time 
    * @url http://www.espruino.com/Reference#l_Pin_writeAtTime
    */
  def writeAtTime(value: Boolean, time: Double): Unit = js.native
}

