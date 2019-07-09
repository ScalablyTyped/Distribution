package typings
package gitlabLib.distServicesGroupProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupProjects
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(groupId: gitlabLib.distServicesMod.GroupProjectId, projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def add(
    groupId: gitlabLib.distServicesMod.GroupProjectId,
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(groupId: gitlabLib.distServicesMod.GroupProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    groupId: gitlabLib.distServicesMod.GroupProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

