package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("clearTimeout")
@js.native
object clearTimeout extends js.Object {
  /**
  * <p>Clear the Timeout that was created with setTimeout, for example:</p>
  * <p><code>var id = setTimeout(function () { print(&#39;foo&#39;); }, 1000);</code></p>
  * <p><code>clearTimeout(id);</code></p>
  * <p>If no argument is supplied, all timers and intervals are stopped</p>
  * 
  * @param id 
  * @url http://www.espruino.com/Reference#l__global_clearTimeout
  */
  def apply(id: js.Any): Unit = js.native
}

