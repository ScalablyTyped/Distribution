package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicyOnly extends js.Object {
  var bucketPolicyOnly: js.UndefOr[Enabled] = js.native
}

object BucketPolicyOnly {
  @scala.inline
  def apply(bucketPolicyOnly: Enabled = null): BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    if (bucketPolicyOnly != null) __obj.updateDynamic("bucketPolicyOnly")(bucketPolicyOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicyOnly]
  }
}

