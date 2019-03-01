package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogEntriesResponse extends js.Object {
  /**
    * A list of log entries. If entries is empty, nextPageToken may still be returned, indicating that more entries may exist. See nextPageToken for more
    * information.
    */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.undefined
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method
    * again using the value of nextPageToken as pageToken.If a value for next_page_token appears and the entries field is empty, it means that the search
    * found no log entries so far but it did not have time to search all the possible log entries. Retry the method with this value for page_token to
    * continue the search. Alternatively, consider speeding up the search by changing your filter to specify a single log name or resource type, or to narrow
    * the time range of the search.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListLogEntriesResponse {
  @scala.inline
  def apply(entries: js.Array[LogEntry] = null, nextPageToken: java.lang.String = null): ListLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListLogEntriesResponse]
  }
}

