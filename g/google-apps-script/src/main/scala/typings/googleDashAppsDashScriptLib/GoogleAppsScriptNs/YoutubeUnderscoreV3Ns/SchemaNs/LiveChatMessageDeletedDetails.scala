package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessageDeletedDetails extends js.Object {
  var deletedMessageId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatMessageDeletedDetails {
  @scala.inline
  def apply(deletedMessageId: java.lang.String = null): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    if (deletedMessageId != null) __obj.updateDynamic("deletedMessageId")(deletedMessageId)
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
}

