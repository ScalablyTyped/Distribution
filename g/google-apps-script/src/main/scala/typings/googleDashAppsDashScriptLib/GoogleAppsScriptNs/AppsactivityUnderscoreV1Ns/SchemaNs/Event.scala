package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var additionalEventTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var eventTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  var fromUserDeletion: js.UndefOr[scala.Boolean] = js.undefined
  var move: js.UndefOr[Move] = js.undefined
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.undefined
  var primaryEventType: js.UndefOr[java.lang.String] = js.undefined
  var rename: js.UndefOr[Rename] = js.undefined
  var target: js.UndefOr[Target] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    additionalEventTypes: js.Array[java.lang.String] = null,
    eventTimeMillis: java.lang.String = null,
    fromUserDeletion: js.UndefOr[scala.Boolean] = js.undefined,
    move: Move = null,
    permissionChanges: js.Array[PermissionChange] = null,
    primaryEventType: java.lang.String = null,
    rename: Rename = null,
    target: Target = null,
    user: User = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (additionalEventTypes != null) __obj.updateDynamic("additionalEventTypes")(additionalEventTypes)
    if (eventTimeMillis != null) __obj.updateDynamic("eventTimeMillis")(eventTimeMillis)
    if (!js.isUndefined(fromUserDeletion)) __obj.updateDynamic("fromUserDeletion")(fromUserDeletion)
    if (move != null) __obj.updateDynamic("move")(move)
    if (permissionChanges != null) __obj.updateDynamic("permissionChanges")(permissionChanges)
    if (primaryEventType != null) __obj.updateDynamic("primaryEventType")(primaryEventType)
    if (rename != null) __obj.updateDynamic("rename")(rename)
    if (target != null) __obj.updateDynamic("target")(target)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Event]
  }
}

