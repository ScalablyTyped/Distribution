package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListExclusionsResponse extends js.Object {
  /** A list of exclusions. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.undefined
  /**
               * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again
               * using the value of nextPageToken as pageToken.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

