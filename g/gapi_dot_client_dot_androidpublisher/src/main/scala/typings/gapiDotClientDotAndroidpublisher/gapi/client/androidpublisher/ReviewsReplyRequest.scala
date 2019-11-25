package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsReplyRequest extends js.Object {
  /** The text to set as the reply. Replies of more than approximately 350 characters will be rejected. HTML tags will be stripped. */
  var replyText: js.UndefOr[String] = js.undefined
}

object ReviewsReplyRequest {
  @scala.inline
  def apply(replyText: String = null): ReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    if (replyText != null) __obj.updateDynamic("replyText")(replyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewsReplyRequest]
  }
}

