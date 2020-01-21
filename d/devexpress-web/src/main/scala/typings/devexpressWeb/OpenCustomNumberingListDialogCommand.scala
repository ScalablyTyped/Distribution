package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Customize Numbered List dialog.
  */
@JSGlobal("OpenCustomNumberingListDialogCommand")
@js.native
class OpenCustomNumberingListDialogCommand () extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenCustomNumberingListDialogCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param abstractNumberingListIndex An integer value specifying index of abstract numbering list.
    */
  def execute(abstractNumberingListIndex: Double): Boolean = js.native
}

