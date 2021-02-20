package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a leaderboard update for FBInstant.updateAsync.
  */
@js.native
trait LeaderboardUpdatePayload extends StObject {
  
  /**
    * For a leaderboard update, this should be 'LEADERBOARD'. text. By default we will use a localized 'Play Now' as the button text.
    */
  var action: UpdateAction = js.native
  
  /**
    * The name of the leaderboard to feature in the update.
    */
  var name: String = js.native
  
  /**
    * Optional text message. If not specified, a localized fallback message will be provided instead.
    */
  var text: js.UndefOr[String] = js.native
}
object LeaderboardUpdatePayload {
  
  @scala.inline
  def apply(action: UpdateAction, name: String): LeaderboardUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardUpdatePayload]
  }
  
  @scala.inline
  implicit class LeaderboardUpdatePayloadMutableBuilder[Self <: LeaderboardUpdatePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: UpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
