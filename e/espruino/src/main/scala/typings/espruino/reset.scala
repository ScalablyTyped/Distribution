package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("reset")
@js.native
object reset extends js.Object {
  /**
  * <p>Reset the interpreter - clear program memory in RAM, and do not load a saved program from flash. This does NOT reset the underlying hardware (which allows you to reset the device without it disconnecting from USB).</p>
  * <p>This command only executes when the Interpreter returns to the Idle state - for instance <code>a=1;reset();a=2;</code> will still leave &#39;a&#39; as undefined.</p>
  * <p>The safest way to do a full reset is to hit the reset button.</p>
  * <p>If <code>reset()</code> is called with no arguments, it will reset the board&#39;s state in
  * RAM but will not reset the state in flash. When next powered on (or when
  * <code>load()</code> is called) the board will load the previously saved code.</p>
  * <p>Calling <code>reset(true)</code> will cause <em>all saved code in flash memory to
  * be cleared as well</em>.</p>
  * 
  * @param clearFlash 
  * @url http://www.espruino.com/Reference#l__global_reset
  */
  def apply(clearFlash: Boolean): Unit = js.native
}

