package typings
package gitlabLib.distServicesJobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs
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
  def cancel(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def cancel(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def downloadLatestArtifactFile(
    projectId: gitlabLib.distServicesMod.ProjectId,
    ref: java.lang.String,
    name: java.lang.String,
    hasStreamOptions: gitlabLib.Anon_Stream with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Any = js.native
  def downloadSingleArtifactFile(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    artifactPath: java.lang.String,
    hasStreamOptions: gitlabLib.Anon_Stream with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Any = js.native
  def downloadTraceFile(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def downloadTraceFile(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def erase(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def erase(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def eraseArtifacts(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def eraseArtifacts(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def keepArtifacts(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def keepArtifacts(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def play(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def play(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[js.Object] = js.native
  def retry(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, jobId: gitlabLib.distServicesMod.JobId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    jobId: gitlabLib.distServicesMod.JobId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showPipelineJobs(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineId: gitlabLib.distServicesMod.PipelineId,
    options: gitlabLib.Anon_Scope with gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

