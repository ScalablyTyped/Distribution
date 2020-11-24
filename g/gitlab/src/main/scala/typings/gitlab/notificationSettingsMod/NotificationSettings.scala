package typings.gitlab.notificationSettingsMod

import typings.gitlab.anon.Level
import typings.gitlab.anon.`0`
import typings.gitlab.anon.`1`
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  
  def all(hasProjectIdGroupIdOptions: (`0` | `1`) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  
  def edit(hasProjectIdGroupIdOptions: Level with (`0` | `1`) with BaseRequestOptions): js.Promise[js.Object] = js.native
}
