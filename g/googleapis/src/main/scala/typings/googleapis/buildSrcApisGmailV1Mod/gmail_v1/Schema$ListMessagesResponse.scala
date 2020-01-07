package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListMessagesResponse extends js.Object {
  /**
    * List of messages. Note that each message resource contains only an id and
    * a threadId. Additional message details can be fetched using the
    * messages.get method.
    */
  var messages: js.UndefOr[js.Array[Schema$Message]] = js.native
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object Schema$ListMessagesResponse {
  @scala.inline
  def apply(
    messages: js.Array[Schema$Message] = null,
    nextPageToken: String = null,
    resultSizeEstimate: Int | Double = null
  ): Schema$ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListMessagesResponse]
  }
}

