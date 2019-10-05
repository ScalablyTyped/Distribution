package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("changeInterval")
@js.native
object changeInterval extends js.Object {
  /**
  * <p>Change the Interval on a callback created with setInterval, for example:</p>
  * <p><code>var id = setInterval(function () { print(&#39;foo&#39;); }, 1000); // every second</code></p>
  * <p><code>changeInterval(id, 1500); // now runs every 1.5 seconds</code></p>
  * <p>This takes effect immediately and resets the timeout, so in the example above,
  * regardless of when you call <code>changeInterval</code>, the next interval will occur 1500ms
  * after it.</p>
  * 
  * @param id 
  * @param time 
  * @url http://www.espruino.com/Reference#l__global_changeInterval
  */
  def apply(id: js.Any, time: Double): Unit = js.native
}

