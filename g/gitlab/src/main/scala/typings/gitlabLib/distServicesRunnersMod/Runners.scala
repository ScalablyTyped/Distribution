package typings
package gitlabLib.distServicesRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runners
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(hasProjectIdOptions: gitlabLib.Anon_ProjectId_1917859966 with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def allOwned(): js.Promise[gitlabLib.GetResponse] = js.native
  def allOwned(options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def disable(projectId: gitlabLib.ProjectId, runnerId: gitlabLib.RunnerId): js.Promise[js.Object] = js.native
  def disable(projectId: gitlabLib.ProjectId, runnerId: gitlabLib.RunnerId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def edit(runnerId: gitlabLib.RunnerId): js.Promise[js.Object] = js.native
  def edit(runnerId: gitlabLib.RunnerId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def enable(projectId: gitlabLib.ProjectId, runnerId: gitlabLib.RunnerId): js.Promise[js.Object] = js.native
  def enable(projectId: gitlabLib.ProjectId, runnerId: gitlabLib.RunnerId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def jobs(runnerId: gitlabLib.RunnerId): js.Promise[gitlabLib.GetResponse] = js.native
  def jobs(runnerId: gitlabLib.RunnerId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(runnerId: gitlabLib.RunnerId): js.Promise[js.Object] = js.native
  def remove(runnerId: gitlabLib.RunnerId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(runnerId: gitlabLib.RunnerId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(runnerId: gitlabLib.RunnerId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

