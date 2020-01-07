package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for sending a turn-based match data object.
  */
@js.native
trait Schema$TurnBasedMatchDataRequest extends js.Object {
  /**
    * The byte representation of the data (limited to 128 kB), as a
    * Base64-encoded string with the URL_SAFE encoding option.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchDataRequest.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TurnBasedMatchDataRequest {
  @scala.inline
  def apply(data: String = null, kind: String = null): Schema$TurnBasedMatchDataRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchDataRequest]
  }
}

