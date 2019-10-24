package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesVersionMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Version", JSImport.Namespace)
@js.native
object distSrcCoreServicesVersionMod extends js.Object {
  @js.native
  trait Version extends BaseService {
    def show(): js.Promise[GetResponse] = js.native
    def show(options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Version
  
}

