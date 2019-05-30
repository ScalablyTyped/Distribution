package typings
package gitlabLib.distServicesPipelineSchedulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSchedules
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    description: java.lang.String,
    ref: java.lang.String,
    cron: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    description: java.lang.String,
    ref: java.lang.String,
    cron: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    scheduleId: gitlabLib.PipelineScheduleId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def takeOwnership(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId): js.Promise[js.Object] = js.native
  def takeOwnership(projectId: gitlabLib.ProjectId, scheduleId: gitlabLib.PipelineScheduleId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

