package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to navigate to the document bookmark or URI (uniform resource identifier) specified for the hyperlink.
  */
trait OpenHyperlinkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenHyperlinkCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object OpenHyperlinkCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[SimpleCommandState]): OpenHyperlinkCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getState")(getState)
    __obj.asInstanceOf[OpenHyperlinkCommand]
  }
}

