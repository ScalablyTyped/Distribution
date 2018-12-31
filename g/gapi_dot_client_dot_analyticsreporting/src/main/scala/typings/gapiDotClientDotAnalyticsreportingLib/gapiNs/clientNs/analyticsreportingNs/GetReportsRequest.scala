package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportsRequest extends js.Object {
  /**
    * Requests, each request will have a separate response.
    * There can be a maximum of 5 requests. All requests should have the same
    * `dateRanges`, `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[ReportRequest]] = js.undefined
}

