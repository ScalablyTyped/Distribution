package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFileMetadataOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object SetFileMetadataOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): SetFileMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[SetFileMetadataOptions]
  }
}

