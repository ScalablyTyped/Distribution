package typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.undefined
  var eventTimeMillis: js.UndefOr[String] = js.undefined
  var fromUserDeletion: js.UndefOr[Boolean] = js.undefined
  var move: js.UndefOr[Move] = js.undefined
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.undefined
  var primaryEventType: js.UndefOr[String] = js.undefined
  var rename: js.UndefOr[Rename] = js.undefined
  var target: js.UndefOr[Target] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    additionalEventTypes: js.Array[String] = null,
    eventTimeMillis: String = null,
    fromUserDeletion: js.UndefOr[Boolean] = js.undefined,
    move: Move = null,
    permissionChanges: js.Array[PermissionChange] = null,
    primaryEventType: String = null,
    rename: Rename = null,
    target: Target = null,
    user: User = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (additionalEventTypes != null) __obj.updateDynamic("additionalEventTypes")(additionalEventTypes.asInstanceOf[js.Any])
    if (eventTimeMillis != null) __obj.updateDynamic("eventTimeMillis")(eventTimeMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fromUserDeletion)) __obj.updateDynamic("fromUserDeletion")(fromUserDeletion.get.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (permissionChanges != null) __obj.updateDynamic("permissionChanges")(permissionChanges.asInstanceOf[js.Any])
    if (primaryEventType != null) __obj.updateDynamic("primaryEventType")(primaryEventType.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

