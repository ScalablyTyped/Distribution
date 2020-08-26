package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's relative position.
  */
@js.native
trait ChangeFloatingObjectRelativePositionCommand extends ChangeFloatingObjectPropertyCommandBase[FloatingObjectRelativePositionSettings]

object ChangeFloatingObjectRelativePositionCommand {
  @scala.inline
  def apply(
    execute: FloatingObjectRelativePositionSettings => Boolean,
    getState: () => CommandState[FloatingObjectRelativePositionSettings]
  ): ChangeFloatingObjectRelativePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectRelativePositionCommand]
  }
}

