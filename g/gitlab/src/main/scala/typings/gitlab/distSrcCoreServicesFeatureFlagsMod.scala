package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesFeatureFlagsMod.FeatureFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/FeatureFlags", JSImport.Namespace)
@js.native
object distSrcCoreServicesFeatureFlagsMod extends js.Object {
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

