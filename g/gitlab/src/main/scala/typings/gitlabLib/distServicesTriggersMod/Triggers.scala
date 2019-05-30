package typings
package gitlabLib.distServicesTriggersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Triggers
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def add(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(projectId: gitlabLib.ProjectId, triggerId: gitlabLib.TriggerId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    triggerId: gitlabLib.TriggerId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def pipeline(projectId: gitlabLib.ProjectId, ref: java.lang.String, token: java.lang.String): js.Promise[js.Object] = js.native
  def pipeline(
    projectId: gitlabLib.ProjectId,
    ref: java.lang.String,
    token: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, triggerId: gitlabLib.TriggerId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, triggerId: gitlabLib.TriggerId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, triggerId: gitlabLib.TriggerId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, triggerId: gitlabLib.TriggerId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

