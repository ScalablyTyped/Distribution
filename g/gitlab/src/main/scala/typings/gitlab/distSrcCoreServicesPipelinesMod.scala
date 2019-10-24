package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.PipelineId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPipelinesMod.Pipelines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Pipelines", JSImport.Namespace)
@js.native
object distSrcCoreServicesPipelinesMod extends js.Object {
  @js.native
  trait Pipelines extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allVariables(projectId: ProjectId, pipelineId: PipelineId): js.Promise[GetResponse] = js.native
    def allVariables(projectId: ProjectId, pipelineId: PipelineId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cancel(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
    def cancel(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def delete(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
    def delete(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
    def retry(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, pipelineId: PipelineId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[GetResponse] = js.native
    def showJobs(projectId: ProjectId, pipelineId: PipelineId): js.Promise[GetResponse] = js.native
    def showJobs(projectId: ProjectId, pipelineId: PipelineId, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Pipelines
  
}

