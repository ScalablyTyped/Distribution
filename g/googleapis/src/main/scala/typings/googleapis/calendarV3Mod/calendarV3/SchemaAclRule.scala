package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapis.AnonTypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAclRule extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifier of the ACL rule.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#aclRule&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The role assigned to the scope. Possible values are:   - &quot;none&quot;
    * - Provides no access.  - &quot;freeBusyReader&quot; - Provides read
    * access to free/busy information.  - &quot;reader&quot; - Provides read
    * access to the calendar. Private events will appear to users with reader
    * access, but event details will be hidden.  - &quot;writer&quot; -
    * Provides read and write access to the calendar. Private events will
    * appear to users with writer access, and event details will be visible.  -
    * &quot;owner&quot; - Provides ownership of the calendar. This role has all
    * of the permissions of the writer role with the additional ability to see
    * and manipulate ACLs.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The scope of the rule.
    */
  var scope: js.UndefOr[AnonTypeValue] = js.native
}

object SchemaAclRule {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    role: String = null,
    scope: AnonTypeValue = null
  ): SchemaAclRule = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAclRule]
  }
}

