package typings
package gitlabLib.distServicesEnvironmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, environmentId: gitlabLib.EnvironmentId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    environmentId: gitlabLib.EnvironmentId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, environmentId: gitlabLib.EnvironmentId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, environmentId: gitlabLib.EnvironmentId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def stop(projectId: gitlabLib.ProjectId, environmentId: gitlabLib.EnvironmentId): js.Promise[js.Object] = js.native
  def stop(projectId: gitlabLib.ProjectId, environmentId: gitlabLib.EnvironmentId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

