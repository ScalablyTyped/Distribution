package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.PipelineId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesPipelinesMod.Pipelines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Pipelines", JSImport.Namespace)
@js.native
object distServicesPipelinesMod extends js.Object {
  @js.native
  trait Pipelines extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cancel(projectId: ProjectId, pipelineId: PipelineId): js.Promise[js.Object] = js.native
    def cancel(projectId: ProjectId, pipelineId: PipelineId, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
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

