package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of turn-based matches.
  */
@js.native
trait Schema$TurnBasedMatchList extends js.Object {
  /**
    * The matches.
    */
  var items: js.UndefOr[js.Array[Schema$TurnBasedMatch]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$TurnBasedMatchList {
  @scala.inline
  def apply(items: js.Array[Schema$TurnBasedMatch] = null, kind: String = null, nextPageToken: String = null): Schema$TurnBasedMatchList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchList]
  }
}

