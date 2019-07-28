package typings.gitlab.distServicesPipelinesMod

import typings.gitlab.Anon_Scope
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.PipelineId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipelines extends BaseService {
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def cancel(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
  def cancel(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, ref: String): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def retry(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
  def retry(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, pipelineId: PipelineId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showJobs(projectId: ProjectId, pipelineId: PipelineId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showJobs(projectId: ProjectId, pipelineId: PipelineId, options: Anon_Scope with Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

