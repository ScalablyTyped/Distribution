package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResponse extends js.Object {
  var expiration: js.UndefOr[String] = js.undefined
  var historyId: js.UndefOr[String] = js.undefined
}

object WatchResponse {
  @scala.inline
  def apply(expiration: String = null, historyId: String = null): WatchResponse = {
    val __obj = js.Dynamic.literal()
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchResponse]
  }
}

