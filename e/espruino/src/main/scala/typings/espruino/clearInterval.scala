package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("clearInterval")
@js.native
object clearInterval extends js.Object {
  /**
  * <p>Clear the Interval that was created with setInterval, for example:</p>
  * <p><code>var id = setInterval(function () { print(&#39;foo&#39;); }, 1000);</code></p>
  * <p><code>clearInterval(id);</code></p>
  * <p>If no argument is supplied, all timers and intervals are stopped</p>
  * 
  * @param id 
  * @url http://www.espruino.com/Reference#l__global_clearInterval
  */
  def apply(id: js.Any): Unit = js.native
}

