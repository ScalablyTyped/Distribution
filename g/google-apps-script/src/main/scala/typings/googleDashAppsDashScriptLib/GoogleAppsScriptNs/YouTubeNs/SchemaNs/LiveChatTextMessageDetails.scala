package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatTextMessageDetails extends js.Object {
  var messageText: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatTextMessageDetails {
  @scala.inline
  def apply(messageText: java.lang.String = null): LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    if (messageText != null) __obj.updateDynamic("messageText")(messageText)
    __obj.asInstanceOf[LiveChatTextMessageDetails]
  }
}

