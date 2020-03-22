package typings.gitlab.notificationSettingsMod

import typings.gitlab.Anon0
import typings.gitlab.Anon1
import typings.gitlab.AnonLevel
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  def all(hasProjectIdGroupIdOptions: (Anon0 | Anon1) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(hasProjectIdGroupIdOptions: AnonLevel with (Anon0 | Anon1) with BaseRequestOptions): js.Promise[js.Object] = js.native
}

