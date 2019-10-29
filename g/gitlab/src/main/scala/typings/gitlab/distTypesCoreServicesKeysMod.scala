package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Keys", JSImport.Namespace)
@js.native
object distTypesCoreServicesKeysMod extends js.Object {
  @js.native
  class Keys () extends BaseService {
    def show(keyId: String): js.Promise[GetResponse] = js.native
    def show(keyId: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

