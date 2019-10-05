package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesVersionMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Version", JSImport.Namespace)
@js.native
object distServicesVersionMod extends js.Object {
  @js.native
  trait Version extends BaseService {
    def show(): js.Promise[GetResponse] = js.native
    def show(options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Version
  
}

