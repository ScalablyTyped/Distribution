package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BucketPolicyOnly extends js.Object {
  var bucketPolicyOnly: js.UndefOr[Anon_Enabled] = js.native
}

object Anon_BucketPolicyOnly {
  @scala.inline
  def apply(bucketPolicyOnly: Anon_Enabled = null): Anon_BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    if (bucketPolicyOnly != null) __obj.updateDynamic("bucketPolicyOnly")(bucketPolicyOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketPolicyOnly]
  }
}

