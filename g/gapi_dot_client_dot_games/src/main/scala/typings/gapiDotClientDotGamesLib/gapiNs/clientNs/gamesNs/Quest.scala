package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quest extends js.Object {
  /** The timestamp at which the user accepted the quest in milliseconds since the epoch in UTC. Only present if the player has accepted the quest. */
  var acceptedTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the application this quest is part of. */
  var applicationId: js.UndefOr[java.lang.String] = js.undefined
  /** The banner image URL for the quest. */
  var bannerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the quest. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which the quest ceases to be active in milliseconds since the epoch in UTC. */
  var endTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The icon image URL for the quest. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the quest. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the banner image being returned is a default image, or is game-provided. */
  var isDefaultBannerUrl: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isDefaultIconUrl: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#quest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timestamp at which the quest was last updated by the user in milliseconds since the epoch in UTC. Only present if the player has accepted the
    * quest.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The quest milestones. */
  var milestones: js.UndefOr[js.Array[QuestMilestone]] = js.undefined
  /** The name of the quest. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which the user should be notified that the quest will end soon in milliseconds since the epoch in UTC. */
  var notifyTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which the quest becomes active in milliseconds since the epoch in UTC. */
  var startTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the quest.
    * Possible values are:
    * - "UPCOMING": The quest is upcoming. The user can see the quest, but cannot accept it until it is open.
    * - "OPEN": The quest is currently open and may be accepted at this time.
    * - "ACCEPTED": The user is currently participating in this quest.
    * - "COMPLETED": The user has completed the quest.
    * - "FAILED": The quest was attempted but was not completed before the deadline expired.
    * - "EXPIRED": The quest has expired and was not accepted.
    * - "DELETED": The quest should be deleted from the local database.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

