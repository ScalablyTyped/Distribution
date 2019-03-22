package typings
package gitlabLib.distEs5ServicesTodosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Todos
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId
  ): js.Promise[_] = js.native
  def done(hasTodoId: TodosOptions): js.Promise[_] = js.native
}

