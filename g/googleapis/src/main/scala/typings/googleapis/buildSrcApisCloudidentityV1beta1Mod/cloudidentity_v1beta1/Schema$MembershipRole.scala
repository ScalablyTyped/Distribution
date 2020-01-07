package typings.googleapis.buildSrcApisCloudidentityV1beta1Mod.cloudidentity_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a role within a Membership.
  */
@js.native
trait Schema$MembershipRole extends js.Object {
  /**
    * MembershipRole in string format.  Currently supported MembershipRoles:
    * `&quot;MEMBER&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$MembershipRole {
  @scala.inline
  def apply(name: String = null): Schema$MembershipRole = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MembershipRole]
  }
}

