package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dump")
@js.native
object dump extends js.Object {
  /**
  * <p>Output current interpreter state in a text form such that it can be copied to a new device</p>
  * <p>Note: &#39;Internal&#39; functions are currently not handled correctly. You will need to recreate these in the <code>onInit</code> function.</p>
  * 
  * @url http://www.espruino.com/Reference#l__global_dump
  */
  def apply(): Unit = js.native
}

