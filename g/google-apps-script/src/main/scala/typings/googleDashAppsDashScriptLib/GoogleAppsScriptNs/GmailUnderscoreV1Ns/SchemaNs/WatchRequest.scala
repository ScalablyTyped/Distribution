package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchRequest extends js.Object {
  var labelFilterAction: js.UndefOr[java.lang.String] = js.undefined
  var labelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topicName: js.UndefOr[java.lang.String] = js.undefined
}

object WatchRequest {
  @scala.inline
  def apply(
    labelFilterAction: java.lang.String = null,
    labelIds: js.Array[java.lang.String] = null,
    topicName: java.lang.String = null
  ): WatchRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFilterAction != null) __obj.updateDynamic("labelFilterAction")(labelFilterAction)
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds)
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[WatchRequest]
  }
}

