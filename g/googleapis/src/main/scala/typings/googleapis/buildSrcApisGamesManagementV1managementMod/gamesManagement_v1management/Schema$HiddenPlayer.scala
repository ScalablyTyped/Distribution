package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the HiddenPlayer resource.
  */
@js.native
trait Schema$HiddenPlayer extends js.Object {
  /**
    * The time this player was hidden.
    */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayer.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The player information.
    */
  var player: js.UndefOr[Schema$Player] = js.native
}

object Schema$HiddenPlayer {
  @scala.inline
  def apply(hiddenTimeMillis: String = null, kind: String = null, player: Schema$Player = null): Schema$HiddenPlayer = {
    val __obj = js.Dynamic.literal()
    if (hiddenTimeMillis != null) __obj.updateDynamic("hiddenTimeMillis")(hiddenTimeMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HiddenPlayer]
  }
}

