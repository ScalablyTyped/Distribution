package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingDelta extends js.Object {
  /**
    * The action that was performed on a Binding.
    * Required
    */
  var action: js.UndefOr[String] = js.undefined
  /**
    * The condition that is associated with this binding.
    * This field is GOOGLE_INTERNAL.
    * This field is not logged in IAM side because it's only for audit logging.
    * Optional
    */
  var condition: js.UndefOr[Expr] = js.undefined
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members.
    * Required
    */
  var member: js.UndefOr[String] = js.undefined
  /**
    * Role that is assigned to `members`.
    * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    * Required
    */
  var role: js.UndefOr[String] = js.undefined
}

object BindingDelta {
  @scala.inline
  def apply(action: String = null, condition: Expr = null, member: String = null, role: String = null): BindingDelta = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (member != null) __obj.updateDynamic("member")(member)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[BindingDelta]
  }
}

