package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distServicesSearchMod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Search", JSImport.Namespace)
@js.native
object distServicesSearchMod extends js.Object {
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

