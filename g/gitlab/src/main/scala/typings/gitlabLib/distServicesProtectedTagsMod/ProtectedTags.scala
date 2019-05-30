package typings
package gitlabLib.distServicesProtectedTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedTags
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def protect(projectId: gitlabLib.ProjectId, tagName: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, tagName: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def unprotect(projectId: gitlabLib.ProjectId, tagName: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

