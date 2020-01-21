package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a role within a Membership.
  */
@js.native
trait SchemaMembershipRole extends js.Object {
  /**
    * MembershipRole in string format.  Currently supported MembershipRoles:
    * `&quot;MEMBER&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaMembershipRole {
  @scala.inline
  def apply(name: String = null): SchemaMembershipRole = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMembershipRole]
  }
}

