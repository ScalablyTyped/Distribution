package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

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
  def query(request: gapiDotClientDotWebmastersLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SearchAnalyticsQueryResponse]
}

