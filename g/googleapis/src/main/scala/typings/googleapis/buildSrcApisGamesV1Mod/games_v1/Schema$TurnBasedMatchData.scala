package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match data object.
  */
@js.native
trait Schema$TurnBasedMatchData extends js.Object {
  /**
    * The byte representation of the data (limited to 128 kB), as a
    * Base64-encoded string with the URL_SAFE encoding option.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * True if this match has data available but it wasn&#39;t returned in a
    * list response; fetching the match individually will retrieve this data.
    */
  var dataAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchData.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TurnBasedMatchData {
  @scala.inline
  def apply(data: String = null, dataAvailable: js.UndefOr[Boolean] = js.undefined, kind: String = null): Schema$TurnBasedMatchData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dataAvailable)) __obj.updateDynamic("dataAvailable")(dataAvailable.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchData]
  }
}

