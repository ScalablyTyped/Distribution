package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets a command to navigate to the specified bookmark in the document.
  */
@JSGlobal("GoToBookmarkCommand")
@js.native
class GoToBookmarkCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the GoToBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying the bookmark's name
    */
  def execute(name: String): Boolean = js.native
}

