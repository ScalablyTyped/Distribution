package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalApp extends StObject {
  
  /** Path to the application that runs the additional application */
  var applicationPath: String
  
  /**
    * If the additional application should run before the game.
    * (If true, this will always run when the game is launched)
    * (If false, this will only run when specifically launched)
    */
  var autoRunBefore: Boolean
  
  /** ID of the additional application (unique identifier) */
  var id: String
  
  /** Command line argument(s) passed to the application to launch the game */
  var launchCommand: String
  
  /** Name of the additional application */
  var name: String
  
  /** Parent of this add app */
  var parentGame: Game
  
  /** Wait for this to exit before the Game will launch (if starting before launch) */
  var waitForExit: Boolean
}
object AdditionalApp {
  
  inline def apply(
    applicationPath: String,
    autoRunBefore: Boolean,
    id: String,
    launchCommand: String,
    name: String,
    parentGame: Game,
    waitForExit: Boolean
  ): AdditionalApp = {
    val __obj = js.Dynamic.literal(applicationPath = applicationPath.asInstanceOf[js.Any], autoRunBefore = autoRunBefore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchCommand = launchCommand.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentGame = parentGame.asInstanceOf[js.Any], waitForExit = waitForExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalApp] (val x: Self) extends AnyVal {
    
    inline def setApplicationPath(value: String): Self = StObject.set(x, "applicationPath", value.asInstanceOf[js.Any])
    
    inline def setAutoRunBefore(value: Boolean): Self = StObject.set(x, "autoRunBefore", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLaunchCommand(value: String): Self = StObject.set(x, "launchCommand", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentGame(value: Game): Self = StObject.set(x, "parentGame", value.asInstanceOf[js.Any])
    
    inline def setWaitForExit(value: Boolean): Self = StObject.set(x, "waitForExit", value.asInstanceOf[js.Any])
  }
}
