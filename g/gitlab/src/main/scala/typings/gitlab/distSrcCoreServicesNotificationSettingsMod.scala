package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesNotificationSettingsMod.NotificationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/NotificationSettings", JSImport.Namespace)
@js.native
object distSrcCoreServicesNotificationSettingsMod extends js.Object {
  @js.native
  trait NotificationSettings extends BaseService {
    def all(
      hasProjectIdGroupIdOptions: (Anon_ProjectId_900947029 | Anon_GroupId_1178653170) with PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def edit(
      hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectId_900947029 | Anon_GroupId_1178653170) with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends NotificationSettings
  
}

