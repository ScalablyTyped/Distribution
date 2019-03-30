package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResponse extends js.Object {
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  var historyId: js.UndefOr[java.lang.String] = js.undefined
}

object WatchResponse {
  @scala.inline
  def apply(expiration: java.lang.String = null, historyId: java.lang.String = null): WatchResponse = {
    val __obj = js.Dynamic.literal()
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    __obj.asInstanceOf[WatchResponse]
  }
}

