package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReviewsReplyResponse extends js.Object {
  var result: js.UndefOr[Schema$ReviewReplyResult] = js.native
}

object Schema$ReviewsReplyResponse {
  @scala.inline
  def apply(result: Schema$ReviewReplyResult = null): Schema$ReviewsReplyResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReviewsReplyResponse]
  }
}

