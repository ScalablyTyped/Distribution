package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  def getID(): java.lang.String
  /**
    * Get the player's full name.
    *
    * @returns The player's full name
    */
  def getName(): java.lang.String | scala.Null
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): java.lang.String | scala.Null
}

object ConnectedPlayer {
  @scala.inline
  def apply(
    getID: () => java.lang.String,
    getName: () => java.lang.String | scala.Null,
    getPhoto: () => java.lang.String | scala.Null
  ): ConnectedPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
  
    __obj.asInstanceOf[ConnectedPlayer]
  }
}

