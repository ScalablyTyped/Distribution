package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapis.anon.Value
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
  var scope: js.UndefOr[Value] = js.native
}

object SchemaAclRule {
  @scala.inline
  def apply(): SchemaAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclRule]
  }
  @scala.inline
  implicit class SchemaAclRuleOps[Self <: SchemaAclRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setScope(value: Value): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

