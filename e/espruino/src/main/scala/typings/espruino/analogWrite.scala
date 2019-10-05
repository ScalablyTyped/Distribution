package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("analogWrite")
@js.native
object analogWrite extends js.Object {
  /**
  * <p>Set the analog Value of a pin. It will be output using PWM.</p>
  * <p>Objects can contain:</p>
  * <ul>
  * <li><code>freq</code> - pulse frequency in Hz, eg. <code>analogWrite(A0,0.5,{ freq : 10 });</code> - specifying a frequency will force PWM output, even if the pin has a DAC</li>
  * <li><code>soft</code> - boolean, If true software PWM is used if available.</li>
  * <li><p><code>forceSoft</code> - boolean, If true software PWM is used even</p>
  * <p><strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset pin&#39;s state to <code>&quot;output&quot;</code></p>
  * </li>
  * </ul>
  * 
  * @param pin 
  * @param value 
  * @param options 
  * @url http://www.espruino.com/Reference#l__global_analogWrite
  */
  def apply(pin: Pin, value: Double, options: js.Any): Unit = js.native
}

