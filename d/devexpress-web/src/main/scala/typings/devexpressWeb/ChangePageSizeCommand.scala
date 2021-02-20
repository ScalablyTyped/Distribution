package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the page size.
  */
@js.native
trait ChangePageSizeCommand extends CommandBase {
  
  /**
    * Executes the ChangePageSizeCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
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
