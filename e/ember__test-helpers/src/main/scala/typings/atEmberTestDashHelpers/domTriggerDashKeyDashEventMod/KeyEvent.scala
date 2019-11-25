package typings.atEmberTestDashHelpers.domTriggerDashKeyDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keydown
  - typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keyup
  - typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keypress
*/
trait KeyEvent extends js.Object

object KeyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keydown: typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typings.atEmberTestDashHelpers.atEmberTestDashHelpersStrings.keyup = this.cast("keyup")
}

