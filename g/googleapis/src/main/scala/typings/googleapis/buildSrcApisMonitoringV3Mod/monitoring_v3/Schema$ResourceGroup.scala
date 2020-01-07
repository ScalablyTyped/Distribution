package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource submessage for group checks. It can be used instead of a
  * monitored resource, when multiple resources are being monitored.
  */
@js.native
trait Schema$ResourceGroup extends js.Object {
  /**
    * The group of resources being monitored. Should be only the group_id, not
    * projects/&lt;project_id&gt;/groups/&lt;group_id&gt;.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The resource type of the group members.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object Schema$ResourceGroup {
  @scala.inline
  def apply(groupId: String = null, resourceType: String = null): Schema$ResourceGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceGroup]
  }
}

