package typings
package gitlabLib.distServicesDeploymentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployments
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, deploymentId: gitlabLib.DeploymentId): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, deploymentId: gitlabLib.DeploymentId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

