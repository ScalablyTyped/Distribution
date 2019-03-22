package typings
package gitlabLib.distLatestServicesSystemHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemHooks
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def add(url: java.lang.String, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def all(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(
    hookId: HookId,
    url: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hookId: HookId
  ): js.Promise[_] = js.native
}

