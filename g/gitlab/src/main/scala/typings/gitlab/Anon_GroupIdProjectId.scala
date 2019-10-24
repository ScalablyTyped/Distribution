package typings.gitlab

import typings.gitlab.distSrcCoreServicesMod.GroupId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIdProjectId extends js.Object {
  var groupId: js.UndefOr[GroupId] = js.undefined
  var projectId: js.UndefOr[ProjectId] = js.undefined
}

object Anon_GroupIdProjectId {
  @scala.inline
  def apply(groupId: GroupId = null, projectId: ProjectId = null): Anon_GroupIdProjectId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupIdProjectId]
  }
}

