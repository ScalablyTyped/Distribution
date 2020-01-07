package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of snapshot objects.
  */
@js.native
trait Schema$SnapshotListResponse extends js.Object {
  /**
    * The snapshots.
    */
  var items: js.UndefOr[js.Array[Schema$Snapshot]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshotListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results. If there are no more
    * results, the token is omitted.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$SnapshotListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Snapshot] = null, kind: String = null, nextPageToken: String = null): Schema$SnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SnapshotListResponse]
  }
}

