package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Strategy List Response
  */
@js.native
trait Schema$PlacementStrategiesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementStrategiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Placement strategy collection.
    */
  var placementStrategies: js.UndefOr[js.Array[Schema$PlacementStrategy]] = js.native
}

object Schema$PlacementStrategiesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    placementStrategies: js.Array[Schema$PlacementStrategy] = null
  ): Schema$PlacementStrategiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (placementStrategies != null) __obj.updateDynamic("placementStrategies")(placementStrategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlacementStrategiesListResponse]
  }
}

