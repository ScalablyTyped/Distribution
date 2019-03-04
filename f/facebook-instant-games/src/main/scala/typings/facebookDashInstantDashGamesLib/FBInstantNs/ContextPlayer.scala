package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information about a player who is in the context that the current player is playing in.
  */
trait ContextPlayer extends js.Object {
  /**
    * Get the id of the context player.
    *
    * @returns The ID of the context player
    */
  def getID(): java.lang.String
  /**
    * Get the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): java.lang.String | scala.Null
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): java.lang.String | scala.Null
}

object ContextPlayer {
  @scala.inline
  def apply(
    getID: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String | scala.Null],
    getPhoto: js.Function0[java.lang.String | scala.Null]
  ): ContextPlayer = {
    val __obj = js.Dynamic.literal(getID = getID, getName = getName, getPhoto = getPhoto)
  
    __obj.asInstanceOf[ContextPlayer]
  }
}

