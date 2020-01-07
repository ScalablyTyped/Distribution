package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of rows, one per result, grouped by key. Metrics in each row are
  * aggregated for all data grouped by that key either by page or property, as
  * specified by the aggregation type parameter.
  */
@js.native
trait Schema$SearchAnalyticsQueryResponse extends js.Object {
  /**
    * How the results were aggregated.
    */
  var responseAggregationType: js.UndefOr[String] = js.native
  /**
    * A list of rows grouped by the key values in the order given in the query.
    */
  var rows: js.UndefOr[js.Array[Schema$ApiDataRow]] = js.native
}

object Schema$SearchAnalyticsQueryResponse {
  @scala.inline
  def apply(responseAggregationType: String = null, rows: js.Array[Schema$ApiDataRow] = null): Schema$SearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (responseAggregationType != null) __obj.updateDynamic("responseAggregationType")(responseAggregationType.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchAnalyticsQueryResponse]
  }
}

