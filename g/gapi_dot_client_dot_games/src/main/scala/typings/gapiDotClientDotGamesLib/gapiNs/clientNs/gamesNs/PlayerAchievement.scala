package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayerAchievement extends js.Object {
  /**
               * The state of the achievement.
               * Possible values are:
               * - "HIDDEN" - Achievement is hidden.
               * - "REVEALED" - Achievement is revealed.
               * - "UNLOCKED" - Achievement is unlocked.
               */
  var achievementState: js.UndefOr[java.lang.String] = js.undefined
  /** The current steps for an incremental achievement. */
  var currentSteps: js.UndefOr[scala.Double] = js.undefined
  /**
               * Experience points earned for the achievement. This field is absent for achievements that have not yet been unlocked and 0 for achievements that have
               * been unlocked by testers but that are unpublished.
               */
  var experiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The current steps for an incremental achievement as a string. */
  var formattedCurrentStepsString: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievement. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp of the last modification to this achievement's state. */
  var lastUpdatedTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

