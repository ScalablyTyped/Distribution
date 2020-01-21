package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsReplyResponse extends js.Object {
  var result: js.UndefOr[ReviewReplyResult] = js.undefined
}

object ReviewsReplyResponse {
  @scala.inline
  def apply(result: ReviewReplyResult = null): ReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewsReplyResponse]
  }
}

