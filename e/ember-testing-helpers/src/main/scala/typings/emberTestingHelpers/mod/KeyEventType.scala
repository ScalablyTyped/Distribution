package typings.emberTestingHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emberTestingHelpers.emberTestingHelpersStrings.keydown
  - typings.emberTestingHelpers.emberTestingHelpersStrings.keyup
  - typings.emberTestingHelpers.emberTestingHelpersStrings.keypress
*/
trait KeyEventType extends js.Object

object KeyEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typings.emberTestingHelpers.emberTestingHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typings.emberTestingHelpers.emberTestingHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typings.emberTestingHelpers.emberTestingHelpersStrings.keyup = this.cast("keyup")
}

