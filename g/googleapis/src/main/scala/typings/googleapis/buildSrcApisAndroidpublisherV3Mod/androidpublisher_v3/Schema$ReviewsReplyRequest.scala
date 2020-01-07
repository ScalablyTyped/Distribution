package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReviewsReplyRequest extends js.Object {
  /**
    * The text to set as the reply. Replies of more than approximately 350
    * characters will be rejected. HTML tags will be stripped.
    */
  var replyText: js.UndefOr[String] = js.native
}

object Schema$ReviewsReplyRequest {
  @scala.inline
  def apply(replyText: String = null): Schema$ReviewsReplyRequest = {
    val __obj = js.Dynamic.literal()
    if (replyText != null) __obj.updateDynamic("replyText")(replyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReviewsReplyRequest]
  }
}

