package typings
package gitlabLib.distServicesJobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def cancel(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def cancel(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def downloadLatestArtifactFile(
    projectId: gitlabLib.ProjectId,
    ref: java.lang.String,
    name: java.lang.String,
    hasStreamOptions: gitlabLib.Anon_Stream with gitlabLib.BaseRequestOptions
  ): js.Any = js.native
  def downloadSingleArtifactFile(
    projectId: gitlabLib.ProjectId,
    jobId: gitlabLib.JobId,
    artifactPath: java.lang.String,
    hasStreamOptions: gitlabLib.Anon_Stream with gitlabLib.BaseRequestOptions
  ): js.Any = js.native
  def downloadTraceFile(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[gitlabLib.GetResponse] = js.native
  def downloadTraceFile(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def erase(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def erase(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def eraseArtifacts(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def eraseArtifacts(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def keepArtifacts(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def keepArtifacts(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def play(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def play(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, jobId: gitlabLib.JobId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showPipelineJobs(
    projectId: gitlabLib.ProjectId,
    pipelineId: gitlabLib.PipelineId,
    options: gitlabLib.Anon_Scope with gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

