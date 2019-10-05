package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetagameConfig extends js.Object {
  /** Current version of the metagame configuration data. When this data is updated, the version number will be increased by one. */
  var currentVersion: js.UndefOr[Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#metagameConfig. */
  var kind: js.UndefOr[String] = js.undefined
  /** The list of player levels. */
  var playerLevels: js.UndefOr[js.Array[PlayerLevel]] = js.undefined
}

object MetagameConfig {
  @scala.inline
  def apply(
    currentVersion: Int | Double = null,
    kind: String = null,
    playerLevels: js.Array[PlayerLevel] = null
  ): MetagameConfig = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (playerLevels != null) __obj.updateDynamic("playerLevels")(playerLevels)
    __obj.asInstanceOf[MetagameConfig]
  }
}

