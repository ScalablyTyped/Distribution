package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the player associated with a score entry.
  */
@js.native
trait LeaderboardPlayer extends StObject {
  
  /**
    * Gets the game's unique identifier for the player.
    *
    * @returns The game-scoped identifier for the player.
    */
  def getID(): String | Null = js.native
  
  /**
    * Gets the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String = js.native
  
  /**
    * Returns a url to the player's public profile photo.
    *
    * @returns Url to the player's public profile photo.
    */
  def getPhoto(): String | Null = js.native
}
object LeaderboardPlayer {
  
  @scala.inline
  def apply(getID: () => String | Null, getName: () => String, getPhoto: () => String | Null): LeaderboardPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[LeaderboardPlayer]
  }
  
  @scala.inline
  implicit class LeaderboardPlayerMutableBuilder[Self <: LeaderboardPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetID(value: () => String | Null): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPhoto(value: () => String | Null): Self = StObject.set(x, "getPhoto", js.Any.fromFunction0(value))
  }
}
