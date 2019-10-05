package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesJobsMod.Jobs
import typings.gitlab.distServicesMod.JobId
import typings.gitlab.distServicesMod.PipelineId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Jobs", JSImport.Namespace)
@js.native
object distServicesJobsMod extends js.Object {
  @js.native
  trait Jobs extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cancel(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def cancel(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def downloadLatestArtifactFile(
      projectId: ProjectId,
      ref: String,
      name: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadSingleArtifactFile(
      projectId: ProjectId,
      jobId: JobId,
      artifactPath: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadTraceFile(projectId: ProjectId, jobId: JobId): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[GetResponse] = js.native
    def erase(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def erase(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def play(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def play(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: ProjectId, jobId: JobId): js.Promise[js.Object] = js.native
    def retry(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, jobId: JobId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: ProjectId, pipelineId: PipelineId, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Jobs
  
}

