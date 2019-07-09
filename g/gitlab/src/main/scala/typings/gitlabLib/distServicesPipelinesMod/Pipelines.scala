package typings
package gitlabLib.distServicesPipelinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipelines
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def cancel(projectId: gitlabLib.distServicesMod.ProjectId, pipelineId: gitlabLib.distServicesMod.PipelineId): js.Promise[js.Object] = js.native
  def cancel(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineId: gitlabLib.distServicesMod.PipelineId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.distServicesMod.ProjectId, ref: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    ref: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.distServicesMod.ProjectId, pipelineId: gitlabLib.distServicesMod.PipelineId): js.Promise[js.Object] = js.native
  def retry(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineId: gitlabLib.distServicesMod.PipelineId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, pipelineId: gitlabLib.distServicesMod.PipelineId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineId: gitlabLib.distServicesMod.PipelineId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showJobs(projectId: gitlabLib.distServicesMod.ProjectId, pipelineId: gitlabLib.distServicesMod.PipelineId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showJobs(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineId: gitlabLib.distServicesMod.PipelineId,
    options: gitlabLib.Anon_Scope with gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

