package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action executed during setup.
  */
@js.native
trait Schema$SetupAction extends js.Object {
  /**
    * Description of this action.
    */
  var description: js.UndefOr[Schema$UserFacingMessage] = js.native
  /**
    * An action to launch an app.
    */
  var launchApp: js.UndefOr[Schema$LaunchAppAction] = js.native
  /**
    * Title of this action.
    */
  var title: js.UndefOr[Schema$UserFacingMessage] = js.native
}

object Schema$SetupAction {
  @scala.inline
  def apply(
    description: Schema$UserFacingMessage = null,
    launchApp: Schema$LaunchAppAction = null,
    title: Schema$UserFacingMessage = null
  ): Schema$SetupAction = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (launchApp != null) __obj.updateDynamic("launchApp")(launchApp.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetupAction]
  }
}

