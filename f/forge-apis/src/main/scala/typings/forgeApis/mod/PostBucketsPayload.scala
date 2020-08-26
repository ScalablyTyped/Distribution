package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostBucketsPayload extends js.Object {
  var allow: js.UndefOr[js.Array[PostBucketsPayloadAllow]] = js.native
  var bucketKey: String = js.native
  var policyKey: String = js.native
}

object PostBucketsPayload {
  @scala.inline
  def apply(bucketKey: String, policyKey: String): PostBucketsPayload = {
    val __obj = js.Dynamic.literal(bucketKey = bucketKey.asInstanceOf[js.Any], policyKey = policyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBucketsPayload]
  }
  @scala.inline
  implicit class PostBucketsPayloadOps[Self <: PostBucketsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketKey(value: String): Self = this.set("bucketKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyKey(value: String): Self = this.set("policyKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowVarargs(value: PostBucketsPayloadAllow*): Self = this.set("allow", js.Array(value :_*))
    @scala.inline
    def setAllow(value: js.Array[PostBucketsPayloadAllow]): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
  }
  
}

