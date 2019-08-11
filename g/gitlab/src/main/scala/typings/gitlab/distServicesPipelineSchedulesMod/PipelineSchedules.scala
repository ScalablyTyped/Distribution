package typings.gitlab.distServicesPipelineSchedulesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.PipelineScheduleId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

