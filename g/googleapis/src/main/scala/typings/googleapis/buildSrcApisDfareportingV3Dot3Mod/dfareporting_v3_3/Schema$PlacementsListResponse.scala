package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement List Response
  */
@js.native
trait Schema$PlacementsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Placement collection.
    */
  var placements: js.UndefOr[js.Array[Schema$Placement]] = js.native
}

object Schema$PlacementsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, placements: js.Array[Schema$Placement] = null): Schema$PlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (placements != null) __obj.updateDynamic("placements")(placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlacementsListResponse]
  }
}

