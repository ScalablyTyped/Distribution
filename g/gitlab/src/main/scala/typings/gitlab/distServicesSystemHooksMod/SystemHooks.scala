package typings.gitlab.distServicesSystemHooksMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.HookId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemHooks extends BaseService {
  def add(url: String): js.Promise[js.Object] = js.native
  def add(url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(): js.Promise[GetResponse] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(hookId: HookId, url: String): js.Promise[js.Object] = js.native
  def edit(hookId: HookId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(hookId: HookId): js.Promise[js.Object] = js.native
  def remove(hookId: HookId, options: Sudo): js.Promise[js.Object] = js.native
}

