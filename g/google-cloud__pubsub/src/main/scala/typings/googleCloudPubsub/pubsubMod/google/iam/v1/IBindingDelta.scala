package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import typings.googleCloudPubsub.pubsubMod.google.`type`.IExpr
import typings.googleCloudPubsub.pubsubMod.google.iam.v1.BindingDelta.Action
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
  def apply(action: Action = null, condition: IExpr = null, member: String = null, role: String = null): IBindingDelta = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBindingDelta]
  }
}

