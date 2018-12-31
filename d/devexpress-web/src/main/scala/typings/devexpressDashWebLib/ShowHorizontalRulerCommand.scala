package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the horizontal ruler's visibility.
  */
@js.native
trait ShowHorizontalRulerCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowHorizontalRulerCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean = js.native
  /**
    * Executes the ShowHorizontalRulerCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param show true to display the horizontal ruler, false to hide the horizontal ruler.
    */
  def execute(show: scala.Boolean): scala.Boolean = js.native
}

