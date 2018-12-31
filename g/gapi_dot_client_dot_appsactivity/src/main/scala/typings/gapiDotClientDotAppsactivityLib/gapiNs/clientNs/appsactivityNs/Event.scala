package typings
package gapiDotClientDotAppsactivityLib.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * Additional event types. Some events may have multiple types when multiple actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The time at which the event occurred formatted as Unix time in milliseconds. */
  var eventTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this event is caused by a user being deleted. */
  var fromUserDeletion: js.UndefOr[scala.Boolean] = js.undefined
  /** Extra information for move type events, such as changes in an object's parents. */
  var move: js.UndefOr[Move] = js.undefined
  /** Extra information for permissionChange type events, such as the user or group the new permission applies to. */
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.undefined
  /** The main type of event that occurred. */
  var primaryEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Extra information for rename type events, such as the old and new names. */
  var rename: js.UndefOr[Rename] = js.undefined
  /** Information specific to the Target object modified by the event. */
  var target: js.UndefOr[Target] = js.undefined
  /** Represents the user responsible for the event. */
  var user: js.UndefOr[User] = js.undefined
}

