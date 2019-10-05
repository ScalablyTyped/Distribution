package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesApplicationSettingsMod.ApplicationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ApplicationSettings", JSImport.Namespace)
@js.native
object distServicesApplicationSettingsMod extends js.Object {
  @js.native
  trait ApplicationSettings extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: Sudo): js.Promise[GetResponse] = js.native
    def edit(): js.Promise[js.Object] = js.native
    def edit(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends ApplicationSettings
  
}

