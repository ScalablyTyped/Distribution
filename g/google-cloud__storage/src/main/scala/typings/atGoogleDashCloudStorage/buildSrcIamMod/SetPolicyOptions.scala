package typings.atGoogleDashCloudStorage.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPolicyOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object SetPolicyOptions {
  @scala.inline
  def apply(userProject: String = null): SetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPolicyOptions]
  }
}

