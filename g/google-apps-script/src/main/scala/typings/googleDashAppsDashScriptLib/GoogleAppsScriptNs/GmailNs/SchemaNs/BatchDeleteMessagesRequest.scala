package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteMessagesRequest extends js.Object {
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchDeleteMessagesRequest {
  @scala.inline
  def apply(ids: js.Array[java.lang.String] = null): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
}

