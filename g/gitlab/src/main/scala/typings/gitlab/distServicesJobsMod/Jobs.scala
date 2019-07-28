package typings.gitlab.distServicesJobsMod

import typings.gitlab.Anon_Scope
import typings.gitlab.Anon_Stream
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.JobId
import typings.gitlab.distServicesMod.PipelineId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs extends BaseService {
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
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
  def downloadTraceFile(projectId: ProjectId, jobId: JobId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def downloadTraceFile(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
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
  def show(projectId: ProjectId, jobId: JobId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, jobId: JobId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showPipelineJobs(projectId: ProjectId, pipelineId: PipelineId, options: Anon_Scope with Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

