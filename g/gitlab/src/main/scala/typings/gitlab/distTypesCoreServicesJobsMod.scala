package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Jobs", JSImport.Namespace)
@js.native
object distTypesCoreServicesJobsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.created
    - typings.gitlab.gitlabStrings.pending
    - typings.gitlab.gitlabStrings.running
    - typings.gitlab.gitlabStrings.failed
    - typings.gitlab.gitlabStrings.success
    - typings.gitlab.gitlabStrings.canceled
    - typings.gitlab.gitlabStrings.skipped
    - typings.gitlab.gitlabStrings.manual
  */
  trait JobScope extends js.Object
  
  @js.native
  class Jobs () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cancel(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def downloadLatestArtifactFile(
      projectId: String,
      ref: String,
      name: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadLatestArtifactFile(
      projectId: Double,
      ref: String,
      name: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadSingleArtifactFile(
      projectId: String,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadSingleArtifactFile(
      projectId: Double,
      jobId: Double,
      artifactPath: String,
      hasStreamOptions: Anon_Stream with BaseRequestOptions
    ): js.Any = js.native
    def downloadTraceFile(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def downloadTraceFile(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def erase(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def erase(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def eraseArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def keepArtifacts(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def play(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def play(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: String, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: String, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: Double, jobId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, jobId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: String, pipelineId: Double, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
    def showPipelineJobs(projectId: Double, pipelineId: Double, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
  }
  
}

