package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action to launch an app.
  */
@js.native
trait SchemaLaunchAppAction extends js.Object {
  /**
    * Package name of app to be launched
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaLaunchAppAction {
  @scala.inline
  def apply(packageName: String = null): SchemaLaunchAppAction = {
    val __obj = js.Dynamic.literal()
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLaunchAppAction]
  }
}

