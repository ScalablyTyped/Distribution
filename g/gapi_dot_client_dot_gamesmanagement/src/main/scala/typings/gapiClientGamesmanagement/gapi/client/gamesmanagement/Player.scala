package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClientGamesmanagement.anon.FamilyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  /** The base URL for the image that represents the player. */
  var avatarImageUrl: js.UndefOr[String] = js.undefined
  /** The url to the landscape mode player banner image. */
  var bannerUrlLandscape: js.UndefOr[String] = js.undefined
  /** The url to the portrait mode player banner image. */
  var bannerUrlPortrait: js.UndefOr[String] = js.undefined
  /** The name to display for the player. */
  var displayName: js.UndefOr[String] = js.undefined
  /** An object to represent Play Game experience information for the player. */
  var experienceInfo: js.UndefOr[GamesPlayerExperienceInfoResource] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#player. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Details about the last time this player played a multiplayer game with the currently authenticated player. Populated for PLAYED_WITH player collection
    * members.
    */
  var lastPlayedWith: js.UndefOr[GamesPlayedResource] = js.undefined
  /** An object representation of the individual components of the player's name. For some players, these fields may not be present. */
  var name: js.UndefOr[FamilyName] = js.undefined
  /**
    * The player ID that was used for this player the first time they signed into the game in question. This is only populated for calls to player.get for
    * the requesting player, only if the player ID has subsequently changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[String] = js.undefined
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.undefined
  /** The player's profile settings. Controls whether or not the player's profile is visible to other players. */
  var profileSettings: js.UndefOr[ProfileSettings] = js.undefined
  /** The player's title rewarded for their game activities. */
  var title: js.UndefOr[String] = js.undefined
}

object Player {
  @scala.inline
  def apply(
    avatarImageUrl: String = null,
    bannerUrlLandscape: String = null,
    bannerUrlPortrait: String = null,
    displayName: String = null,
    experienceInfo: GamesPlayerExperienceInfoResource = null,
    kind: String = null,
    lastPlayedWith: GamesPlayedResource = null,
    name: FamilyName = null,
    originalPlayerId: String = null,
    playerId: String = null,
    profileSettings: ProfileSettings = null,
    title: String = null
  ): Player = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl.asInstanceOf[js.Any])
    if (bannerUrlLandscape != null) __obj.updateDynamic("bannerUrlLandscape")(bannerUrlLandscape.asInstanceOf[js.Any])
    if (bannerUrlPortrait != null) __obj.updateDynamic("bannerUrlPortrait")(bannerUrlPortrait.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (experienceInfo != null) __obj.updateDynamic("experienceInfo")(experienceInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastPlayedWith != null) __obj.updateDynamic("lastPlayedWith")(lastPlayedWith.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalPlayerId != null) __obj.updateDynamic("originalPlayerId")(originalPlayerId.asInstanceOf[js.Any])
    if (playerId != null) __obj.updateDynamic("playerId")(playerId.asInstanceOf[js.Any])
    if (profileSettings != null) __obj.updateDynamic("profileSettings")(profileSettings.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

