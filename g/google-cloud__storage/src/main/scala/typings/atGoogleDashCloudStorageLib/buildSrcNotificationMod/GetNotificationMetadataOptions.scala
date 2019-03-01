package typings
package atGoogleDashCloudStorageLib.buildSrcNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationMetadataOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetNotificationMetadataOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): GetNotificationMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetNotificationMetadataOptions]
  }
}

