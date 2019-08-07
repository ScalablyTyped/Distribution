package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a new bookmark that references the current selection.
  */
@JSGlobal("InsertBookmarkCommand")
@js.native
class InsertBookmarkCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertBookmarkCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying a name of the created bookmark.
    * @param start An integer value specifying the start position of the bookmark's range.
    * @param length An integer value specifying the length of the bookmark's range.
    */
  def execute(name: String, start: Double, length: Double): Boolean = js.native
}

