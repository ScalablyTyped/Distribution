package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotWebmasters.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchanalyticsResource extends js.Object {
  /**
    * Query your data with filters and parameters that you define. Returns zero or more rows grouped by the row keys that you define. You must define a date
    * range of one or more days.
    *
    * When date is one of the group by values, any days without data are omitted from the result list. If you need to know which days have data, issue a
    * broad date range query grouped by date for any metric, and see which day rows are returned.
    */
  def query(request: Anon_Alt): Request[SearchAnalyticsQueryResponse]
}

object SearchanalyticsResource {
  @scala.inline
  def apply(query: Anon_Alt => Request[SearchAnalyticsQueryResponse]): SearchanalyticsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[SearchanalyticsResource]
  }
}

