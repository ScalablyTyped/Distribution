package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinition extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the achievement. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Experience points which will be earned when unlocking this achievement. */
  var experiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The total steps for an incremental achievement as a string. */
  var formattedTotalSteps: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the revealed icon image being returned is a default image, or is provided by the game. */
  var isRevealedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the unlocked icon image being returned is a default image, or is game-provided. */
  var isUnlockedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinition. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the achievement. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The image URL for the revealed achievement icon. */
  var revealedIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The total steps for an incremental achievement. */
  var totalSteps: js.UndefOr[scala.Double] = js.undefined
  /** The image URL for the unlocked achievement icon. */
  var unlockedIconUrl: js.UndefOr[java.lang.String] = js.undefined
}

