package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AclRule extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier of the ACL rule. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource ("calendar#aclRule"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The role assigned to the scope. Possible values are:
               * - "none" - Provides no access.
               * - "freeBusyReader" - Provides read access to free/busy information.
               * - "reader" - Provides read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
               * - "writer" - Provides read and write access to the calendar. Private events will appear to users with writer access, and event details will be visible.
               *
               * - "owner" - Provides ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and
               * manipulate ACLs.
               */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** The scope of the rule. */
  var scope: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Type] = js.undefined
}

