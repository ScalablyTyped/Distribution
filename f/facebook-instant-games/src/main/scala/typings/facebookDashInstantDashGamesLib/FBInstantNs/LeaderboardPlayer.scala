package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the player associated with a score entry.
  */
trait LeaderboardPlayer extends js.Object {
  /**
    * Gets the game's unique identifier for the player.
    *
    * @returns The game-scoped identifier for the player.
    */
  def getID(): java.lang.String | scala.Null
  /**
    * Gets the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): java.lang.String
  /**
    * Returns a url to the player's public profile photo.
    *
    * @returns Url to the player's public profile photo.
    */
  def getPhoto(): java.lang.String | scala.Null
}

object LeaderboardPlayer {
  @scala.inline
  def apply(
    getID: () => java.lang.String | scala.Null,
    getName: () => java.lang.String,
    getPhoto: () => java.lang.String | scala.Null
  ): LeaderboardPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
  
    __obj.asInstanceOf[LeaderboardPlayer]
  }
}

