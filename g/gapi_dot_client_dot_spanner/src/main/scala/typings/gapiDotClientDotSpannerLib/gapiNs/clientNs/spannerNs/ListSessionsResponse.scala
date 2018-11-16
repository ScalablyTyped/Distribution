package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListSessionsResponse extends js.Object {
  /**
               * `next_page_token` can be sent in a subsequent
               * ListSessions call to fetch more of the matching
               * sessions.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of requested sessions. */
  var sessions: js.UndefOr[js.Array[Session]] = js.undefined
}

