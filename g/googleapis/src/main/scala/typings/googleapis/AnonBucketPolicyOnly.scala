package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucketPolicyOnly extends js.Object {
  var bucketPolicyOnly: js.UndefOr[AnonEnabled] = js.native
}

object AnonBucketPolicyOnly {
  @scala.inline
  def apply(bucketPolicyOnly: AnonEnabled = null): AnonBucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    if (bucketPolicyOnly != null) __obj.updateDynamic("bucketPolicyOnly")(bucketPolicyOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucketPolicyOnly]
  }
}

