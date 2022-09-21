package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Command related API functions */
object commands {
  
  @JSImport("flashpoint-launcher", "commands")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a command to be called by name later
    * @param command Name of the command
    * @param callback Function to run when called
    * @returns Disposable to register to context.subscriptions
    */
  inline def registerCommand(command: String, callback: js.Function1[/* repeated */ Any, Any]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(command.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
