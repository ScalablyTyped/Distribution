package typings.gitlab.jobsMod

import typings.gitlab.anon.scopeJobScopeundefinedSud
import typings.gitlab.anon.streambooleanundefinedBas
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Jobs", "Jobs")
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
  
  def downloadLatestArtifactFile(projectId: String, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): js.Any = js.native
  def downloadLatestArtifactFile(projectId: Double, ref: String, name: String, hasStreamOptions: streambooleanundefinedBas): js.Any = js.native
  
  def downloadSingleArtifactFile(
    projectId: String,
    jobId: Double,
    artifactPath: String,
    hasStreamOptions: streambooleanundefinedBas
  ): js.Any = js.native
  def downloadSingleArtifactFile(
    projectId: Double,
    jobId: Double,
    artifactPath: String,
    hasStreamOptions: streambooleanundefinedBas
  ): js.Any = js.native
  
  def downloadSingleArtifactFileFromRef(
    projectId: String,
    ref: String,
    artifactPath: String,
    name: String,
    hasStreamOptions: streambooleanundefinedBas
  ): js.Any = js.native
  def downloadSingleArtifactFileFromRef(
    projectId: Double,
    ref: String,
    artifactPath: String,
    name: String,
    hasStreamOptions: streambooleanundefinedBas
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
  
  def showPipelineJobs(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
  def showPipelineJobs(projectId: String, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
  def showPipelineJobs(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
  def showPipelineJobs(projectId: Double, pipelineId: Double, options: scopeJobScopeundefinedSud): js.Promise[GetResponse] = js.native
}
