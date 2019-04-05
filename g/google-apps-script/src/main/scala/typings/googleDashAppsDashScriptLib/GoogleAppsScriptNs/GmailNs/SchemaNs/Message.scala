package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalDate: js.UndefOr[java.lang.String] = js.undefined
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var payload: js.UndefOr[MessagePart] = js.undefined
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var sizeEstimate: js.UndefOr[scala.Double] = js.undefined
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  var threadId: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    historyId: java.lang.String = null,
    id: java.lang.String = null,
    internalDate: java.lang.String = null,
    labelIds: js.Array[java.lang.String] = null,
    payload: MessagePart = null,
    raw: java.lang.String = null,
    sizeEstimate: scala.Int | scala.Double = null,
    snippet: java.lang.String = null,
    threadId: java.lang.String = null
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

