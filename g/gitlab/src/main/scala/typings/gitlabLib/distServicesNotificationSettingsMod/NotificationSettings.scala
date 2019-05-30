package typings
package gitlabLib.distServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    hasProjectIdGroupIdOptions: (gitlabLib.Anon_ProjectId_1917859966 | gitlabLib.Anon_GroupId) with gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(
    hasProjectIdGroupIdOptions: gitlabLib.Anon_Level with (gitlabLib.Anon_ProjectId_1917859966 | gitlabLib.Anon_GroupId) with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

