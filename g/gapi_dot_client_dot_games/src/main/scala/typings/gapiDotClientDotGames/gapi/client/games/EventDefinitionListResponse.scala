package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinitionListResponse extends js.Object {
  /** The event definitions. */
  var items: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventDefinitionListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object EventDefinitionListResponse {
  @scala.inline
  def apply(items: js.Array[EventDefinition] = null, kind: String = null, nextPageToken: String = null): EventDefinitionListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[EventDefinitionListResponse]
  }
}

