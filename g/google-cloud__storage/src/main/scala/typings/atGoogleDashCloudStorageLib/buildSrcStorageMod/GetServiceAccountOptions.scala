package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetServiceAccountOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): GetServiceAccountOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetServiceAccountOptions]
  }
}

