package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesMod.KeyId
import typings.gitlab.distServicesMod.PipelineScheduleId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesPipelineScheduleVariablesMod.PipelineScheduleVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/PipelineScheduleVariables", JSImport.Namespace)
@js.native
object distServicesPipelineScheduleVariablesMod extends js.Object {
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

