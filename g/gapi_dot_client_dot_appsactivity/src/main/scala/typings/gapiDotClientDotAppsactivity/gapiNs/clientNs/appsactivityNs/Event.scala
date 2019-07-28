package typings.gapiDotClientDotAppsactivity.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * Additional event types. Some events may have multiple types when multiple actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** The time at which the event occurred formatted as Unix time in milliseconds. */
  var eventTimeMillis: js.UndefOr[String] = js.undefined
  /** Whether this event is caused by a user being deleted. */
  var fromUserDeletion: js.UndefOr[Boolean] = js.undefined
  /** Extra information for move type events, such as changes in an object's parents. */
  var move: js.UndefOr[Move] = js.undefined
  /** Extra information for permissionChange type events, such as the user or group the new permission applies to. */
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.undefined
  /** The main type of event that occurred. */
  var primaryEventType: js.UndefOr[String] = js.undefined
  /** Extra information for rename type events, such as the old and new names. */
  var rename: js.UndefOr[Rename] = js.undefined
  /** Information specific to the Target object modified by the event. */
  var target: js.UndefOr[Target] = js.undefined
  /** Represents the user responsible for the event. */
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

