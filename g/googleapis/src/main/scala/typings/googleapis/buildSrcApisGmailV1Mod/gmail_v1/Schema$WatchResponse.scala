package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Push notification watch response.
  */
@js.native
trait Schema$WatchResponse extends js.Object {
  /**
    * When Gmail will stop sending notifications for mailbox updates (epoch
    * millis). Call watch again before this time to renew the watch.
    */
  var expiration: js.UndefOr[String] = js.native
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.native
}

object Schema$WatchResponse {
  @scala.inline
  def apply(expiration: String = null, historyId: String = null): Schema$WatchResponse = {
    val __obj = js.Dynamic.literal()
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WatchResponse]
  }
}

