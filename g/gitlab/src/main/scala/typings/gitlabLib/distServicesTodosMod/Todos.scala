package typings
package gitlabLib.distServicesTodosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Todos
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def done(hasTodoIdOptions: gitlabLib.Anon_TodoId with gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

