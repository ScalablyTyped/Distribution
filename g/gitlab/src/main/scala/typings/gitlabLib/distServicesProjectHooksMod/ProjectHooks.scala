package typings
package gitlabLib.distServicesProjectHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectHooks
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(projectId: gitlabLib.ProjectId, url: java.lang.String): js.Promise[js.Object] = js.native
  def add(projectId: gitlabLib.ProjectId, url: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(projectId: gitlabLib.ProjectId, hookId: gitlabLib.HookId, url: java.lang.String): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    hookId: gitlabLib.HookId,
    url: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, hookId: gitlabLib.HookId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, hookId: gitlabLib.HookId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, hookId: gitlabLib.HookId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, hookId: gitlabLib.HookId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

