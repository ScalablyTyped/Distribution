package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreadsResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var resultSizeEstimate: js.UndefOr[scala.Double] = js.undefined
  var threads: js.UndefOr[js.Array[Thread]] = js.undefined
}

object ListThreadsResponse {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    resultSizeEstimate: scala.Int | scala.Double = null,
    threads: js.Array[Thread] = null
  ): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads)
    __obj.asInstanceOf[ListThreadsResponse]
  }
}

