package typings.gitlab

import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectId extends js.Object {
  var projectId: js.UndefOr[ProjectId] = js.undefined
}

object Anon_ProjectId {
  @scala.inline
  def apply(projectId: ProjectId = null): Anon_ProjectId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProjectId]
  }
}

