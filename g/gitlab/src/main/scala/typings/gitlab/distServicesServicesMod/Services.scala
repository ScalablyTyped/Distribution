package typings.gitlab.distServicesServicesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.SupportedService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends BaseService {
  def edit(projectId: ProjectId, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, serviceName: SupportedService): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, serviceName: SupportedService): js.Promise[GetResponse] = js.native
  def show(projectId: ProjectId, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
}

