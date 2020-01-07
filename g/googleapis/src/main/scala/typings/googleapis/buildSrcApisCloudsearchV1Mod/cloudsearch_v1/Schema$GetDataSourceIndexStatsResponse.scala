package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetDataSourceIndexStatsResponse extends js.Object {
  /**
    * Summary of indexed item counts, one for each day in the requested range.
    */
  var stats: js.UndefOr[js.Array[Schema$DataSourceIndexStats]] = js.native
}

object Schema$GetDataSourceIndexStatsResponse {
  @scala.inline
  def apply(stats: js.Array[Schema$DataSourceIndexStats] = null): Schema$GetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetDataSourceIndexStatsResponse]
  }
}

