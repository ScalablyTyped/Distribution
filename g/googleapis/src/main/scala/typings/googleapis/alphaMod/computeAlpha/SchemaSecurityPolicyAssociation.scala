package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyAssociation extends js.Object {
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

object SchemaSecurityPolicyAssociation {
  @scala.inline
  def apply(): SchemaSecurityPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAssociation]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyAssociationOps[Self <: SchemaSecurityPolicyAssociation] (val x: Self) extends AnyVal {
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
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSecurityPolicyId(value: String): Self = this.set("securityPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPolicyId: Self = this.set("securityPolicyId", js.undefined)
  }
  
}

