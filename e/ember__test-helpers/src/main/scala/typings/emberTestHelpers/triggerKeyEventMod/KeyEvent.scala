package typings.emberTestHelpers.triggerKeyEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emberTestHelpers.emberTestHelpersStrings.keydown
  - typings.emberTestHelpers.emberTestHelpersStrings.keyup
  - typings.emberTestHelpers.emberTestHelpersStrings.keypress
*/
trait KeyEvent extends js.Object

object KeyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typings.emberTestHelpers.emberTestHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typings.emberTestHelpers.emberTestHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typings.emberTestHelpers.emberTestHelpersStrings.keyup = this.cast("keyup")
}

