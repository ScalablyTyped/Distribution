package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the metagame config resource
  */
@js.native
trait Schema$MetagameConfig extends js.Object {
  /**
    * Current version of the metagame configuration data. When this data is
    * updated, the version number will be increased by one.
    */
  var currentVersion: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#metagameConfig.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of player levels.
    */
  var playerLevels: js.UndefOr[js.Array[Schema$PlayerLevel]] = js.native
}

object Schema$MetagameConfig {
  @scala.inline
  def apply(
    currentVersion: Int | Double = null,
    kind: String = null,
    playerLevels: js.Array[Schema$PlayerLevel] = null
  ): Schema$MetagameConfig = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playerLevels != null) __obj.updateDynamic("playerLevels")(playerLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MetagameConfig]
  }
}

