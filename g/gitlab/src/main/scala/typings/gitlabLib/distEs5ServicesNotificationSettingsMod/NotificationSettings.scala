package typings
package gitlabLib.distEs5ServicesNotificationSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  var EVENTS: gitlabLib.Anon_CLOSEISSUE = js.native
  var LEVELS: gitlabLib.Anon_CUSTOM = js.native
  def all(): js.Promise[_] = js.native
  def all(hasProjectIdGroupId: NotificationSettingsOptions): js.Promise[_] = js.native
  def edit(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions,
    hasProjectIdGroupId: NotificationSettingsOptions
  ): js.Promise[_] = js.native
}

