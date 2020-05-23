package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to rotate a floating object.
  */
trait ChangeFloatingObjectRotationCommand extends ChangeFloatingObjectPropertyCommandBase[Double]

object ChangeFloatingObjectRotationCommand {
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => CommandState[Double]): ChangeFloatingObjectRotationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectRotationCommand]
  }
}

