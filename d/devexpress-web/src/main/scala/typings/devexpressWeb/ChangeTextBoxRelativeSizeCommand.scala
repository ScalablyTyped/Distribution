package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a text box' relative size settings.
  */
@js.native
trait ChangeTextBoxRelativeSizeCommand extends ChangeFloatingObjectPropertyCommandBase[TextBoxRelativeSizeSettings]

object ChangeTextBoxRelativeSizeCommand {
  @scala.inline
  def apply(
    execute: TextBoxRelativeSizeSettings => Boolean,
    getState: () => CommandState[TextBoxRelativeSizeSettings]
  ): ChangeTextBoxRelativeSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTextBoxRelativeSizeCommand]
  }
}

