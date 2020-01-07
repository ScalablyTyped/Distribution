package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action to launch an app.
  */
@js.native
trait Schema$LaunchAppAction extends js.Object {
  /**
    * Package name of app to be launched
    */
  var packageName: js.UndefOr[String] = js.native
}

object Schema$LaunchAppAction {
  @scala.inline
  def apply(packageName: String = null): Schema$LaunchAppAction = {
    val __obj = js.Dynamic.literal()
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LaunchAppAction]
  }
}

