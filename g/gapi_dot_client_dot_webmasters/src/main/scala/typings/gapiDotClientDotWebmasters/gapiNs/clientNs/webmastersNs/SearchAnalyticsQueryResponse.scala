package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnalyticsQueryResponse extends js.Object {
  /** How the results were aggregated. */
  var responseAggregationType: js.UndefOr[String] = js.undefined
  /** A list of rows grouped by the key values in the order given in the query. */
  var rows: js.UndefOr[js.Array[ApiDataRow]] = js.undefined
}

object SearchAnalyticsQueryResponse {
  @scala.inline
  def apply(responseAggregationType: String = null, rows: js.Array[ApiDataRow] = null): SearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (responseAggregationType != null) __obj.updateDynamic("responseAggregationType")(responseAggregationType)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[SearchAnalyticsQueryResponse]
  }
}

