package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIamPolicyRequest extends js.Object {
  var policy: stdLib.Partial[Policy]
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(policy: stdLib.Partial[Policy]): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
}

