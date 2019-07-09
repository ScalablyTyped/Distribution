package typings
package gitlabLib.distServicesRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runners
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    hasProjectIdOptions: gitlabLib.Anon_ProjectId_1556160014 with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def allOwned(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def allOwned(options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def disable(projectId: gitlabLib.distServicesMod.ProjectId, runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[js.Object] = js.native
  def disable(
    projectId: gitlabLib.distServicesMod.ProjectId,
    runnerId: gitlabLib.distServicesMod.RunnerId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[js.Object] = js.native
  def edit(
    runnerId: gitlabLib.distServicesMod.RunnerId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def enable(projectId: gitlabLib.distServicesMod.ProjectId, runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[js.Object] = js.native
  def enable(
    projectId: gitlabLib.distServicesMod.ProjectId,
    runnerId: gitlabLib.distServicesMod.RunnerId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def jobs(runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def jobs(runnerId: gitlabLib.distServicesMod.RunnerId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[js.Object] = js.native
  def remove(runnerId: gitlabLib.distServicesMod.RunnerId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def show(runnerId: gitlabLib.distServicesMod.RunnerId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(runnerId: gitlabLib.distServicesMod.RunnerId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

