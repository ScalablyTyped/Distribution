package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object TestIamPermissionsOptions {
  @scala.inline
  def apply(userProject: String = null): TestIamPermissionsOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIamPermissionsOptions]
  }
}

