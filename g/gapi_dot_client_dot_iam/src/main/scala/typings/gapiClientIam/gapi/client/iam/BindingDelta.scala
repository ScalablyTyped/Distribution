package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingDelta extends js.Object {
  /**
    * The action that was performed on a Binding.
    * Required
    */
  var action: js.UndefOr[String] = js.native
  /**
    * The condition that is associated with this binding.
    * This field is GOOGLE_INTERNAL.
    * This field is not logged in IAM side because it's only for audit logging.
    * Optional
    */
  var condition: js.UndefOr[Expr] = js.native
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members.
    * Required
    */
  var member: js.UndefOr[String] = js.native
  /**
    * Role that is assigned to `members`.
    * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    * Required
    */
  var role: js.UndefOr[String] = js.native
}

object BindingDelta {
  @scala.inline
  def apply(): BindingDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingDelta]
  }
  @scala.inline
  implicit class BindingDeltaOps[Self <: BindingDelta] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCondition(value: Expr): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setMember(value: String): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

