package typings
package gitlabLib.distServicesRepositoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repositories
  extends gitlabLib.distInfrastructureMod.BaseService {
  def compare(projectId: gitlabLib.ProjectId, from: java.lang.String, to: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def compare(
    projectId: gitlabLib.ProjectId,
    from: java.lang.String,
    to: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def contributors(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def contributors(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showArchive(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def showArchive(projectId: gitlabLib.ProjectId, options: gitlabLib.Anon_ShaString with gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showBlob(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def showBlob(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def showBlobRaw(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def showBlobRaw(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def tree(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def tree(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

