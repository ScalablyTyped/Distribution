package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesFeatureFlagsMod.FeatureFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/FeatureFlags", JSImport.Namespace)
@js.native
object distServicesFeatureFlagsMod extends js.Object {
  @js.native
  trait FeatureFlags extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def set(name: String): js.Promise[js.Object] = js.native
    def set(name: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends FeatureFlags
  
}

