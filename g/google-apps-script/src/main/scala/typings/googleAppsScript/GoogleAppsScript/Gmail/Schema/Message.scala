package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var historyId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalDate: js.UndefOr[String] = js.undefined
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  var payload: js.UndefOr[MessagePart] = js.undefined
  var raw: js.UndefOr[String] = js.undefined
  var sizeEstimate: js.UndefOr[Double] = js.undefined
  var snippet: js.UndefOr[String] = js.undefined
  var threadId: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    historyId: String = null,
    id: String = null,
    internalDate: String = null,
    labelIds: js.Array[String] = null,
    payload: MessagePart = null,
    raw: String = null,
    sizeEstimate: Int | Double = null,
    snippet: String = null,
    threadId: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalDate != null) __obj.updateDynamic("internalDate")(internalDate.asInstanceOf[js.Any])
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (sizeEstimate != null) __obj.updateDynamic("sizeEstimate")(sizeEstimate.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

