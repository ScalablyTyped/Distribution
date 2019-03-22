package typings
package gitlabLib.distEs5ServicesRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runners
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(): js.Promise[_] = js.native
  def all(hasProjectIdOptions: RunnersOptions): js.Promise[_] = js.native
  def allOwned(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def disable(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    runnerId: RunnerId
  ): js.Promise[_] = js.native
  def edit(runnerId: RunnerId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def enable(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    runnerId: RunnerId
  ): js.Promise[_] = js.native
  def jobs(runnerId: RunnerId): js.Promise[_] = js.native
  def remove(runnerId: RunnerId): js.Promise[_] = js.native
  def show(runnerId: RunnerId): js.Promise[_] = js.native
}

