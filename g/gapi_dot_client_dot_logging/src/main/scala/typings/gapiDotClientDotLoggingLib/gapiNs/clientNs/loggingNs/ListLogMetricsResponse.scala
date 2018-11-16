package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListLogMetricsResponse extends js.Object {
  /** A list of logs-based metrics. */
  var metrics: js.UndefOr[js.Array[LogMetric]] = js.undefined
  /**
               * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call this method again
               * using the value of nextPageToken as pageToken.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

