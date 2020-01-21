package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostBucketsPayload extends js.Object {
  var allow: js.UndefOr[js.Array[PostBucketsPayloadAllow]] = js.undefined
  var bucketKey: String
  var policyKey: String
}

object PostBucketsPayload {
  @scala.inline
  def apply(bucketKey: String, policyKey: String, allow: js.Array[PostBucketsPayloadAllow] = null): PostBucketsPayload = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], policyKey = policyKey.asInstanceOf[js.Any])
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayload]
  }
}

