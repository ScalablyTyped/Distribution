package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("save")
@js.native
object save extends js.Object {
  /**
  * <p>Save program memory into flash. It will then be loaded automatically every time
  * Espruino powers on or is hard-reset.</p>
  * <p>This command only executes when the Interpreter returns to the Idle state - for
  * instance <code>a=1;save();a=2;</code> will save &#39;a&#39; as 2.</p>
  * <p>When Espruino powers on, it will resume from where it was when you typed <code>save()</code>.
  * If you want code to be executed right after loading (for instance to initialise
  * devices connected to Espruino), add an <code>init</code> event handler to <code>E</code> with
  * <code>E.on(&#39;init&#39;, function() { ... your_code ... });</code>. This will then be automatically
  * executed by Espruino every time it starts.</p>
  * <p>In order to stop the program saved with this command being loaded automatically,
  * hold down Button 1 while also pressing reset. On some boards, Button 1 enters
  * bootloader mode, so you will need to press Reset with Button 1 raised, and then
  * hold Button 1 down a fraction of a second later.</p>
  * 
  * @url http://www.espruino.com/Reference#l__global_save
  */
  def apply(): Unit = js.native
}

