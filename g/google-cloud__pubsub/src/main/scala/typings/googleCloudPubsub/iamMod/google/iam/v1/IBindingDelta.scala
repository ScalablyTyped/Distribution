package typings.googleCloudPubsub.iamMod.google.iam.v1

import typings.googleCloudPubsub.iamMod.google.`type`.IExpr
import typings.googleCloudPubsub.iamMod.google.iam.v1.BindingDelta.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BindingDelta. */
trait IBindingDelta extends js.Object {
  /** BindingDelta action */
  var action: js.UndefOr[Action | Null] = js.undefined
  /** BindingDelta condition */
  var condition: js.UndefOr[IExpr | Null] = js.undefined
  /** BindingDelta member */
  var member: js.UndefOr[String | Null] = js.undefined
  /** BindingDelta role */
  var role: js.UndefOr[String | Null] = js.undefined
}

object IBindingDelta {
  @scala.inline
  def apply(
    action: js.UndefOr[Null | Action] = js.undefined,
    condition: js.UndefOr[Null | IExpr] = js.undefined,
    member: js.UndefOr[Null | String] = js.undefined,
    role: js.UndefOr[Null | String] = js.undefined
  ): IBindingDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(condition)) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(member)) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBindingDelta]
  }
}

