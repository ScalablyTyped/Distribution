package typings
package gitlabLib.distServicesDeployKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployKeys
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def add(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def enable(projectId: gitlabLib.ProjectId, keyId: gitlabLib.KeyId): js.Promise[js.Object] = js.native
  def enable(projectId: gitlabLib.ProjectId, keyId: gitlabLib.KeyId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, keyId: gitlabLib.KeyId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, keyId: gitlabLib.KeyId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

