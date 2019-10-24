package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesJobsMod.Jobs
import typings.gitlab.distSrcCoreServicesMod.JobId
import typings.gitlab.distSrcCoreServicesMod.PipelineId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Jobs", JSImport.Namespace)
@js.native
object distSrcCoreServicesJobsMod extends js.Object {
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

