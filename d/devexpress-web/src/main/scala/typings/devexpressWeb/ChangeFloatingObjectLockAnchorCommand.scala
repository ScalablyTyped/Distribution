package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to lock a floating object's anchor.
  */
trait ChangeFloatingObjectLockAnchorCommand extends ChangeFloatingObjectPropertyCommandBase[Boolean]

object ChangeFloatingObjectLockAnchorCommand {
  @scala.inline
  def apply(execute: Boolean => Boolean, getState: () => CommandState[Boolean]): ChangeFloatingObjectLockAnchorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectLockAnchorCommand]
  }
}

