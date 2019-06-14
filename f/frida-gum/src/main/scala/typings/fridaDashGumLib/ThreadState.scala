package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.running
  - fridaDashGumLib.fridaDashGumLibStrings.stopped
  - fridaDashGumLib.fridaDashGumLibStrings.waiting
  - fridaDashGumLib.fridaDashGumLibStrings.uninterruptible
  - fridaDashGumLib.fridaDashGumLibStrings.halted
*/
trait ThreadState extends js.Object

object ThreadState {
  @scala.inline
  def Halted: fridaDashGumLib.fridaDashGumLibStrings.halted = this.cast("halted")
  @scala.inline
  def Running: fridaDashGumLib.fridaDashGumLibStrings.running = this.cast("running")
  @scala.inline
  def Stopped: fridaDashGumLib.fridaDashGumLibStrings.stopped = this.cast("stopped")
  @scala.inline
  def Uninterruptible: fridaDashGumLib.fridaDashGumLibStrings.uninterruptible = this.cast("uninterruptible")
  @scala.inline
  def Waiting: fridaDashGumLib.fridaDashGumLibStrings.waiting = this.cast("waiting")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

