package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetPolicyOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): GetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetPolicyOptions]
  }
}

