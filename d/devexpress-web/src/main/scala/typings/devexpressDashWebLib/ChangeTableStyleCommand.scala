package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected table's style.
  */
@js.native
trait ChangeTableStyleCommand extends CommandBase {
  /**
    * Executes the ChangeTableStyleCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param styleName A string specifying the name of style applying to the table.
    */
  def execute(styleName: java.lang.String): scala.Boolean = js.native
  /**
    * Executes the ChangeTableStyleCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param style A TableStyle object specifying the style applying to the table.
    */
  def execute(style: TableStyle): scala.Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

