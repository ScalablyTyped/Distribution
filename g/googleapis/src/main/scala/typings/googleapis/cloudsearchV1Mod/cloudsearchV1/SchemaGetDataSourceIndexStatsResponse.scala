package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetDataSourceIndexStatsResponse extends js.Object {
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[SchemaDataSourceIndexStats]] = js.native
}

object SchemaGetDataSourceIndexStatsResponse {
  @scala.inline
  def apply(stats: js.Array[SchemaDataSourceIndexStats] = null): SchemaGetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetDataSourceIndexStatsResponse]
  }
}

