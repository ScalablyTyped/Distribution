package typings.gitlab.distTypesCoreServicesNotificationSettingsMod

import typings.gitlab.Anon_GroupIdNumber
import typings.gitlab.Anon_Level
import typings.gitlab.Anon_ProjectIdNumber
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  def all(
    hasProjectIdGroupIdOptions: (Anon_ProjectIdNumber | Anon_GroupIdNumber) with PaginatedRequestOptions
  ): js.Promise[GetResponse] = js.native
  def edit(
    hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectIdNumber | Anon_GroupIdNumber) with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

