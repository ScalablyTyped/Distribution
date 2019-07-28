package typings.facebookDashInstantDashGames.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information about a player who is connected to the current player.
  */
trait ConnectedPlayer extends js.Object {
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
}

