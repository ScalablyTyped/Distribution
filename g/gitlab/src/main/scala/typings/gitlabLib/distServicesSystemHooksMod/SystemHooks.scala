package typings
package gitlabLib.distServicesSystemHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemHooks
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(url: java.lang.String): js.Promise[js.Object] = js.native
  def add(url: java.lang.String, options: gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(hookId: gitlabLib.distServicesMod.HookId, url: java.lang.String): js.Promise[js.Object] = js.native
  def edit(
    hookId: gitlabLib.distServicesMod.HookId,
    url: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(hookId: gitlabLib.distServicesMod.HookId): js.Promise[js.Object] = js.native
  def remove(hookId: gitlabLib.distServicesMod.HookId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
}

