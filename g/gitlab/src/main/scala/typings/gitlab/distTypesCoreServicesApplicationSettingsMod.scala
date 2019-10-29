package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ApplicationSettings", JSImport.Namespace)
@js.native
object distTypesCoreServicesApplicationSettingsMod extends js.Object {
  @js.native
  class ApplicationSettings () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    def edit(): js.Promise[js.Object] = js.native
    def edit(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
}

