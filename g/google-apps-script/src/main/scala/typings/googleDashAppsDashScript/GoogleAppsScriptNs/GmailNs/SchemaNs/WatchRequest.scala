package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchRequest extends js.Object {
  var labelFilterAction: js.UndefOr[String] = js.undefined
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  var topicName: js.UndefOr[String] = js.undefined
}

object WatchRequest {
  @scala.inline
  def apply(labelFilterAction: String = null, labelIds: js.Array[String] = null, topicName: String = null): WatchRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFilterAction != null) __obj.updateDynamic("labelFilterAction")(labelFilterAction)
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[WatchRequest]
  }
}

