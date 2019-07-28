package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

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
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ReviewsReplyResponse]
  }
}

