package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreadsResponse extends js.Object {
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
  /** List of threads. */
  var threads: js.UndefOr[js.Array[Thread]] = js.undefined
}

object ListThreadsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    resultSizeEstimate: Int | Double = null,
    threads: js.Array[Thread] = null
  ): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreadsResponse]
  }
}

