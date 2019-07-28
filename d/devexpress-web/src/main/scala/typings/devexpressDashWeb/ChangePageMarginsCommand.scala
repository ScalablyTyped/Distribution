package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change page margin settings.
  */
@js.native
trait ChangePageMarginsCommand extends CommandBase {
  /**
    * Executes the ChangePageMarginsCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param left An integer number specifying left margin of the page in twips.
    * @param top An integer number specifying top margin of the page in twips.
    * @param right An integer number specifying right margin of the page in twips.
    * @param bottom An integer number specifying bottom margin of the page in twips.
    */
  def execute(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Executes the ChangePageMarginsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param margins A Margins object specifying page margin settings.
    */
  def execute(margins: Margins): Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

