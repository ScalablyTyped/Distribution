package typings
package gitlabLib.distServicesPipelineScheduleVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineScheduleVariables
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    pipelineScheduleId: gitlabLib.distServicesMod.PipelineScheduleId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

