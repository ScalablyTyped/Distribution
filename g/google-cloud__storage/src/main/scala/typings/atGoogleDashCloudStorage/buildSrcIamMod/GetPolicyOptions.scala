package typings.atGoogleDashCloudStorage.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object GetPolicyOptions {
  @scala.inline
  def apply(userProject: String = null): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyOptions]
  }
}

