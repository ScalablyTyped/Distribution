package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

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
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalDate != null) __obj.updateDynamic("internalDate")(internalDate)
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (sizeEstimate != null) __obj.updateDynamic("sizeEstimate")(sizeEstimate.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (threadId != null) __obj.updateDynamic("threadId")(threadId)
    __obj.asInstanceOf[Message]
  }
}

