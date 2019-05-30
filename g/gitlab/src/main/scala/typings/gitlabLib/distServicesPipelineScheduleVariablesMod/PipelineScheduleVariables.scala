package typings
package gitlabLib.distServicesPipelineScheduleVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineScheduleVariables
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId, pipelineScheduleId: gitlabLib.PipelineScheduleId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId, pipelineScheduleId: gitlabLib.PipelineScheduleId): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    pipelineScheduleId: gitlabLib.PipelineScheduleId,
    keyId: gitlabLib.KeyId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

