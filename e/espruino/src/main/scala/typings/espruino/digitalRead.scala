package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("digitalRead")
@js.native
object digitalRead extends js.Object {
  /**
  * <p>Get the digital value of the given pin.</p>
  * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset pin&#39;s state to <code>&quot;input&quot;</code></p>
  * <p>If the pin argument is an array of pins (eg. <code>[A2,A1,A0]</code>) the value returned will be an number where
  * the last array element is the least significant bit, for example if <code>A0=A1=1</code> and <code>A2=0</code>, <code>digitalRead([A2,A1,A0]) == 0b011</code></p>
  * 
  * @param pin 
  * @return  
  * @url http://www.espruino.com/Reference#l__global_digitalRead
  */
  def apply(pin: Pin): Double = js.native
}

