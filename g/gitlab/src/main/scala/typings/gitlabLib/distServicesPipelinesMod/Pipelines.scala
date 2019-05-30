package typings
package gitlabLib.distServicesPipelinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipelines
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def cancel(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId): js.Promise[js.Object] = js.native
  def cancel(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, ref: java.lang.String): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, ref: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId): js.Promise[js.Object] = js.native
  def retry(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, pipelineId: gitlabLib.PipelineId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showJobs(
    projectId: gitlabLib.ProjectId,
    pipelineId: gitlabLib.PipelineId,
    options: gitlabLib.Anon_Scope with gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

