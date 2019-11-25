package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMessagesResponse extends js.Object {
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
}

object ListMessagesResponse {
  @scala.inline
  def apply(
    messages: js.Array[Message] = null,
    nextPageToken: String = null,
    resultSizeEstimate: Int | Double = null
  ): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMessagesResponse]
  }
}

