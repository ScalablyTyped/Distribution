package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("analogRead")
@js.native
object analogRead extends js.Object {
  /**
  * <p>Get the analog value of the given pin</p>
  * <p>This is different to Arduino which only returns an integer between 0 and 1023</p>
  * <p>However only pins connected to an ADC will work (see the datasheet)</p>
  * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset pin&#39;s state to <code>&quot;analog&quot;</code></p>
  * 
  * @param pin 
  * @return  
  * @url http://www.espruino.com/Reference#l__global_analogRead
  */
  def apply(pin: Pin): Double = js.native
}

