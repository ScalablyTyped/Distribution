package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPolicyAssociation extends js.Object {
  /**
    * The resource that the security policy is attached to.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The name for an association.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The security policy ID of the association.
    */
  var securityPolicyId: js.UndefOr[String] = js.native
}

object Schema$SecurityPolicyAssociation {
  @scala.inline
  def apply(attachmentId: String = null, name: String = null, securityPolicyId: String = null): Schema$SecurityPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityPolicyId != null) __obj.updateDynamic("securityPolicyId")(securityPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyAssociation]
  }
}

