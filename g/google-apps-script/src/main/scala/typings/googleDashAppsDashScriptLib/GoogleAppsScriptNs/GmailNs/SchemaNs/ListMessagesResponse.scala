package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMessagesResponse extends js.Object {
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var resultSizeEstimate: js.UndefOr[scala.Double] = js.undefined
}

object ListMessagesResponse {
  @scala.inline
  def apply(
    messages: js.Array[Message] = null,
    nextPageToken: java.lang.String = null,
    resultSizeEstimate: scala.Int | scala.Double = null
  ): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMessagesResponse]
  }
}

