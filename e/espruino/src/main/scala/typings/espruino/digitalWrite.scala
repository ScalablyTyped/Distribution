package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("digitalWrite")
@js.native
object digitalWrite extends js.Object {
  def apply(pin: Pin, value: Boolean): Unit = js.native
  /**
  * <p>Set the digital value of the given pin.</p>
  * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset pin&#39;s state to <code>&quot;output&quot;</code></p>
  * <p>If pin argument is an array of pins (eg. <code>[A2,A1,A0]</code>) the value argument will be treated
  * as an array of bits where the last array element is the least significant bit.</p>
  * <p>In this case, pin values are set least significant bit first (from the right-hand side
  * of the array of pins). This means you can use the same pin multiple times, for
  * example <code>digitalWrite([A1,A1,A0,A0],0b0101)</code> would pulse A0 followed by A1.</p>
  * 
  * @param pin 
  * @param value 
  * @url http://www.espruino.com/Reference#l__global_digitalWrite
  */
  def apply(pin: Pin, value: Double): Unit = js.native
}

