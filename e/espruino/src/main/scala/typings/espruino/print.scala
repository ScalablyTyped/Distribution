package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("print")
@js.native
object print extends js.Object {
  /**
  * <p>Print the supplied string(s) to the console</p>
  * <p> <strong>Note:</strong> If you&#39;re connected to a computer (not a wall adaptor) via USB but <strong>you are not running a terminal app</strong> then when you print data Espruino may pause execution and wait until the computer requests the data it is trying to print.</p>
  * 
  * @param text 
  * @url http://www.espruino.com/Reference#l__global_print
  */
  def apply(text: js.Any): Unit = js.native
}

