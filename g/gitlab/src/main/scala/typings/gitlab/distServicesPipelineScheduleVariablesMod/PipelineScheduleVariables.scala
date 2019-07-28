package typings.gitlab.distServicesPipelineScheduleVariablesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesMod.KeyId
import typings.gitlab.distServicesMod.PipelineScheduleId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineScheduleVariables extends BaseService {
  def all(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, keyId: KeyId): js.Promise[js.Object] = js.native
  def edit(
    projectId: ProjectId,
    pipelineScheduleId: PipelineScheduleId,
    keyId: KeyId,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, keyId: KeyId): js.Promise[js.Object] = js.native
  def remove(
    projectId: ProjectId,
    pipelineScheduleId: PipelineScheduleId,
    keyId: KeyId,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, keyId: KeyId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: ProjectId,
    pipelineScheduleId: PipelineScheduleId,
    keyId: KeyId,
    options: BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

