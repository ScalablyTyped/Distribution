package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesLicenceMod.Licence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Licence", JSImport.Namespace)
@js.native
object distSrcCoreServicesLicenceMod extends js.Object {
  @js.native
  trait Licence extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    def create(): js.Promise[js.Object] = js.native
    def create(options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Licence
  
}

