package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a leaderboard update for FBInstant.updateAsync.
  */
trait LeaderboardUpdatePayload extends StObject {
  
  /**
    * For a leaderboard update, this should be 'LEADERBOARD'. text. By default we will use a localized 'Play Now' as the button text.
    */
  var action: UpdateAction
  
  /**
    * The name of the leaderboard to feature in the update.
    */
  var name: String
  
  /**
    * Optional text message. If not specified, a localized fallback message will be provided instead.
    */
  var text: js.UndefOr[String] = js.undefined
}
object LeaderboardUpdatePayload {
  
  inline def apply(action: UpdateAction, name: String): LeaderboardUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardUpdatePayload]
  }
  
  extension [Self <: LeaderboardUpdatePayload](x: Self) {
    
    inline def setAction(value: UpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
