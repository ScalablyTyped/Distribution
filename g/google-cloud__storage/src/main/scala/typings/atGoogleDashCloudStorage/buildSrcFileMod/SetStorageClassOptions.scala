package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStorageClassOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object SetStorageClassOptions {
  @scala.inline
  def apply(userProject: String = null): SetStorageClassOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorageClassOptions]
  }
}

