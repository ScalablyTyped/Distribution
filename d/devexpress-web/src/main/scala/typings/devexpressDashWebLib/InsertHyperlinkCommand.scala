package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a hyperlink at the current position in the document.
  */
trait InsertHyperlinkCommand extends CommandBase {
  /**
    * Executes the InsertHyperlinkCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  def execute(settings: HyperlinkSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

