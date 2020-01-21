package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action executed during setup.
  */
@js.native
trait SchemaSetupAction extends js.Object {
  /**
    * Description of this action.
    */
  var description: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * An action to launch an app.
    */
  var launchApp: js.UndefOr[SchemaLaunchAppAction] = js.native
  /**
    * Title of this action.
    */
  var title: js.UndefOr[SchemaUserFacingMessage] = js.native
}

object SchemaSetupAction {
  @scala.inline
  def apply(
    description: SchemaUserFacingMessage = null,
    launchApp: SchemaLaunchAppAction = null,
    title: SchemaUserFacingMessage = null
  ): SchemaSetupAction = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (launchApp != null) __obj.updateDynamic("launchApp")(launchApp.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetupAction]
  }
}

