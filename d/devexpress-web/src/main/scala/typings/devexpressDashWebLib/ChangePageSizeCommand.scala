package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the page size.
  */
@js.native
trait ChangePageSizeCommand extends CommandBase {
  /**
    * Executes the ChangePageSizeCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param size A Size object specifying the page size settings.
    */
  def execute(size: Size): scala.Boolean = js.native
  /**
    * Executes the ChangePageSizeCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param width An integer number specifying width of the page in twips.
    * @param height An integer number specifying height of the page in twips.
    */
  def execute(width: scala.Double, height: scala.Double): scala.Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

