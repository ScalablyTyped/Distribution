package typings
package gitlabLib.distServicesSystemHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemHooks
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(url: java.lang.String): js.Promise[js.Object] = js.native
  def add(url: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(hookId: gitlabLib.HookId, url: java.lang.String): js.Promise[js.Object] = js.native
  def edit(hookId: gitlabLib.HookId, url: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(hookId: gitlabLib.HookId): js.Promise[js.Object] = js.native
  def remove(hookId: gitlabLib.HookId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

