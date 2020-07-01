package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the changes associated with an action taken by a user.
  */
@js.native
trait SchemaEvent extends js.Object {
  /**
    * Additional event types. Some events may have multiple types when multiple
    * actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time at which the event occurred formatted as Unix time in
    * milliseconds.
    */
  var eventTimeMillis: js.UndefOr[String] = js.native
  /**
    * Whether this event is caused by a user being deleted.
    */
  var fromUserDeletion: js.UndefOr[Boolean] = js.native
  /**
    * Extra information for move type events, such as changes in an
    * object&#39;s parents.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  /**
    * Extra information for permissionChange type events, such as the user or
    * group the new permission applies to.
    */
  var permissionChanges: js.UndefOr[js.Array[SchemaPermissionChange]] = js.native
  /**
    * The main type of event that occurred.
    */
  var primaryEventType: js.UndefOr[String] = js.native
  /**
    * Extra information for rename type events, such as the old and new names.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  /**
    * Information specific to the Target object modified by the event.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  /**
    * Represents the user responsible for the event.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(
    additionalEventTypes: js.Array[String] = null,
    eventTimeMillis: String = null,
    fromUserDeletion: js.UndefOr[Boolean] = js.undefined,
    move: SchemaMove = null,
    permissionChanges: js.Array[SchemaPermissionChange] = null,
    primaryEventType: String = null,
    rename: SchemaRename = null,
    target: SchemaTarget = null,
    user: SchemaUser = null
  ): SchemaEvent = {
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
    __obj.asInstanceOf[SchemaEvent]
  }
}

