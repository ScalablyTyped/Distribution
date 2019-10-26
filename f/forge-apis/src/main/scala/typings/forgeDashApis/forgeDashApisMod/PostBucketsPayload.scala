package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(bucketKey = bucketKey, policyKey = policyKey)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    __obj.asInstanceOf[PostBucketsPayload]
  }
}

