package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesNotificationSettingsMod.NotificationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/NotificationSettings", JSImport.Namespace)
@js.native
object distServicesNotificationSettingsMod extends js.Object {
  @js.native
  trait NotificationSettings extends BaseService {
    def all(
      hasProjectIdGroupIdOptions: (Anon_ProjectId_1099524987 | Anon_GroupId_1043297548) with PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def edit(
      hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectId_1099524987 | Anon_GroupId_1043297548) with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends NotificationSettings
  
}

