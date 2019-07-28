package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the Rich Edit's document view type.
  */
@js.native
trait ChangeViewTypeCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ChangeViewTypeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: String): Boolean = js.native
  /**
    * Executes the ChangeViewTypeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: js.Any): Boolean = js.native
}

