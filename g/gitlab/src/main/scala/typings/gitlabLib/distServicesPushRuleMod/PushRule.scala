package typings
package gitlabLib.distServicesPushRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushRule
  extends gitlabLib.distInfrastructureMod.BaseService {
  def create(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    hasUpsertOptions: gitlabLib.Anon_Upsert with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

