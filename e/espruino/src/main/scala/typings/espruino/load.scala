package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("load")
@js.native
object load extends js.Object {
  /**
  * <p>Restart and load the program out of flash - this has an effect similar to
  * completely rebooting Espruino (power off/power on), but without actually
  * performing a full reset of the hardware.</p>
  * <p>This command only executes when the Interpreter returns to the Idle state - for
  * instance <code>a=1;load();a=2;</code> will still leave &#39;a&#39; as undefined (or what it was
  * set to in the saved program).</p>
  * <p>Espruino will resume from where it was when you last typed <code>save()</code>.
  * If you want code to be executed right after loading (for instance to initialise
  * devices connected to Espruino), add an <code>init</code> event handler to <code>E</code> with
  * <code>E.on(&#39;init&#39;, function() { ... your_code ... });</code>. This will then be automatically
  * executed by Espruino every time it starts.</p>
  * 
  * @url http://www.espruino.com/Reference#l__global_load
  */
  def apply(): Unit = js.native
}

