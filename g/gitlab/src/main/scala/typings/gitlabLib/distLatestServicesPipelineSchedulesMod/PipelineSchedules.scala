package typings
package gitlabLib.distLatestServicesPipelineSchedulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSchedules
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    description: java.lang.String,
    ref: java.lang.String,
    cron: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    scheduleId: PipelineScheduleId,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    scheduleId: PipelineScheduleId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    scheduleId: PipelineScheduleId
  ): js.Promise[_] = js.native
  def takeOwnership(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    scheduleId: PipelineScheduleId
  ): js.Promise[_] = js.native
}

