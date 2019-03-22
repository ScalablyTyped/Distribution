package typings
package gitlabLib.distLatestServicesRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runners
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(): js.Promise[_] = js.native
  def all(hasProjectIdOptions: RunnersOptions): js.Promise[_] = js.native
  def allOwned(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def disable(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    runnerId: RunnerId
  ): js.Promise[_] = js.native
  def edit(runnerId: RunnerId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def enable(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    runnerId: RunnerId
  ): js.Promise[_] = js.native
  def jobs(runnerId: RunnerId): js.Promise[_] = js.native
  def remove(runnerId: RunnerId): js.Promise[_] = js.native
  def show(runnerId: RunnerId): js.Promise[_] = js.native
}

