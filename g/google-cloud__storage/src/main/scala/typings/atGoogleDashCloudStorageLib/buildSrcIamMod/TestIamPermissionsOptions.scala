package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object TestIamPermissionsOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): TestIamPermissionsOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[TestIamPermissionsOptions]
  }
}

