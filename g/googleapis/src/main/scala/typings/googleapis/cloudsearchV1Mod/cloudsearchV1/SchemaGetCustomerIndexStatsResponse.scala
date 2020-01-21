package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetCustomerIndexStatsResponse extends js.Object {
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaCustomerIndexStats]] = js.native
}

object SchemaGetCustomerIndexStatsResponse {
  @scala.inline
  def apply(stats: js.Array[SchemaCustomerIndexStats] = null): SchemaGetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetCustomerIndexStatsResponse]
  }
}

