package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchResponse extends js.Object {
  /** When Gmail will stop sending notifications for mailbox updates (epoch millis). Call watch again before this time to renew the watch. */
  var expiration: js.UndefOr[String] = js.undefined
  /** The ID of the mailbox's current history record. */
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

