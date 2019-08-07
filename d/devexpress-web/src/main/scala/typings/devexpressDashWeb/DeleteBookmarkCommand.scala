package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete a specific bookmark.
  */
@JSGlobal("DeleteBookmarkCommand")
@js.native
class DeleteBookmarkCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying a name of the deleted bookmark.
    */
  def execute(name: String): Boolean = js.native
}

