package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the case for each character - upper case becomes lower, lower case becomes upper.
  */
@JSGlobal("ToggleTextCaseCommand")
@js.native
class ToggleTextCaseCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTextCaseCommand command.
    */
  def execute(): Boolean = js.native
}

