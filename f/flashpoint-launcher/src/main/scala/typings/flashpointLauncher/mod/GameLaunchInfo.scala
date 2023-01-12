package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Info type passed to onWillLaunch events */
trait GameLaunchInfo extends StObject {
  
  var activeData: js.UndefOr[GameData_] = js.undefined
  
  var game: Game
  
  var launchInfo: LaunchInfo
}
object GameLaunchInfo {
  
  inline def apply(game: Game, launchInfo: LaunchInfo): GameLaunchInfo = {
    val __obj = js.Dynamic.literal(game = game.asInstanceOf[js.Any], launchInfo = launchInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameLaunchInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameLaunchInfo] (val x: Self) extends AnyVal {
    
    inline def setActiveData(value: GameData_): Self = StObject.set(x, "activeData", value.asInstanceOf[js.Any])
    
    inline def setActiveDataUndefined: Self = StObject.set(x, "activeData", js.undefined)
    
    inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setLaunchInfo(value: LaunchInfo): Self = StObject.set(x, "launchInfo", value.asInstanceOf[js.Any])
  }
}
