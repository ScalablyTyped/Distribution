package typings
package gitlabLib.distLatestServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSettingsOptions extends js.Object {
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ] = js.undefined
}

object NotificationSettingsOptions {
  @scala.inline
  def apply(
    groupId: java.lang.String = null,
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any = null
  ): NotificationSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[NotificationSettingsOptions]
  }
}

