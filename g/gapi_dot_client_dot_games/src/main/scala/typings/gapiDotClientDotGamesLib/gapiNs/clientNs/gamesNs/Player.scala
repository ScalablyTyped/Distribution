package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  /** The base URL for the image that represents the player. */
  var avatarImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The url to the landscape mode player banner image. */
  var bannerUrlLandscape: js.UndefOr[java.lang.String] = js.undefined
  /** The url to the portrait mode player banner image. */
  var bannerUrlPortrait: js.UndefOr[java.lang.String] = js.undefined
  /** The name to display for the player. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** An object to represent Play Game experience information for the player. */
  var experienceInfo: js.UndefOr[PlayerExperienceInfo] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#player. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Details about the last time this player played a multiplayer game with the currently authenticated player. Populated for PLAYED_WITH player collection
    * members.
    */
  var lastPlayedWith: js.UndefOr[Played] = js.undefined
  /** An object representation of the individual components of the player's name. For some players, these fields may not be present. */
  var name: js.UndefOr[gapiDotClientDotGamesLib.Anon_FamilyName] = js.undefined
  /**
    * The player ID that was used for this player the first time they signed into the game in question. This is only populated for calls to player.get for
    * the requesting player, only if the player ID has subsequently changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the player. */
  var playerId: js.UndefOr[java.lang.String] = js.undefined
  /** The player's profile settings. Controls whether or not the player's profile is visible to other players. */
  var profileSettings: js.UndefOr[ProfileSettings] = js.undefined
  /** The player's title rewarded for their game activities. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

