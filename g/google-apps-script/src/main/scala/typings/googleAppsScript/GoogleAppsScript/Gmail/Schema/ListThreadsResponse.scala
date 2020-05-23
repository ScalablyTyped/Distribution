package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreadsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
  var threads: js.UndefOr[js.Array[Thread]] = js.undefined
}

object ListThreadsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    resultSizeEstimate: js.UndefOr[Double] = js.undefined,
    threads: js.Array[Thread] = null
  ): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(resultSizeEstimate)) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.get.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreadsResponse]
  }
}

