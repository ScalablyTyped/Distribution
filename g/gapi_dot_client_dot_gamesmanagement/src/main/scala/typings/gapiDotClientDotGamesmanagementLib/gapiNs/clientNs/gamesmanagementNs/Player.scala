package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

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
  var experienceInfo: js.UndefOr[GamesPlayerExperienceInfoResource] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#player. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Details about the last time this player played a multiplayer game with the currently authenticated player. Populated for PLAYED_WITH player collection
    * members.
    */
  var lastPlayedWith: js.UndefOr[GamesPlayedResource] = js.undefined
  /** An object representation of the individual components of the player's name. For some players, these fields may not be present. */
  var name: js.UndefOr[gapiDotClientDotGamesmanagementLib.Anon_FamilyName] = js.undefined
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

object Player {
  @scala.inline
  def apply(
    avatarImageUrl: java.lang.String = null,
    bannerUrlLandscape: java.lang.String = null,
    bannerUrlPortrait: java.lang.String = null,
    displayName: java.lang.String = null,
    experienceInfo: GamesPlayerExperienceInfoResource = null,
    kind: java.lang.String = null,
    lastPlayedWith: GamesPlayedResource = null,
    name: gapiDotClientDotGamesmanagementLib.Anon_FamilyName = null,
    originalPlayerId: java.lang.String = null,
    playerId: java.lang.String = null,
    profileSettings: ProfileSettings = null,
    title: java.lang.String = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl)
    if (bannerUrlLandscape != null) __obj.updateDynamic("bannerUrlLandscape")(bannerUrlLandscape)
    if (bannerUrlPortrait != null) __obj.updateDynamic("bannerUrlPortrait")(bannerUrlPortrait)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (experienceInfo != null) __obj.updateDynamic("experienceInfo")(experienceInfo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastPlayedWith != null) __obj.updateDynamic("lastPlayedWith")(lastPlayedWith)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalPlayerId != null) __obj.updateDynamic("originalPlayerId")(originalPlayerId)
    if (playerId != null) __obj.updateDynamic("playerId")(playerId)
    if (profileSettings != null) __obj.updateDynamic("profileSettings")(profileSettings)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Player]
  }
}

