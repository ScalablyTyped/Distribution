package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pinMode")
@js.native
object pinMode extends js.Object {
  /**
  * <p>Set the mode of the given pin.</p>
  * <ul>
  * <li><code>auto</code>/<code>undefined</code> - Don&#39;t change state, but allow <code>digitalWrite</code>/etc to automatically change state as appropriate</li>
  * <li><code>analog</code> - Analog input</li>
  * <li><code>input</code> - Digital input</li>
  * <li><code>input_pullup</code> - Digital input with internal ~40k pull-up resistor</li>
  * <li><code>input_pulldown</code> - Digital input with internal ~40k pull-down resistor</li>
  * <li><code>output</code> - Digital output</li>
  * <li><code>opendrain</code> - Digital output that only ever pulls down to 0v. Sending a logical <code>1</code> leaves the pin open circuit</li>
  * <li><code>opendrain_pullup</code> - Digital output that pulls down to 0v. Sending a logical <code>1</code> enables internal ~40k pull-up resistor</li>
  * <li><code>af_output</code> - Digital output from built-in peripheral</li>
  * <li><p><code>af_opendrain</code> - Digital output from built-in peripheral that only ever pulls down to 0v. Sending a logical <code>1</code> leaves the pin open circuit</p>
  * <p><strong>Note:</strong> <code>digitalRead</code>/<code>digitalWrite</code>/etc set the pin mode automatically <em>unless</em> <code>pinMode</code> has been called first.
  * If you want <code>digitalRead</code>/etc to set the pin mode automatically after you have called <code>pinMode</code>, simply call it again
  * with no mode argument (<code>pinMode(pin)</code>), <code>auto</code> as the argument (<code>pinMode(pin, &quot;auto&quot;)</code>), or with the 3rd &#39;automatic&#39;
  * argument set to true (<code>pinMode(pin, &quot;output&quot;, true)</code>).</p>
  * </li>
  * </ul>
  * 
  * @param pin 
  * @param mode 
  * @param automatic 
  * @url http://www.espruino.com/Reference#l__global_pinMode
  */
  def apply(pin: Pin, mode: js.Any, automatic: Boolean): Unit = js.native
}

