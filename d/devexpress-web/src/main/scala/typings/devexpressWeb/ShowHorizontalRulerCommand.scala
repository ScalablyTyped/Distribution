package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the horizontal ruler's visibility.
  */
@js.native
trait ShowHorizontalRulerCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ShowHorizontalRulerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param show true, to show the horizontal ruler; otherwise, false.
    */
  def execute(): Boolean = js.native
  def execute(show: Boolean): Boolean = js.native
}
