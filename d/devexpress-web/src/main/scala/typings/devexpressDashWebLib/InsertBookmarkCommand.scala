package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a new bookmark that references the current selection.
  */
trait InsertBookmarkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertBookmarkCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param name A string value specifying a name of the created bookmark.
    * @param start An integer value specifying the start position of the bookmark's range.
    * @param length An integer value specifying the length of the bookmark's range.
    */
  def execute(name: java.lang.String, start: scala.Double, length: scala.Double): scala.Boolean
}

object InsertBookmarkCommand {
  @scala.inline
  def apply(
    execute: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Boolean],
    getState: js.Function0[SimpleCommandState]
  ): InsertBookmarkCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[InsertBookmarkCommand]
  }
}

