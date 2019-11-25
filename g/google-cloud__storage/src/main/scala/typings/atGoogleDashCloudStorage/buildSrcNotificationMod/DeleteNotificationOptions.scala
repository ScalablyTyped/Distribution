package typings.atGoogleDashCloudStorage.buildSrcNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotificationOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object DeleteNotificationOptions {
  @scala.inline
  def apply(userProject: String = null): DeleteNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationOptions]
  }
}

