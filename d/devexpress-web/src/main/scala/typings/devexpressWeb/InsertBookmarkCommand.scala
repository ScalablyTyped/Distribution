package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a new bookmark that references the current selection.
  */
trait InsertBookmarkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertBookmarkCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying a name of the created bookmark.
    * @param start An integer value specifying the start position of the bookmark's range.
    * @param length An integer value specifying the length of the bookmark's range.
    */
  def execute(name: String, start: Double, length: Double): Boolean
}

object InsertBookmarkCommand {
  @scala.inline
  def apply(execute: (String, Double, Double) => Boolean, getState: () => SimpleCommandState): InsertBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertBookmarkCommand]
  }
}

