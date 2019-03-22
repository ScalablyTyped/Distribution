package typings
package gitlabLib.distEs5ServicesPipelineScheduleVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineScheduleVariables
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineScheduleId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PipelineScheduleId */ js.Any
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineScheduleId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PipelineScheduleId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineScheduleId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PipelineScheduleId */ js.Any,
    keyId: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineScheduleId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PipelineScheduleId */ js.Any,
    keyId: java.lang.String
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    pipelineScheduleId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PipelineScheduleId */ js.Any,
    keyId: java.lang.String
  ): js.Promise[_] = js.native
}

