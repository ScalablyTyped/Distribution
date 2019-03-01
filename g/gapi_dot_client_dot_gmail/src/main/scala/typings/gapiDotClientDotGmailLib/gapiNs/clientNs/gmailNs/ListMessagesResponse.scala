package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMessagesResponse extends js.Object {
  /** List of messages. */
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated total number of results. */
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

