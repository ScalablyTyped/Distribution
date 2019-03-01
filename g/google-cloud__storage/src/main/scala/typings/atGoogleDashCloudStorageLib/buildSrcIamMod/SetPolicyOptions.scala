package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPolicyOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object SetPolicyOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): SetPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[SetPolicyOptions]
  }
}

