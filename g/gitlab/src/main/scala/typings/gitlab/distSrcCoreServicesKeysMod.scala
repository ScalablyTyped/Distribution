package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesKeysMod.Keys
import typings.gitlab.distSrcCoreServicesMod.KeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Keys", JSImport.Namespace)
@js.native
object distSrcCoreServicesKeysMod extends js.Object {
  @js.native
  trait Keys extends BaseService {
    def show(keyId: KeyId): js.Promise[GetResponse] = js.native
    def show(keyId: KeyId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Keys
  
}

