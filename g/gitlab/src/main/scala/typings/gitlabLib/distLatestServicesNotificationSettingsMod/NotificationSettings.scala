package typings
package gitlabLib.distLatestServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  var EVENTS: gitlabLib.Anon_CLOSEISSUE = js.native
  var LEVELS: gitlabLib.Anon_CUSTOM = js.native
  def all(): js.Promise[_] = js.native
  def all(hasProjectIdGroupId: NotificationSettingsOptions): js.Promise[_] = js.native
  def edit(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    hasProjectIdGroupId: NotificationSettingsOptions
  ): js.Promise[_] = js.native
}

