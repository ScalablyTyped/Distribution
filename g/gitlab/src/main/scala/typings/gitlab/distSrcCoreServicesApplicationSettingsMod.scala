package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesApplicationSettingsMod.ApplicationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ApplicationSettings", JSImport.Namespace)
@js.native
object distSrcCoreServicesApplicationSettingsMod extends js.Object {
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

