package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreServicesSearchMod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Search", JSImport.Namespace)
@js.native
object distSrcCoreServicesSearchMod extends js.Object {
  @js.native
  trait Search extends BaseService {
    def all(
      scope: String,
      search: String,
      hasProjectIdGroupIdOptions: Anon_GroupIdProjectId with BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Search
  
}

