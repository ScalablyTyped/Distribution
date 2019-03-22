package typings
package gitlabLib.distLatestServicesTodosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Todos
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: gitlabLib.distLatestServicesMergeRequestsMod.MergeRequestId
  ): js.Promise[_] = js.native
  def done(hasTodoId: TodosOptions): js.Promise[_] = js.native
}

