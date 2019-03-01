package typings
package atGoogleDashCloudStorageLib.buildSrcNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotificationOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteNotificationOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): DeleteNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[DeleteNotificationOptions]
  }
}

