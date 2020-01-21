package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupIdProjectId extends js.Object {
  var groupId: js.UndefOr[String | Double] = js.undefined
  var projectId: js.UndefOr[String | Double] = js.undefined
}

object AnonGroupIdProjectId {
  @scala.inline
  def apply(groupId: String | Double = null, projectId: String | Double = null): AnonGroupIdProjectId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupIdProjectId]
  }
}

