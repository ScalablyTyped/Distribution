package typings.googleCloudTasks.mod

import typings.googleCloudTasks.PartialPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIamPolicyRequest extends js.Object {
  var policy: PartialPolicy
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(policy: PartialPolicy): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
}

