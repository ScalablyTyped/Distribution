package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a player who is a participant in a real-time match.
  *
  * @since 7.1
  */
trait LiveMatchPlayer extends StObject {
  
  /**
    * Get the id of the live match player.
    *
    * @returns The ID of the live match player.
    */
  def getID(): String
  
  /**
    * Get the player's display name.
    *
    * @returns The player's display name.
    */
  def getName(): String | Null
  
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo.
    */
  def getPhoto(): String | Null
}
object LiveMatchPlayer {
  
  inline def apply(getID: () => String, getName: () => String | Null, getPhoto: () => String | Null): LiveMatchPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[LiveMatchPlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveMatchPlayer] (val x: Self) extends AnyVal {
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String | Null): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetPhoto(value: () => String | Null): Self = StObject.set(x, "getPhoto", js.Any.fromFunction0(value))
  }
}
