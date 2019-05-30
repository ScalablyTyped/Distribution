package typings
package gitlabLib.distServicesTodosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Todos
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId, mergerequestId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, mergerequestId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def done(hasTodoIdOptions: gitlabLib.Anon_TodoId with gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

