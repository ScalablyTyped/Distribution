package typings
package gitlabLib.distServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    hasProjectIdGroupIdOptions: (gitlabLib.Anon_ProjectId_1556160014 | gitlabLib.Anon_GroupId_373224993) with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(
    hasProjectIdGroupIdOptions: gitlabLib.Anon_Level with (gitlabLib.Anon_ProjectId_1556160014 | gitlabLib.Anon_GroupId_373224993) with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

