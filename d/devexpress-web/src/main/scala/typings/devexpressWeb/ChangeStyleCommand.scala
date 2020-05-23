package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the selected range's style.
  */
@js.native
trait ChangeStyleCommand extends CommandBase {
  /**
    * Executes the ChangeStyleCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param style An object that contains the style settings object, or the style name.
    * @param isParagraphStyle true to apply style settings to a paragraph; otherwise, false.
    */
  def execute(style: String): Boolean = js.native
  def execute(style: String, isParagraphStyle: Boolean): Boolean = js.native
  def execute(style: StyleBase): Boolean = js.native
  def execute(style: StyleBase, isParagraphStyle: Boolean): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[StyleBase] = js.native
}

