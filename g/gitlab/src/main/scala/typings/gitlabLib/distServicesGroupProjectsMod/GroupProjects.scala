package typings
package gitlabLib.distServicesGroupProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupProjects
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(groupId: gitlabLib.GroupProjectId, projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def add(
    groupId: gitlabLib.GroupProjectId,
    projectId: gitlabLib.ProjectId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(groupId: gitlabLib.GroupProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(groupId: gitlabLib.GroupProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

