package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Runners", JSImport.Namespace)
@js.native
object distTypesCoreServicesRunnersMod extends js.Object {
  @js.native
  class Runners () extends BaseService {
    def all(hasProjectIdOptions: Anon_ProjectIdNumber with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allOwned(): js.Promise[GetResponse] = js.native
    def allOwned(options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def disable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def edit(runnerId: Double): js.Promise[js.Object] = js.native
    def edit(runnerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def enable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def jobs(runnerId: Double): js.Promise[GetResponse] = js.native
    def jobs(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(runnerId: Double): js.Promise[js.Object] = js.native
    def remove(runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(runnerId: Double): js.Promise[GetResponse] = js.native
    def show(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

