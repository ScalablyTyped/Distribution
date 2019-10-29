package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", JSImport.Namespace)
@js.native
object distTypesCoreServicesNotificationSettingsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.disabled
    - typings.gitlab.gitlabStrings.participating
    - typings.gitlab.gitlabStrings.watch
    - typings.gitlab.gitlabStrings.global
    - typings.gitlab.gitlabStrings.mention
    - typings.gitlab.gitlabStrings.custom
  */
  trait NotificationSettingLevel extends js.Object
  
  @js.native
  class NotificationSettings () extends BaseService {
    def all(
      hasProjectIdGroupIdOptions: (Anon_ProjectIdNumber | Anon_GroupIdNumber) with PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def edit(
      hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectIdNumber | Anon_GroupIdNumber) with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
  }
  
}

