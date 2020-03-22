package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyOptions extends js.Object {
  var requestedPolicyVersion: js.UndefOr[Double] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object GetPolicyOptions {
  @scala.inline
  def apply(requestedPolicyVersion: Int | Double = null, userProject: String = null): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (requestedPolicyVersion != null) __obj.updateDynamic("requestedPolicyVersion")(requestedPolicyVersion.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyOptions]
  }
}

