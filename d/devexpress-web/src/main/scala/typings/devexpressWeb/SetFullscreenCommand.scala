package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the fullscreen mode.
  */
@js.native
trait SetFullscreenCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangePageMarginsCommand command. true if the command has been successfully executed; false if the command execution has failed.
    * @param show true, to enable fullscreen mode; otherwise, false.
    */
  def execute(): Boolean = js.native
  def execute(show: Boolean): Boolean = js.native
}
