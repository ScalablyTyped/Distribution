package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change the page size.
  */
@JSGlobal("ChangePageSizeCommand")
@js.native
class ChangePageSizeCommand () extends CommandBase {
  /**
    * Executes the ChangePageSizeCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param size The page size.
    * @param width The page size object or the page width.
    * @param height The page height.
    */
  def execute(width: Double): Boolean = js.native
  def execute(width: Double, height: Double): Boolean = js.native
  def execute(width: Size): Boolean = js.native
  def execute(width: Size, height: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Size] = js.native
}

