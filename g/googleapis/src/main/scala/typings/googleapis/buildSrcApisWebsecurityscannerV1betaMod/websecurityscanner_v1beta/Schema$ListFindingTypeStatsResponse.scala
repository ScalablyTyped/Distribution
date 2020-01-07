package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFindingTypeStats` method.
  */
@js.native
trait Schema$ListFindingTypeStatsResponse extends js.Object {
  /**
    * The list of FindingTypeStats returned.
    */
  var findingTypeStats: js.UndefOr[js.Array[Schema$FindingTypeStats]] = js.native
}

object Schema$ListFindingTypeStatsResponse {
  @scala.inline
  def apply(findingTypeStats: js.Array[Schema$FindingTypeStats] = null): Schema$ListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (findingTypeStats != null) __obj.updateDynamic("findingTypeStats")(findingTypeStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFindingTypeStatsResponse]
  }
}

