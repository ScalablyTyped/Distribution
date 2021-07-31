package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a player who is connected to the current player.
  */
trait ConnectedPlayer extends StObject {
  
  /**
    * Get the id of the connected player.
    *
    * @returns The ID of the connected player
    */
  def getID(): String
  
  /**
    * Get the player's full name.
    *
    * @returns The player's full name
    */
  def getName(): String | Null
  
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): String | Null
}
object ConnectedPlayer {
  
  @scala.inline
  def apply(getID: () => String, getName: () => String | Null, getPhoto: () => String | Null): ConnectedPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[ConnectedPlayer]
  }
  
  @scala.inline
  implicit class ConnectedPlayerMutableBuilder[Self <: ConnectedPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String | Null): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPhoto(value: () => String | Null): Self = StObject.set(x, "getPhoto", js.Any.fromFunction0(value))
  }
}
