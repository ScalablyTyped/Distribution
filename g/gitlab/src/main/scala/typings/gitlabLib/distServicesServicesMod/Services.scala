package typings
package gitlabLib.distServicesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services
  extends gitlabLib.distInfrastructureMod.BaseService {
  def edit(projectId: gitlabLib.ProjectId, serviceName: gitlabLib.SupportedService): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    serviceName: gitlabLib.SupportedService,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, serviceName: gitlabLib.SupportedService): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, serviceName: gitlabLib.SupportedService, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, serviceName: gitlabLib.SupportedService): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, serviceName: gitlabLib.SupportedService, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

