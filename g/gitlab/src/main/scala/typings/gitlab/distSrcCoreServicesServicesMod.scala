package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesMod.SupportedService
import typings.gitlab.distSrcCoreServicesServicesMod.Services
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Services", JSImport.Namespace)
@js.native
object distSrcCoreServicesServicesMod extends js.Object {
  @js.native
  trait Services extends BaseService {
    def edit(projectId: ProjectId, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Services
  
}

