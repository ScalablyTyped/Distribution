package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.running
  - typings.fridaGum.fridaGumStrings.stopped
  - typings.fridaGum.fridaGumStrings.waiting
  - typings.fridaGum.fridaGumStrings.uninterruptible
  - typings.fridaGum.fridaGumStrings.halted
*/
trait ThreadState extends js.Object

object ThreadState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def halted: typings.fridaGum.fridaGumStrings.halted = this.cast("halted")
  @scala.inline
  def running: typings.fridaGum.fridaGumStrings.running = this.cast("running")
  @scala.inline
  def stopped: typings.fridaGum.fridaGumStrings.stopped = this.cast("stopped")
  @scala.inline
  def uninterruptible: typings.fridaGum.fridaGumStrings.uninterruptible = this.cast("uninterruptible")
  @scala.inline
  def waiting: typings.fridaGum.fridaGumStrings.waiting = this.cast("waiting")
}

