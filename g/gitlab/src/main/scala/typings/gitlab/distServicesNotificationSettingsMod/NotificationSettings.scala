package typings.gitlab.distServicesNotificationSettingsMod

import typings.gitlab.Anon_GroupId_373224993
import typings.gitlab.Anon_Level
import typings.gitlab.Anon_ProjectId_1556160014
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings extends BaseService {
  def all(
    hasProjectIdGroupIdOptions: (Anon_ProjectId_1556160014 | Anon_GroupId_373224993) with PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(
    hasProjectIdGroupIdOptions: Anon_Level with (Anon_ProjectId_1556160014 | Anon_GroupId_373224993) with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

