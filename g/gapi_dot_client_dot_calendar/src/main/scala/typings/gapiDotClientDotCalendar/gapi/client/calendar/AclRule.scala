package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClientDotCalendar.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclRule extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Identifier of the ACL rule. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource ("calendar#aclRule"). */
  var kind: js.UndefOr[String] = js.undefined
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
  var role: js.UndefOr[String] = js.undefined
  /** The scope of the rule. */
  var scope: js.UndefOr[Anon_Type] = js.undefined
}

object AclRule {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    role: String = null,
    scope: Anon_Type = null
  ): AclRule = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclRule]
  }
}

