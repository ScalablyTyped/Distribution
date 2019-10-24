package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesMod.KeyId
import typings.gitlab.distSrcCoreServicesMod.PipelineScheduleId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPipelineScheduleVariablesMod.PipelineScheduleVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/PipelineScheduleVariables", JSImport.Namespace)
@js.native
object distSrcCoreServicesPipelineScheduleVariablesMod extends js.Object {
  @js.native
  trait PipelineScheduleVariables extends BaseService {
    def all(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
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
    def show(projectId: ProjectId, pipelineScheduleId: PipelineScheduleId, keyId: KeyId): js.Promise[GetResponse] = js.native
    def show(
      projectId: ProjectId,
      pipelineScheduleId: PipelineScheduleId,
      keyId: KeyId,
      options: BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends PipelineScheduleVariables
  
}

