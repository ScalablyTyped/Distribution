package typings
package gitlabLib.distLatestServicesJobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: js.Object
  ): js.Promise[_] = js.native
  def cancel(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def downloadLatestArtifactFile(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    ref: java.lang.String,
    name: java.lang.String
  ): js.Promise[_] = js.native
  def downloadLatestArtifactFile(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    ref: java.lang.String,
    name: java.lang.String,
    options: gitlabLib.Anon_StreamBoolean
  ): js.Promise[_] = js.native
  def downloadSingleArtifactFile(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId,
    artifactPath: java.lang.String
  ): js.Promise[_] = js.native
  def downloadSingleArtifactFile(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId,
    artifactPath: java.lang.String,
    options: gitlabLib.Anon_StreamBoolean
  ): js.Promise[_] = js.native
  def downloadTraceFile(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def erase(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def keepArtifacts(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def play(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def retry(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    jobId: JobId
  ): js.Promise[_] = js.native
  def showPipelineJobs(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineId: gitlabLib.distLatestServicesPipelinesMod.PipelineId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
}

