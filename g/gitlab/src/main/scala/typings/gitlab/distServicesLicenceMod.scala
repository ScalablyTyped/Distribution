package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesLicenceMod.Licence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Licence", JSImport.Namespace)
@js.native
object distServicesLicenceMod extends js.Object {
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

