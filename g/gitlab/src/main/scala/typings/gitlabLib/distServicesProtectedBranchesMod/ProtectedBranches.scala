package typings
package gitlabLib.distServicesProtectedBranchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedBranches
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def protect(projectId: gitlabLib.ProjectId, branchName: java.lang.String): js.Promise[js.Object] = js.native
  def protect(
    projectId: gitlabLib.ProjectId,
    branchName: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, branchName: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, branchName: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def unprotect(projectId: gitlabLib.ProjectId, branchName: java.lang.String): js.Promise[js.Object] = js.native
  def unprotect(projectId: gitlabLib.ProjectId, branchName: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

