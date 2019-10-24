package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.PipelineScheduleId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPipelineSchedulesMod.PipelineSchedules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/PipelineSchedules", JSImport.Namespace)
@js.native
object distSrcCoreServicesPipelineSchedulesMod extends js.Object {
  @js.native
  trait PipelineSchedules extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, description: String, ref: String, cron: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, description: String, ref: String, cron: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, scheduleId: PipelineScheduleId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, scheduleId: PipelineScheduleId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, scheduleId: PipelineScheduleId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, scheduleId: PipelineScheduleId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, scheduleId: PipelineScheduleId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, scheduleId: PipelineScheduleId, options: Sudo): js.Promise[GetResponse] = js.native
    def takeOwnership(projectId: ProjectId, scheduleId: PipelineScheduleId): js.Promise[js.Object] = js.native
    def takeOwnership(projectId: ProjectId, scheduleId: PipelineScheduleId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends PipelineSchedules
  
}

