package typings
package gitlabLib.distServicesTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, tagName: java.lang.String): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, tagName: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, tagName: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, tagName: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

