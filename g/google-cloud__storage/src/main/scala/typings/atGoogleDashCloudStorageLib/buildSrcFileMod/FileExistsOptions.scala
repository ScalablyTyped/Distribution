package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExistsOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object FileExistsOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): FileExistsOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[FileExistsOptions]
  }
}

