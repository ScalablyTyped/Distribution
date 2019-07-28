package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again
    * using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** A list of sinks. */
  var sinks: js.UndefOr[js.Array[LogSink]] = js.undefined
}

object ListSinksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sinks: js.Array[LogSink] = null): ListSinksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (sinks != null) __obj.updateDynamic("sinks")(sinks)
    __obj.asInstanceOf[ListSinksResponse]
  }
}

